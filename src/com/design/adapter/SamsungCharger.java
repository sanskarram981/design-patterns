package com.design.adapter;

public class SamsungCharger implements AndroidCharger {
    @Override
    public void chargePhone() {
        System.out.println("SamsungCharger is charging the phone");
    }
}
