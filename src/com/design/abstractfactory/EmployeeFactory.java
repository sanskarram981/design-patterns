package com.design.abstractfactory;

public class EmployeeFactory {
    public EmployeeFactory(){

    }
    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory){
        return employeeAbstractFactory.getEmployee();
    }
}
