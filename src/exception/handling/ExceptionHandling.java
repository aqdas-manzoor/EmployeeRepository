package exception.handling;

public class ExceptionHandling {
    public static void main(String[] args) {
        /**
         * multiple catch block to handle more than one exception: if exception occur at array then exception will throw then
         * rest of try code will not execute
         */
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
            int result = 10 / 0;
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
            // Code that might throw an exception
            int result = a / b;  // ArithmeticException (division by zero)
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // Code that will always execute
            System.out.println("This is the finally block. Cleanup can be done here.");
        }
        }
    }
