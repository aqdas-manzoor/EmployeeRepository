import java.util.*;

public class ConversionPractice {

    public static void main(String[] args) {

//            List<String> list = new ArrayList<>();
//             list.add("A");
//             list.add("A");
//             list.add("C");
//             list.add("B");
//             Iterator<String> iterator = list.iterator();
//             while (iterator.hasNext()) {
//                 System.out.println(iterator.next());
//             }
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        Iterator<String> iterator3 = queue.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
            if (num.equals(3)) {
                iterator.remove();
            }
        }
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("A", "B");
        map.put("B", "C");
        map.put("C", "D");

//        Iterator<Map.Entry<String,String>> entryIterator = map.entrySet().iterator();
//        while(entryIterator.hasNext()) {
//            System.out.println(entryIterator.next());
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
        Iterator<String> iterator4 = map.keySet().iterator();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }
       Iterator<String> iterator5 = map.values().iterator();
        while (iterator5.hasNext()) {
            System.out.println(iterator5.next());
        }



    }


}
