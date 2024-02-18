package com.design.abstractfactory;

public class JavaDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee getEmployee() {
        return new JavaDeveloper();
    }
}
