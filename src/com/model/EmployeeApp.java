package com.model;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

public class EmployeeApp {

    private static Properties properties = new Properties();

    static {
        try (InputStream input = new FileInputStream("src/resources/validation.properties")) {
            if (input != null) {
                properties.load(input);
                System.out.println("Validation properties file loaded successfully.");
            } else {
                System.out.println("Sorry, unable to find validation.properties");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getValidIntInput(Scanner scanner, String prompt) {
        int validInput = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print(prompt);
                validInput = scanner.nextInt();
                scanner.nextLine();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        return validInput;
    }


    public static String getValidEmailInput(Scanner scanner, String prompt) {
        String validEmail = "";
        boolean valid = false;

        String emailRegex = properties.getProperty("email.regex");

        while (!valid) {
            System.out.print(prompt);
            validEmail = scanner.nextLine();

            if (validEmail.matches(emailRegex)) {
                valid = true;
            } else {
                System.out.println("Invalid email. Please enter a valid email address.");
            }
        }
        return validEmail;
    }


    public static String getValidStringInput(Scanner scanner, String prompt) {
        String validInput = "";
        boolean valid = false;


        while (!valid) {
            System.out.print(prompt);
            validInput = scanner.nextLine().trim();


            if (validInput.isEmpty()) {
                System.out.println("Invalid input. Please enter a non-empty string.");
            } else {
                valid = true;
            }
        }
        return validInput;
    }

    public static String getValidPhoneNumber(Scanner scanner, String prompt) {
        String phoneNumber;
        String phoneRegex = properties.getProperty("phone.regex");

        while (true) {
            System.out.print(prompt);
            phoneNumber = scanner.nextLine().trim();

            if (phoneNumber.matches(phoneRegex)) {
                return phoneNumber;
            } else {
                System.out.println("Invalid phone number. Please enter a valid phone number with country code +92 and 10 valid digits.");
            }

        }

    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        String name = getValidStringInput(scanner, "Enter name: ");
        employee.setName(name);
        System.out.println("Name " + employee.getName());

        int age = getValidIntInput(scanner, "Enter age: ");
        employee.setAge(age);
        System.out.println("Age: " + employee.getAge());

        int salary = getValidIntInput(scanner, "Enter salary: ");
        employee.setSalary(salary);
        System.out.println("salary: " + employee.getSalary());

        String email = getValidEmailInput(scanner, "Enter Email: ");
        employee.setEmail(email);
        System.out.println("email: " + employee.getEmail());


        // Add addresses using Employee's method
        boolean addingAddresses = true;
        while (addingAddresses) {

            String addressType = getValidStringInput(scanner, "Enter Address Type (e.g., Home, Office, Private, Public): ");
            String street = getValidStringInput(scanner, "Enter street: ");
            String city = getValidStringInput(scanner, "Enter city: ");
            String state = getValidStringInput(scanner, "Enter state: ");
            String number = getValidStringInput(scanner, "Enter number: ");
            int zipCode = getValidIntInput(scanner, "Enter zip code: ");

            employee.addAddressFromInput(addressType, street, city, state, number,zipCode);
            System.out.println("Address added!");

            String continueAdding = getValidStringInput(scanner, "Would you like to add another address? (yes/no): ");
            if (!continueAdding.equalsIgnoreCase("yes")) {
                addingAddresses = false;
            }
        }

        // Print all added addresses
        System.out.println("\nEmployee Addresses:");
        for (Address addr : employee.getAddress()) {
            System.out.println("Address Type: " + addr.getAddressType());
            System.out.println("Street: " + addr.getStreet());
            System.out.println("City: " + addr.getCity());
            System.out.println("State: " + addr.getState());
            System.out.println("Number: " + addr.getNumber());
            System.out.println("Zip Code: " + addr.getZipCode());
            System.out.println("---");
        }

        // Add Departments (Composition)
        boolean addingDepartments = true;
        while (addingDepartments) {
            System.out.print("Enter department name: ");
            String deptName = scanner.nextLine();
            employee.addDepartment(deptName);  // Add department to employee

            System.out.print("Do you want to add another department? (yes/no): ");
            if (!scanner.nextLine().equalsIgnoreCase("yes")) {
                addingDepartments = false;
            }
        }
        System.out.println("\nEmployee Departments:");
        for (Department dept : employee.getDepartment()) {
            System.out.println("Department: " + dept.getDepartmentName());
        }

        try {
            int employeeId = DatabaseConnection.insertEmployee(employee);

            if (employeeId != -1) {
                for (Address addr : employee.getAddress()) {
                    DatabaseConnection.insertAddress(addr, employeeId);
                }

                for (Department dept : employee.getDepartment()) {
                    int departmentId = DatabaseConnection.insertDepartment(dept);

                    if (departmentId != -1) {
                        dept.setId(departmentId);
                    } else {
                        System.out.println("Failed to insert department: " + dept.getDepartmentName());
                    }
                }
                DatabaseConnection.insertEmployeeDepartments(employeeId, employee.getDepartment());

                System.out.println("Employee and associated details successfully inserted into the database!");

                DatabaseConnection.displayEmployeeDetails(employeeId);
                DatabaseConnection.displayEmployeeAddresses(employeeId);
                DatabaseConnection.displayEmployeesByDepartment();
            } else {
                System.out.println("Failed to insert employee.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error inserting data into the database.");
        }

}}
