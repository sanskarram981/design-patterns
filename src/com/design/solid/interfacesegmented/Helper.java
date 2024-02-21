package com.design.solid.interfacesegmented;

public class Helper implements HelperInterface {
    @Override
    public void pickPlates() {
        System.out.println("helper pick plates");
    }

    @Override
    public void washPlates() {
        System.out.println("helper wash plates");
    }
}
