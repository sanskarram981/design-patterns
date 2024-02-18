package com.design.factory;

public class DataEngineer implements Engineer {
    @Override
    public int getSalary() {
        System.out.println("returning salary of data engineer");
        return 14000;
    }
}
