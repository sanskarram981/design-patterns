package com.design.adapter;

public class IPhone {
    private AppleCharger appleCharger;

    public IPhone(AppleCharger appleCharger){
        this.appleCharger = appleCharger;
    }

    public void chargePhone(){
        this.appleCharger.chargePhone();
    }
}
