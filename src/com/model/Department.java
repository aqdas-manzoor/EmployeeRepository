package com.model;

import java.util.List;

public class Department {
    private int id;
    private String departmentName;
//    private List<Employee> employeeList;

    public String getDepartmentName() {

        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

//    public void addEmployee(Employee employee) {
//        this.employeeList.add(employee);
//    }

//    public List<Employee> getEmployees() {
//        return employeeList;
//    }
    public int getId() {
        return id;  // Get department ID
    }

    public void setId(int id) {
        this.id = id;  // Set department ID
    }

}