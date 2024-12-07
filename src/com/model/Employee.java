package com.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Employee} class represents an employee with attributes such as age, name, salary, email,
 * address, and department. It allows adding multiple addresses and departments for an employee.
 * <p>
 * This class provides methods to set and get the details of an employee, and manage their addresses
 * and departments.
 * </p>
 */
public class Employee {

    /** Employee's age */
    private int age;

    /** Employee's name */
    private String name;

    /** Employee's salary */
    private int salary;

    /** Employee's email */
    private String email;

    /** List of addresses associated with the employee */
    private List<Address> address;

    /** List of departments associated with the employee */
    private List<Department> departmentList;

    /**
     * Constructs an {@code Employee} with empty address and department lists.
     */
    public Employee() {
        address = new ArrayList<>();
        departmentList = new ArrayList<>();
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary The salary to set.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the employee.
     *
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the email address of the employee.
     *
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the name of the employee.
     *
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the email address of the employee.
     *
     * @return The email address of the employee.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the age of the employee.
     *
     * @return The age of the employee.
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the salary of the employee.
     *
     * @return The salary of the employee.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Returns a list of addresses associated with the employee.
     *
     * @return A list of addresses.
     */
    public List<Address> getAddress() {
        return address;
    }

    /**
     * Adds a new address to the employee's address list.
     *
     * @param addressType The type of address (e.g., "Home", "Work").
     * @param street The street of the address.
     * @param city The city of the address.
     * @param state The state of the address.
     * @param number The number associated with the address.
     * @param zipCode The zip code of the address.
     */
    public void addAddressFromInput(String addressType, String street, String city, String state, String number, int zipCode) {
        Address address = new Address();
        address.setAddressType(addressType);
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        address.setNumber(number);
        address.setZipCode(zipCode);
        this.address.add(address);
    }

    /**
     * Returns a list of departments associated with the employee.
     *
     * @return A list of departments.
     */
    public List<Department> getDepartment() {
        return departmentList;
    }

    /**
     * Adds a new department to the employee's department list.
     *
     * @param departmentName The name of the department.
     * @param departmentEmail The email of the department.
     * @param departmentDescription A brief description of the department.
     */
    public void addDepartment(String departmentName, String departmentEmail, String departmentDescription) {
        Department department = new Department();
        department.setDepartmentName(departmentName);
        department.setDepartmentEmail(departmentEmail);
        department.setDepartmentDescription(departmentDescription);
        this.departmentList.add(department);
    }
}
