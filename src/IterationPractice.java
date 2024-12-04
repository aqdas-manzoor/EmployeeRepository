import java.util.*;

public class IterationPractice {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for (String str : list) {
            System.out.println(str);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Map<String, Integer> map1 = new HashMap<>();
       map1.put("A", 1);
       map1.put("B", 2);
       map1.put("C", 3);
       map1.put("D", 4);
       Iterator<Map.Entry<String,Integer>> iterator1 = map1.entrySet().iterator();
       while (iterator1.hasNext()) {
           Map.Entry<String,Integer> entry = iterator1.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
           System.out.println(entry.getValue());
        }
       Iterator<String> iterator2 = map1.keySet().iterator();
       while (iterator2.hasNext()) {
           System.out.println(iterator1.next());
       }
        Iterator<Integer> iterator3 = map1.values().iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator1.next());
        }

        for (Integer str : map1.values()) {
            System.out.println(str);
        }
        for(Map.Entry<String, Integer> entry12 : map1.entrySet()) {
            System.out.println(entry12.getKey() + " " + entry12.getValue());
        }


    }
}
