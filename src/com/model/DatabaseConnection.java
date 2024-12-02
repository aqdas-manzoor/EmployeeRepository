package com.model;

import java.sql.*;
import java.util.List;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/EmployeeDB";
    private static final String USER = "root";
    private static final String PASSWORD = "aqdas@2710";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static int insertEmployee(Employee employee) throws SQLException {
        String query = "INSERT INTO employees (name, age, salary, email, phone_number) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, employee.getName());
            stmt.setInt(2, employee.getAge());
            stmt.setInt(3, employee.getSalary());
            stmt.setString(4, employee.getEmail());
            stmt.setString(5, employee.getNumber());


            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                var rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return -1;
    }

    // Insert employee-department relationships into employee_departments table
    public static void insertEmployeeDepartments(int employeeId, List<Department> departmentList) throws SQLException {
        String query = "INSERT INTO employee_departments (employee_id, department_id) VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            for (Department department : departmentList) {
                stmt.setInt(1, employeeId);
                stmt.setInt(2, department.getId());
                stmt.addBatch();
            }

            stmt.executeBatch();  // Execute all insert statements in batch
        }
    }

    public static void insertAddress(Address address, int employeeId) throws SQLException {
        String query = "INSERT INTO address (employee_id, street, city, state, zip_code,address_type) VALUES (?, ?, ?, ?, ?,?)";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, employeeId);
            stmt.setString(2, address.getStreet());
            stmt.setString(3, address.getCity());
            stmt.setString(4, address.getState());
            stmt.setInt(5, address.getZipCode());
            stmt.setString(6, address.getAddressType());

            stmt.executeUpdate();
        }
    }

    // Insert department into the departments table
    public static int insertDepartment(Department department) throws SQLException {
        String query = "INSERT INTO departments (department_name) VALUES (?)";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, department.getDepartmentName());

            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                var rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);  // Return the generated department ID
                }
            }
        }
        return -1;
    }


    public static void displayEmployeeDetails(int employeeId) throws SQLException {
        String query = "SELECT e.id, \n" + " e.name, \n" + " e.age, \n" + " e.salary, \n" + " e.email, \n" +
                " e.phone_number,\n" +
                "  GROUP_CONCAT(DISTINCT d.department_name ORDER BY d.department_name) AS department_names,\n" +
                "  GROUP_CONCAT(DISTINCT CONCAT(a.address_type, ': ', a.street, ', ', a.city, ', ', a.state, ' ', a.zip_code) \n" +
                "  ORDER BY a.address_type SEPARATOR ' | ') AS addresses\n" +
                "FROM employees e\n" +
                "LEFT JOIN employee_departments ed ON e.id = ed.employee_id\n" +
                "LEFT JOIN departments d ON ed.department_id = d.id\n" +
                "LEFT JOIN address a ON e.id = a.employee_id\n" +
                "WHERE e.id = ?\n" +
                "GROUP BY e.id";

        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, employeeId);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    System.out.println("Employee ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Age: " + rs.getInt("age"));
                    System.out.println("Salary: " + rs.getInt("salary"));
                    System.out.println("Email: " + rs.getString("email"));
                    System.out.println("Phone Number: " + rs.getString("phone_number"));

                    System.out.println("Departments: " + rs.getString("department_names"));
                    System.out.println("Addresses: " + rs.getString("addresses"));
                } else {
                    System.out.println("No employee found with ID: " + employeeId);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error retrieving employee details.");
        }
    }


    public static void displayEmployeeAddresses(int employeeId) throws SQLException {
        String query = "SELECT e.id, e.name, " +
                "GROUP_CONCAT(CONCAT(a.address_type, ' ', a.street, ', ', a.city, ', ', a.state, ' ', a.zip_code) " +
                "ORDER BY a.address_type SEPARATOR ' | ') AS addresses " +
                "FROM employees e " +
                "LEFT JOIN address a ON e.id = a.employee_id " +
                "WHERE e.id = ? " +
                "GROUP BY e.id, e.name";

        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, employeeId);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Employee ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));

                    String addresses = rs.getString("addresses");
                    if (addresses != null && !addresses.isEmpty()) {
                        System.out.println("Addresses: " + addresses);
                    } else {
                        System.out.println("No addresses found for this employee.");
                    }
                } else {
                    System.out.println("No employee found with ID: " + employeeId);
                }
            }
        }
    }
    public static void displayEmployeesByDepartment() throws SQLException {
        String query = "SELECT d.department_name, " +
                "GROUP_CONCAT(DISTINCT e.name ORDER BY e.name SEPARATOR ', ') AS employee_names " +
                "FROM departments d " +
                "LEFT JOIN employee_departments ed ON d.id = ed.department_id " +
                "LEFT JOIN employees e ON ed.employee_id = e.id " +
                "GROUP BY d.department_name";

        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String departmentName = rs.getString("department_name");
                String employeeNames = rs.getString("employee_names");

                System.out.println("Department: " + departmentName);
                if (employeeNames != null && !employeeNames.isEmpty()) {
                    System.out.println("Employees: " + employeeNames);
                } else {
                    System.out.println("No employees in this department.");
                }
                System.out.println("---");
            }
        }
    }


}

