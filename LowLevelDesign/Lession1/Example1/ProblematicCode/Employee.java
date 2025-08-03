package LowLevelDesign.Lession1.Example1.ProblematicCode;

/*
 Issues with this Employee class:
 1. This class is trying to do too many things.
 2. There are too many reasons to update the code, in
    a. Salary computation supposes for any tax/budget change we need to make appropriate changes in the computeSalary method.
    b. Suppose we are initially storing employee data in a database, but later we decide to switch to a file system or an API, we will have to change the updateEmployee and fetchEmployeeData methods.
    c. The printPerformanceReport method is also something we need to change if we decide to change the reporting format or the way we handle performance reports.

 ==> This violates the Single Responsibility Principle (SRP) of SOLID principles.

 Single Responsibility Principle states that there should be one and only one reason for a piece of code to change
*/

// This code is an example of a Monster class that violates the Single Responsibility Principle (SRP). A monster class is a class that has too many responsibilities, making it difficult to maintain and extend.

public class Employee {
    private final int id;  // Employee ID
    private final String name;  // Employee Name
    private final String address;  // Employee Address

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = "Not available";
    }

    public void printPerformanceReport() {
        System.out.println("Performance Report for Employee: " + name);
    }

    public double computeSalary() {
        return 50000.0;  // fixed salary
    }

    public void updateEmployee() {
        System.out.println("Employee data updated successfully.");
    }

    public void fetchEmployeeData() {
        System.out.println("Fetching employee data for: " + name);
    }

}
