package com.design.iterator;

import java.util.List;

public class CustomIteratorImpl implements CustomIterator {
    private List<User> userList;
    private int length;
    private int position;
    public CustomIteratorImpl(List<User> userList) {
        this.userList = userList;
        this.length = userList.size();
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.length;
    }

    @Override
    public Object next() {
        User user = this.userList.get(this.position);
        this.position++;
        return user;
    }
}
