package loops.practice;

import java.util.ArrayList;
import java.util.List;

public class LoopPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        for (int i : list) {
            System.out.println(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int x = 0;
        while (x < list.size()) {
            System.out.println(list.get(x));
            x++;
            System.out.println("---");
        }

        int[] array= {1,2,4,6,7,8};
        int max = array[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);


        String str="Hello World";
        String reversedStr= "";

        for(int i=str.length()-1;i>=0;i--){
            reversedStr+=str.charAt(i);
        }
        System.out.println(reversedStr);
    }



}
