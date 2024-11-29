package model;

import java.sql.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/EmployeeDB";
    private static final String USER = "root";
    private static final String PASSWORD = "aqdas@2710";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static int insertEmployee(Employee employee, int departmentId) throws SQLException {
        String query = "INSERT INTO employees (name, age, salary, email, phone_number, department_id) VALUES (?, ?, ?, ?, ?,?)";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, employee.getName());
            stmt.setInt(2, employee.getAge());
            stmt.setInt(3, employee.getSalary());
            stmt.setString(4, employee.getEmail());
            stmt.setString(5, employee.getNumber());
            stmt.setInt(6, departmentId);

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


    public static void insertAddress(Address address, int employeeId) throws SQLException {
        String query = "INSERT INTO address (employee_id, street, city, state, zip_code) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, employeeId);
            stmt.setString(2, address.getStreet());
            stmt.setString(3, address.getCity());
            stmt.setString(4, address.getState());
            stmt.setInt(5, address.getZipCode());

            stmt.executeUpdate();
        }
    }
    public static int insertDepartment(Department department ) throws SQLException {
        String query = "INSERT INTO departments(department_name) VALUES (?)";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, department.getDepartmentName());


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

    public static void displayEmployeeDetails(int employeeId) throws SQLException {
        String query = "SELECT e.id, e.name, e.age, e.salary, e.email, e.phone_number, d.department_name, " +
                "a.street, a.city, a.state, a.zip_code " +
                "FROM employees e " +
                "JOIN departments d ON e.department_id = d.id " +
                "JOIN address a ON e.id = a.employee_id";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                // Display employee data
                System.out.println("Employee ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Salary: " + rs.getInt("salary"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Phone Number: " + rs.getString("phone_number"));
                System.out.println("Department: " + rs.getString("department_name"));
                System.out.println("Address: ");
                System.out.println("  Street: " + rs.getString("street"));
                System.out.println("  City: " + rs.getString("city"));
                System.out.println("  State: " + rs.getString("state"));
                System.out.println("  Zip Code: " + rs.getInt("zip_code"));
           }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error retrieving employee details.");
    }
}
        }

