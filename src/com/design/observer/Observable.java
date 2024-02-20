package com.design.observer;

public interface Observable {
    public void subscribe(Observer observer);
    public  void unsubscribe(Observer observer);
    public void notifyChanges(String title);
}
