package scanner.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClassPractice {

    public static void main(String[] args) {
        /**
         * Scnner class uses for user input
         * print the table ...
         */
        Scanner scanner = new Scanner(System.in);
        int table = scanner.nextInt();
        for (int b = 1; b <= 10; b++) {
            System.out.println(table + " * " + b + " = " + (table * b));
        }
        /**
         * validate user input and enter user input untill enter the valid input
         */
        int input = 0;
        boolean valid = false;
        while (!valid) {
            try {
                input = scanner.nextInt();
                valid = true;
                System.out.println(input);
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                scanner.nextLine();
            }
        }
        scanner.close();


    }
}