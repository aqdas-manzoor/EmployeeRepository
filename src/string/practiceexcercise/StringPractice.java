package string.practiceexcercise;

public class StringPractice {
    public static void main(String[] args) {
/**
 *  string var1 is immutable and when we manipulate it then java create a new object. object stored in a string pool
 *  if a object doesn't contain any reference then it will automatically destroy by garbage collector
 */

        String var1 = "Hello World";
        String var2 = var1;
        System.out.println(var1);
        System.out.println(var2);
        var1 = var1.concat("!!");
        System.out.println(var1);
        System.out.println(var2);


        /**
         *. String Mtheods
         *  charAt() : it returns the character of specific index
         */

        char b = var1.charAt(3);
        System.out.println(b);

        /**
         *  length: it will return us the total length of the character
         */

        System.out.println(var1.length());

        /**
         *  substring(): Returns a substring from the specified beginIndex to endIndex - 1.
         */

        String substring = var1.substring(0, 5);
        System.out.println(substring);

        /**
         *  contains(): Checks if the string contains the specified sequence of characters.
         */

        boolean var3 = var1.contains("Hello");
        System.out.println(var3);
        /**
         * indexOf :ind the index of the first occurrence of a character or substring within a string.
         *
         */
        System.out.println(var1.indexOf("Hello"));
        String str = "Hello, world! Hello!";
        // Find the index of the first occurrence of 'o', starting from index 5
        int index = str.indexOf('o', 5);
        System.out.println("The first index of 'o' from index 5 is: " + index);  // Output: 8
        //the lastIndexOf method is used to find the last occurrence of a character or substring within a string.
        System.out.println(var1.lastIndexOf('d'));


        String c = "Aqdas Manzoor";
        if (c.contains("das")) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        if (c.startsWith("Aqdas")) {
            System.out.println("pass");
        }
        if (c.endsWith("Manzoor")) {
            System.out.println("pass");
        }
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println(startingIndex);
        System.out.println(birthDate.substring(startingIndex));
        String newDate = String.join("/", "10", "09", "1999");
        System.out.println(newDate);
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("10");
        System.out.println(newDate);
        newDate = "2a".concat("/").concat("11").concat("/").concat("12").concat("/");
        System.out.println(newDate);
        /**
         * replace: Replaces all occurrences of the specified character with a new character.
         */
        System.out.println(newDate.replace("/", "---"));
//        System.out.println(newDate.replace("2","00"));
        /**
         * for replacing the first match
         */
        System.out.println(newDate.replaceFirst("2", "a"));
        /**
         * replaceALL(): You can use regular expressions to replace patterns
         *
         */
        System.out.println(newDate.replaceAll("1", "7"));
        String str1 = "apple orange banana";

        // Replace all vowels with '*'
        String result = str1.replaceAll("[aeiou]", "*");
        System.out.println(result);

        /**
         * repeat: we can repeat the string
         */
        System.out.println("ABC\n".repeat(3));
        System.out.println(str.repeat(3));
        System.out.println("ABC\t".repeat(3).indent(2));
        String name = "Hello Worrlddd!!!!";
        System.out.println(name.substring(5));
        String abc = "Hello\t" + "world";
        System.out.println(abc);
        StringBuilder stringBuilder = new StringBuilder("Hello" + " World");
        stringBuilder.append("Bye");
        System.out.println(stringBuilder);
/**
 * reverse the string using for loop and charAt() method
 */
        String originalValue = "Hello World";
        String reverse = "";
        for (int cc = originalValue.length() - 1; cc >= 0; cc--) {
            reverse += originalValue.charAt(cc);
        }
        System.out.println(reverse);

    }
}
