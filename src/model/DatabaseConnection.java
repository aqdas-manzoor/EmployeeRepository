package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
