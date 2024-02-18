package com.design.factory;

import com.design.factory.Engineer;

public class MLEngineer implements Engineer {
    @Override
    public int getSalary() {
        System.out.println("returning salary of ml engineer");
        return 9000;
    }
}
