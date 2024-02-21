package com.design.solid.interfacesegmented;

public class Chef implements ChefInterface {
    @Override
    public void prepareOrder() {
        System.out.println("chef preparing order");
    }

    @Override
    public void prepareMenu() {
        System.out.println("chef preparing menu");
    }
}
