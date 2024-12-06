package collections;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {
        //f you have a lot of random access to elements
        List<String> arraylist=new ArrayList<>();
        arraylist.add("Aqdas");
        arraylist.add("Qalb");
        arraylist.add("Qalb");
        arraylist.add("Ahmad");
        arraylist.add("Mama");
        arraylist.add("papa");
        arraylist.add("papa");
        arraylist.add(2,"Aqii");
        System.out.println(arraylist);

        // f your use case involves frequent insertions and deletions
        List<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        System.out.println(linkedList );
      //deque use when we want to add the value from both side
        //deque mei dono side se hm add kar sakte hai element
        Deque<Integer> deque = new LinkedList<>();
        // push is same as addFirst in deque  ... frontend se add ho ga
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);
        // add from rear end
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println(deque);
        deque.addFirst(100);
        System.out.println(deque);
        deque.addLast(100);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.addLast(100);
        System.out.println(deque);
        // it return the element but not remove from the list
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.peek());
        System.out.println(deque);

        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.set(0, 10);
        System.out.println(vector);
        vector.remove(0);
        System.out.println(vector.size());
        System.out.println(vector);

        //LILO add element from rear end
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        System.out.println(stack);
        // remove and return the element in rear end means from right side
        String item = stack.pop();
        System.out.println(item);
        System.out.println(stack);
        //return the recent value from rear end from right side but not remove from the list
        System.out.println(stack.peek());
        System.out.println(stack);
         stack.search("Apple");
         //if we want the position lf Apple the we see it from right side and start from 1 index
        System.out.println(stack.search("Apple"));
    }



}

