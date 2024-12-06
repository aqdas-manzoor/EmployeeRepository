package arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[] array1 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 10;
            System.out.println(array1[i]);
        }

/**
 * Arrays methods
 *  *  toString(): it convert array to string
 */
        System.out.println(Arrays.toString(array));
        /**
         * length: Every array in Java has a length property, which gives the number of elements in the array.
         */
        System.out.println(array.length);
        /**
         *  *    sort: Sorts the array in ascending order.
         */
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        /**
         *  Arrays.fill(): Fills an array with a specific value.
         */
         Arrays.fill(array, 5);
         System.out.println(Arrays.toString(array));
        /**
         * Copies a part of an array into a new array.
         */

        int[] newArray = Arrays.copyOf(array, 9);
        System.out.println(Arrays.toString(newArray));

        /**
         * Compares two arrays to see if they are equal (element by element).
         */
        int[] array3 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println(Arrays.equals(array3, array2));

        /**
         * Searches for a specific value in a sorted array.
         */
        int[] array5 = {1, 2, 3, 4, 5};
        //3 is a value and return index
        int index = Arrays.binarySearch(array5, 3);
        System.out.println(index); // Output: 2

    }
}
