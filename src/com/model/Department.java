package com.model;


public class Department {
    private int id;
    private String departmentName;
    private String departmentEmail;
    private String departmentDescription;

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public String getDepartmentEmail() {
        return departmentEmail;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public void setDepartmentEmail(String departmentEmail) {
        this.departmentEmail = departmentEmail;
    }

    public String getDepartmentName() {

        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}