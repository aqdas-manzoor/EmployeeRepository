package exception.handling;

import java.io.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckedExceptions {
    public static void main(String[] args) {

/**
 * Checked Exceptions: These are exceptions that are checked at compile time.
 * IOExceptions: Indicates problems with input/output operations.
 */
        try {
            new FileReader("src/resources/validation.properties");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
        try {
            new FileReader("src/resources/validations.properties");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
/**
 *  SQLException: Occurs during database interaction.
 */
        try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "aqdas@2710");
        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e.getMessage());
        }
        try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "");
        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e.getMessage());
        }
/**
 *  ClassNotFoundException: Happens when the JVM can't find a class during runtime.
 */
        try {
            Class.forName("com.model.Department");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            Class.forName("Department");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
/**
 *  FileNotFoundException: A subclass of IOException when a file is not found.
 */
        try {
            new FileInputStream("src/resources/validation.properties");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occurred: " + e.getMessage());
        }

        try {
            new FileInputStream("src/validation.properties");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occurred: " + e.getMessage());
        }
/**
 *  ParseExceptions: Happens when parsing a string into a specific data type (e.g., parsing a date).
 */
        String invalidDateStr = "2024-12-30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            sdf.parse(invalidDateStr);
        } catch (ParseException e) {
            System.out.println("ParseException occurred: " + e.getMessage());
        }


        String invalidDate = "2024-13-40";
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        sd.setLenient(false);
        try {
            sdf.parse(invalidDate);
        } catch (ParseException e) {
            System.out.println("ParseException occurred: " + e.getMessage());
        }

        /**
         * InterruptedException: This is thrown when a thread is interrupted while it is waiting,
         *  sleeping, or performing some other long-running task.
         */
        Thread thread = new Thread(() -> {
            try {
                System.out.println("runnable");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
            }
        });

        thread.start();
        thread.interrupt(); // it will stop the thread and throw the exceptions
        /**
         * NoSuchMethodException:This is thrown when a method cannot be found for a particular class through reflection.
         */
        try {
            Class<?> clazz = Class.forName("com.model.Employee");
            clazz.getMethod("getName");
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

}
