package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable {
    private List<Observer> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
          this.subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
           this.subscribers.remove(observer);
    }

    @Override
    public void notifyChanges(String title) {
        System.out.println(String.format("%s video uploaded",title));
        for(Observer observer:this.subscribers){
            observer.notified(title);
        }
    }
}
