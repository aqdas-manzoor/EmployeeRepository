package model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int age;
    private String name;
    private int salary;
    private String number;
    private String email;
    private List<Address> address;
    private Department department;

    public Employee() {
        address = new ArrayList<>();
        department = new Department();
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void addAddressFromInput(String addressType, String street, String city, String state, int zipCode) {
        Address address = new Address();
        address.setAddressType(addressType);
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        address.setZipCode(zipCode);
        this.address.add(address);
    }
    public Department getDepartment() {
        return department;
    }


}

