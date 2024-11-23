package model;

public class Employee {
    private int age;
    private String name;
    private int salary;
    private String number;
    private String email;
    private Address address;
    private Department department;

    public Employee() {
        address = new Address();
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

    public Address getAddress() {
        return address;
    }

    public Department getDepartment() {
        return department;
    }


}

