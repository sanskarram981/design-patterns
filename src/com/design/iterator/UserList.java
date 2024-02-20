package com.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> userList = new ArrayList<>();

    public void add(User user){
        this.userList.add(user);
    }

    public void remove(User user){
        this.userList.remove(user);
    }

    public CustomIterator iterator(){
        return new CustomIteratorImpl(this.userList);
    }
}
