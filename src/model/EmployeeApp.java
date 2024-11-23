package model;

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

        String number = getValidPhoneNumber(scanner, "Enter Number: ");
        employee.setNumber(number);
        System.out.println("number: " + employee.getNumber());

        String street = getValidStringInput(scanner, "Enter street: ");
        employee.getAddress().setStreet(street);
        System.out.println("street: " + employee.getAddress().getStreet());

        String city = getValidStringInput(scanner, "Enter city: ");
        employee.getAddress().setCity(city);
        System.out.println("City: " + employee.getAddress().getCity());


        String state = getValidStringInput(scanner, "Enter state: ");
        employee.getAddress().setState(state);
        System.out.println("State: " + employee.getAddress().getState());

        int zipCode = getValidIntInput(scanner, "Enter zip code: ");
        employee.getAddress().setZipCode(zipCode);
        System.out.println("Zip Code: " + employee.getAddress().getZipCode());


        String department = getValidStringInput(scanner, "Enter department name: ");
        employee.getDepartment().setDepartmentName(department);
        System.out.println("Department Name: " + employee.getDepartment().getDepartmentName());

        try {
            int employeeId = DatabaseConnection.insertEmployee(employee);
            if (employeeId != -1) {
                DatabaseConnection.insertAddress(employee.getAddress(), employeeId);
                System.out.println("Employee and Address details successfully inserted into the database!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error inserting data into the database.");
        }
    }


}
