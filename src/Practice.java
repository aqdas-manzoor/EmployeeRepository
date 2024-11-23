import java.util.Scanner;

public class Practice {

//public static boolean numberCheck(){
//        Scanner scanner=new Scanner(System.in);
//        int number=scanner.nextInt();
//        System.out.println(number);
//        if((number<0) || (number>99)){
//            System.out.println("number is invalid");
//           return false;
//        }
//        System.out.println("number is valid");
//        return true;
//    }

public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);

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

//Practice.numberCheck();



}


}
