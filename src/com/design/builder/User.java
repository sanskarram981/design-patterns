package com.design.builder;

public class User {
    private final int userId;
    private final String userName;
    private final String userAddress;

    private User(UserBuilder userBuilder){
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.userAddress = userBuilder.userAddress;
    }

    public static UserBuilder getBuilder(){
        return new UserBuilder();
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }

    public static  class UserBuilder {
        private int userId;
        private String userName;
        private String userAddress;

        public UserBuilder(){

        }

        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserAddress(String userAddress) {
            this.userAddress = userAddress;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
