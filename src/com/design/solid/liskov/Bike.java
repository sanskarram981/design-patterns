package com.design.solid.liskov;

public class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("bike engine is started");
    }

    @Override
    public void accelerate() {
        System.out.println("bike is accelerating");
    }
}
