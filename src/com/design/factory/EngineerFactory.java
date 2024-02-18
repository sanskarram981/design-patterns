package com.design.factory;

public class EngineerFactory {
    public EngineerFactory(){

    }
    public static Engineer getEngineer(String type){
        if(type.trim().equalsIgnoreCase("data engineer")) {
            return new DataEngineer();
        }
        else if(type.trim().equalsIgnoreCase("ml engineer")) {
            return new MLEngineer();
        }
        else if(type.trim().equalsIgnoreCase("qa engineer")) {
            return new QAEngineer();
        }
        else {
            return null;
        }
    }
}
