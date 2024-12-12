package exception.handling;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    /**
     * @throws ClassNotFoundException
     */
    public static void checkThrowsException() throws ClassNotFoundException {
        Class.forName("com.model.Department");
    }

    /**
     * created this method to re-throw the exceptions.
     *
     * @param a
     * @param b
     */
    public static void divideExample(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            // Re-throw the exception to propagate it further
            throw e;  // Re-throw the original exception
        }
    }

    /**
     * created this method to throw the explicitly exceptions.
     *
     * @param a
     * @param b
     */
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        /**
         * multiple catch block to handle more than one exception: if exception occur at array then exception will throw then
         * rest of try code will not execute
         */
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }

        /**
         * A try block to execute code that may throw an exception.
         * A catch block to handle specific exceptions.
         * A finally block that executes regardless of whether an exception occurs or not
         */

        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("This is the finally block. Cleanup can be done here.");
        }

        /**
         *  use the finally block to close the resource
         */
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/resources/validation.properties");
        } catch (IOException e) {
            System.out.println("Error: File not found.");
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                    System.out.println("FileReader closed.");
                }
            } catch (IOException e) {
                System.out.println("Error: File closed.");
            }
        }

        /**
         *  try-with-resource: it ensures that the resource automatically close.
         */

        try (FileReader fileReader1 = new FileReader("src/resources/validation.properties")) {
            System.out.println(fileReader1.read());
        } catch (IOException e) {
            System.out.println("Error: File not found.");
        }

        /**
         * Catch Multiple exception in single catch block using the pipe
         */
        try {
            // Simulate multiple exceptions
            int[] arr = new int[2];
            System.out.println(arr[5]);

            String str = null;
            System.out.println(str.length());

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Caught an exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        /**
         *  throws: throws is placed at the end of a method declaration to specify
         *  which exceptions the method can throw.
         *  By declaring exceptions with throws, a method is saying,
         *  "I am not handling this exception, please handle it where I am called."
         */
        try {
            checkThrowsException();
        } catch (ClassNotFoundException e) {
            System.out.println("Caught an exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        /**
         *  throw:explicitly throw exception
         */
        try {
            ExceptionHandling.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        /**
         * Re-throwing Exceptions:Sometimes you may want to catch an exception and throw it again,
         * either as the same type or as a new type.
         */

        try {
            ExceptionHandling.divideExample(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }


    }
}