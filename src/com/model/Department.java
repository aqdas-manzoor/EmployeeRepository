package com.model;

import java.util.List;

public class Department {
    private int id;
    private String departmentName;

    public String getDepartmentName() {

        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;  // Get department ID
    }

    public void setId(int id) {
        this.id = id;  // Set department ID
    }

}