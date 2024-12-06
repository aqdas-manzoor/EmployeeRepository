package collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {
// insertion order is not guranted to preserved and only one value is allowed
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("chicken");
        set.add("");
        System.out.println(set);
        System.out.println(set.contains("Apple"));
        System.out.println(set.remove("Banana"));
        System.out.println(set);

        //insertion order is preserved and only one null value is allow
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Apple");
        set1.add("Banana");
        set1.add("chicken");
        set1.add(null);
        System.out.println(set1);
        set1.clear();
        System.out.println(set1);

// stored elements based on natural ordering in ascending order and it does not allow null value
        SortedSet<String> set2 = new TreeSet<>();
        set2.add("Apple");
        set2.add("Apple");
        set2.add("chicken");
        set2.add("Banana");
        System.out.println(set2);
    }
}