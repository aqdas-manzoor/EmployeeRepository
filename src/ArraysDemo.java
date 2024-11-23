import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] array ={1,2,3,4,5,6,7};

        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 10;
        }

            System.out.println(Arrays.toString(array));
        int[] array5 = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(array5, 3);
        System.out.println(index); // Output: 2




    }
}
