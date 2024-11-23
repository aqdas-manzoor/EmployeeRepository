import java.util.Scanner;

public class Car {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        int counter =1;
//        int sum =0;
//do{
//
//            System.out.println("Enter#"+counter);
//            String nextNumber= scanner.nextLine();
//            try{
//                int number = Integer.parseInt(nextNumber);
//                counter++;
//                sum += number;
//            }
//            catch(NumberFormatException nfe){
//                System.out.println("invalid number");
//            }}
//    while(counter<=5);
//    System.out.println(sum);

   double max =0;
   double min=0;
   int loopCount =0;
   while(true) {

       String nextNumber = scanner.nextLine();
       try {
           Double.parseDouble(nextNumber);
       } catch (NumberFormatException nfe) {
           break;
       }

   }



    }
}