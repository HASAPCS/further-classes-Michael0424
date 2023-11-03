package com.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public String getName() {
        return this.name;
    }

    public List<Employee> getEmployees() {
        return this.employeeList;
    }

    // Calculate average salary
    public double calculateAverageSalary() {
        if (employeeList.isEmpty()) {
            return 0.0;
        }

        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }

        return totalSalary / employeeList.size();
    }
}