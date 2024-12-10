package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        /**
         * A Predicate<T> represents a boolean-valued function that takes one argument of type T
         * and returns a boolean result.
         */
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));  // true
        System.out.println(isEven.test(7));   // false

/**
 * A Function<T, R> represents a function that takes an argument of type T
 * and returns a result of type R.
 */
        Function<String, Integer> stringLength = str -> str.length();

        System.out.println(stringLength.apply("Hello"));
        System.out.println(stringLength.apply("Functional"));


/**
 * A Consumer<T> represents an operation that takes an argument of type T and
 * returns no result (i.e., it consumes the argument).
 */
        Consumer<String> printMessage = message -> System.out.println(message);

        printMessage.accept("Hello, Consumer!");

        /**
         * A Supplier<T> represents a function that takes no arguments and returns a result of type T.
         *
         */

        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());
    }

}
