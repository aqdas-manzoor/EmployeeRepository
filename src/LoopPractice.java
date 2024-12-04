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
        }


    }
}
