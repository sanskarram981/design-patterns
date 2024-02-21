package com.design.solid.interfacesegmented;

public class Waiter implements WaiterInterface {
    @Override
    public void takeOrder() {
        System.out.println("waiter takes order");
    }

    @Override
    public void serveOrder() {
        System.out.println("waiter serve order");
    }
}
