package Core.LLD.Lession1.Example1.BetterCode;

// This code is a refactored version of the Employee class that adheres to the Single Responsibility Principle (SRP).
// The class now focuses solely on representing an employee's data, while other responsibilities such as salary computation, data fetching, and reporting are handled by separate classes or methods.


// The current code only handles employee data representation and management.

public class Employee {
    private final int id;  // Employee ID
    private final String name;  // Employee Name
    private String address;  // Employee Address

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = "Not available";
    }

    public int getEmployeeId() {
        return id;
    }

    public String getEmployeeName() {
        return name;
    }

    public String getEmployeeAddress() {
        return address;
    }

    public void setEmployeeAddress(String address) {
        this.address = address;
    }

}
