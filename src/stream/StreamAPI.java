package stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        /**
         * Stream Api: provides a functional approach to processing sequences of elements.
         */
        List<Integer> numbers = Arrays.asList(23, 9, 4, 4, 5, 6, 7, 8, 9, 5);
        /**
         *  Filter only takes predicate arguments. predicate is a functional interface.
         *  and filter is used to filter the data. Filter is used to select or reject elements based on a condition
         */
        List<Integer> filteredNumbers = numbers.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(filteredNumbers);


        List<Integer> numb = new ArrayList<>();
        numb.add(2);
        numb.add(3);
        numb.add(10);
        List<Integer> fil = numb.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(fil);
        /**
         *  map method in streams is used to transform each element into another form
         */

        List<Integer> MultiplyNumber = numb.stream().map(x -> x * 2).toList();
        System.out.println(MultiplyNumber);

        /**
         * count(): to count the number of elements in the stream
         * it returns the long that's why we will use long.
         */

        List<Integer> MultiplyNumber2 = numbers.stream().filter(x -> x > 2).map(x -> x * 2).toList();
        System.out.println(MultiplyNumber2);
        long countNum = MultiplyNumber2.stream().count();
        System.out.println(countNum);

        /**
         * sorted(): to sort the order in stream, sorted according to the natural order
         */

        List<Integer> sortedOrder = MultiplyNumber2.stream().sorted().toList();
        System.out.println(sortedOrder);

        /**
         * sorted(Comparator): For customized sorting order, Comparator is a functional interface has only one method compare
         *  so sort the element in descending order using comparator
         * min, max both also use comparator
         * min return the first element and max return then last element
         */

        List<Integer> descOrder = MultiplyNumber2.stream().sorted((a, b) -> b.compareTo(a)).toList();
        List<Integer> descOrderr = MultiplyNumber2.stream().sorted((a, b) -> -a.compareTo(b)).toList();
        List<Integer> descOrder2 = MultiplyNumber2.stream().sorted((a, b) -> Integer.compare(b, a)).toList();
        List<Integer> descOrder3 = MultiplyNumber2.stream().sorted((a, b) -> Integer.compare(a, b)).toList();
        List<Integer> descOrder1 = MultiplyNumber2.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(descOrder);
        System.out.println(descOrderr);
        System.out.println(descOrder1);
        System.out.println(descOrder2);
        System.out.println(descOrder3);

        Integer minValue = MultiplyNumber2.stream().min((a, b) -> a.compareTo(b)).get(); //it will return the 1st element
        System.out.println(minValue);

        Integer maxValue = MultiplyNumber2.stream().max((a, b) -> Integer.compare(a, b)).get(); //it will return the last element
        System.out.println(maxValue);

        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);
        min.ifPresent(System.out::println);

        /**
         * foreach: use to iterate over the elements of stream
         */
         numbers.stream().forEach(i-> System.out.println(i));
         numbers.forEach(System.out::println);

        /**
         * Array to stream
         */
        Integer[] values={2,3,4,5,4};
        Arrays.stream(values).forEach(System.out::println);

        /**
         * General type of stream store any type of element
         */
        Stream<?> item= Stream.of(2,3,4,5,"aqda","aqdas");
        item.map(i->i+"s").forEach(System.out::println);
    }
}
