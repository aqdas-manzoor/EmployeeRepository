package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        System.out.println(map);
        Map<String,Integer> obj=new HashMap<>();
        obj.put("AB",4);
        obj.put("CD",5);
        obj.put("EF",6);
        System.out.println(obj);

        Map<String,Integer> obj2=new HashMap<>();
        obj2.put(null,null);
        obj2.put("AB",null);
        obj2.put("CD",null);
        obj2.put("EF",null);
        System.out.println(obj2);

        Map<String,Integer> obj3=new HashMap<>();
        obj3.put("AB",null);
        obj3.put("CD",null);
        obj3.put("EF",null);
        obj3.put(null,null);
        System.out.println(obj3);

        Map<String,Integer> obj4=new Hashtable<>();
        obj4.put("A",3);
        obj4.put("C",4);
        obj4.put("B",5);
        System.out.println(obj4);

        Map<String,Integer> obj5=new TreeMap<>();
        obj5.put("A",2);
        obj5.put("C",null);
        obj5.put("B",null);
        System.out.println(obj5);
    }


}
