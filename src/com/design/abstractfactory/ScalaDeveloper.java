package com.design.abstractfactory;

public class ScalaDeveloper implements Employee {
    @Override
    public int getSalary() {
        System.out.println("returning scala developer salary");
        return 34000;
    }

    @Override
    public String getName() {
        return "SCALA DEVELOPER";
    }
}
