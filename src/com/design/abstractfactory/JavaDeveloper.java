package com.design.abstractfactory;

public class JavaDeveloper implements Employee {
    @Override
    public int getSalary() {
        System.out.println("returning java developer salary");
        return 50000;
    }

    @Override
    public String getName() {
        return "JAVA DEVELOPER";
    }
}
