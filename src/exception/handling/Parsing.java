package exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parsing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/** using exception handling
 *  convert string to integer
 */
        try {
            System.out.print("Enter an integer: ");
            // Read input as string first
            String input = scanner.nextLine();

            // Try to parse the string to an integer
            int abc = Integer.parseInt(input);
            System.out.println("You entered: " + abc);

        } catch (NumberFormatException e) {
            // If input is not a valid integer, catch the exception
            System.out.println("Invalid input. Please enter a valid integer.");
        }
/**
 * convert string to boolean
 */
        try {
            System.out.print("Enter an boolean value: ");
            String input = scanner.nextLine();
            boolean bool = Boolean.parseBoolean(input);
            System.out.println("You entered: " + bool);
        }catch(NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid boolean value.");
        }
/**
 * convert string to decimal
 */

    try{
        System.out.print("Enter an Decimal: ");
        String input = scanner.nextLine();
        double decimal = Double.parseDouble(input);
        System.out.println("You entered: " + decimal);
    }catch(NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid decimal value.");
    }

/**
 * string to float
 */
      try{
          System.out.print("Enter an float value: ");
          String input = scanner.nextLine();
          float floatValue = Float.parseFloat(input);
          System.out.println("You entered: " + floatValue);
      }
      catch(NumberFormatException e) {
          System.out.println("Invalid input. Please enter a valid float value.");
      }

                try {
                    int result = 10 / 0;  // This will cause ArithmeticException (division by zero)
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());  // Catch the exception and print error message
                } finally {
                    System.out.println("This block will always execute.");
                }
            }
        }