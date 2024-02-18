package com.design.abstractfactory;

public class PythonDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee getEmployee() {
        return new PythonDeveloper();
    }
}
