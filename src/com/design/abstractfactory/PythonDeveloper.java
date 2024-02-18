package com.design.abstractfactory;

public class PythonDeveloper implements Employee {
    @Override
    public int getSalary() {
        System.out.println("returning python developer salary");
        return 45000;
    }

    @Override
    public String getName() {
        return "PYTHON DEVELOPER";
    }
}
