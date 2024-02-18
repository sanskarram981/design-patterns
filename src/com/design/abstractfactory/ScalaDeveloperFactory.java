package com.design.abstractfactory;

public class ScalaDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee getEmployee() {
        return new ScalaDeveloper();
    }
}
