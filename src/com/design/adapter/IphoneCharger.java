package com.design.adapter;

import java.sql.SQLOutput;

public class IphoneCharger implements AppleCharger {
    @Override
    public void chargePhone() {
        System.out.println("IphoneCharger is charging the phone");
    }
}
