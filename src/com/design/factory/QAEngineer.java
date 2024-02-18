package com.design.factory;

import com.design.factory.Engineer;

public class QAEngineer implements Engineer {
    @Override
    public int getSalary() {
        System.out.println("returning salary of qa engineer");
        return 6000;
    }
}
