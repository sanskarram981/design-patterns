package com.design.observer;

import java.util.Objects;

public class Subscriber implements Observer {
    private final String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void notified(String title) {
        System.out.println(String.format("Hey %s new video is uploaded : %s",this.name,title));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(name, that.name);
    }
}
