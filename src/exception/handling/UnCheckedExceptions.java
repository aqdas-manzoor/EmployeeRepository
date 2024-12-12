package exception.handling;

import java.util.*;

public class UnCheckedExceptions {
    public static void Method(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150.");
        }
    }

    public static void main(String[] args) {

/**
 * Unchecked Exceptions:
 * NullPointerExceptions: This exception occurs when you attempt to call a method
 *  or access a field of an object reference that is null.
 */
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e.getMessage());
        }

/**
 * ArrayIndexOutOfBoundsException: exception occurs when you attempt to access an array element using an invalid index
 */
        try {
            int[] array = {3, 4, 7, 5, 6};
            System.out.println(array[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
        }

/**
 * Arithmetic Exception:This exception occurs when an illegal arithmetic operation is performed,
 * such as dividing by zero.
 */

        try {
            int result = 20 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e.getMessage());
        }
/**
 * ClassCastException: Exception occurs when you try to cast an object to a class that it is not an instance of
 */
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException" + e.getMessage());
        }

/**
 * IllegalArgumentException: Exception is thrown when a method receives an argument that is inappropriate or illegal.
 */
        try {
            UnCheckedExceptions.Method(-18);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException" + e.getMessage());
        }

/**
 * IllegalStateException: This exception occurs when a method is called at an inappropriate time
 * or in an invalid state of an object.
 */
        try {
            List<String> list = new ArrayList<>();
            Iterator<String> iterator = list.iterator();
            iterator.remove();
        } catch (IllegalStateException e) {
            System.out.println("Illegal State Exception" + e.getMessage());
        }
        /**
         * UnsupportedOperationException:Thrown when a particular operation is not supported.
         */
        try {
            List<String> list = Collections.unmodifiableList(new ArrayList<>());
            list.add("Hello");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException" + e.getMessage());
        }
        /**
         *NegativeArraySizeException: Occurs when attempting to create an array with a negative size.
         */

        try {
            int[] array = new int[-10];
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException" + e.getMessage());
        }
        /**
         * NumberFormatException:Occurs when trying to convert a string to a numeric type,
         * but the string does not have the appropriate format.
         */

        try {
            String str = "aqdas";
            Integer num = Integer.valueOf(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException" + e.getMessage());
        }
        /**
         * NoSuchElementException: if the element is not found
         */
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");

        System.out.println("Dequeued element: " + queue.poll());  // A
        System.out.println("Dequeued element: " + queue.poll());  // B
        try {
            System.out.println("Dequeued element: " + queue.remove());
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException" + e.getMessage());
        }


    }
}