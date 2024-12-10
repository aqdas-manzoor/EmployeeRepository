package casting;

public class CastingExamples {
    public static void main(String[] args) {
        Object str ="Hello World";
        String str2 = (String)str;
        System.out.println(str2);
        /**
         * Auto-boxing: Converting primitive types like int to their wrapper classes like Integer automatically.
         * Casting: The process of treating an object of one type as another type when the types are compatible
         * (i.e., they have a relationship through inheritance).
         */
        Object num = 45;
        Integer num2 = (Integer)num;
        System.out.println(num2);
        /**
         * Implicit casting : convert smallest value to largest
         */
        int number = 100;
        double largerNum = number;
        System.out.println(largerNum);

        /**
         * Explicit Typecasting:
         */
        double largerNumber = 9.78;
        int smallerNum = (int) largerNumber;
        System.out.println(smallerNum);
    }
}
