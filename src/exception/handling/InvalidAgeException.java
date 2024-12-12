package exception.handling;

import java.util.Scanner;

/**
 * custom Exception : Checked Exception
 */
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class UserInputForAge {
    /**
     * @throws InvalidAgeException
     */
    public static void userInputForAge() throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(age);
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("User Invalid Age");
        }

    }

    public static void main(String[] args) {
        try {
            UserInputForAge.userInputForAge();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

