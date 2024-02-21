package com.design.solid.liskov;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("car engine is started");
    }

    @Override
    public void accelerate() {
        System.out.println("car is accelerating");
    }
}
