package com.design.adapter;

public class AdapterCharger implements AppleCharger {

    private AndroidCharger androidCharger;
    public AdapterCharger(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }
    @Override
    public void chargePhone() {
        System.out.println("Adapter is used to convert android charging behaviour to achieve iphone charging behaviour");
        this.androidCharger.chargePhone();
    }
}
