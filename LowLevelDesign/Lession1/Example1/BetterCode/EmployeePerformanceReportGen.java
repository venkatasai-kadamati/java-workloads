package LowLevelDesign.Lession1.Example1.BetterCode;


// This code is a refactored version of the Employee class that adheres to the Single Responsibility Principle (SRP).

// The current code only handles Employee performance report generation.
public class EmployeePerformanceReportGen {
    public void printPerformanceReport(Employee e) {
        // code to print a performance report
        System.out.println("Performance Report for Employee: " + e.getEmployeeName());
    }
}
