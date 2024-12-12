package exception.handling;

import java.util.Scanner;

public class InvalidAgeUncheckedException extends RuntimeException {
    public InvalidAgeUncheckedException(String message) {
        super(message);
    }
}
class InputFromUser {
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);
        if(input < 0 || input > 100) {
            throw new InvalidAgeUncheckedException("Invalid age");
        }
    }
    public static void main(String[] args) {
        try{
            userInput();
        }catch(InvalidAgeUncheckedException e) {
            System.out.println(e.getMessage());
        }
    }
}
