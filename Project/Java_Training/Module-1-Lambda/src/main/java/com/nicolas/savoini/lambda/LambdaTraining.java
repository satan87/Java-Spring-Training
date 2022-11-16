package com.nicolas.savoini.lambda;

import java.util.List;
import java.util.stream.Stream;

public class LambdaTraining {

    public void training() {

        /**
         * Classic For Loop, with index
         */
        System.out.println("Classic For Loop, with Index");
        for (int i = 0; i < 10 ; i++) {
            System.out.println("I = " + i);
        }

        /**
         * For each. Will do the same action for each element
         */
        System.out.println("For Each Loop");
        List.of(1, 2, 3).forEach(i -> System.out.println("I = " + i));

        /**
         * Map - Will do something for each element
         */
        System.out.println("Map - 1");
        List<Integer> doubles = Stream.of(1, 2, 3).map(i -> i * 2 ).toList();
        System.out.println(doubles);

        System.out.println("Map - 2");
        List<String> upperCased = Stream.of("a", "b", "c").map(String::toUpperCase).toList();
        System.out.println(upperCased);


        /**
         * Filter an array
         */
        System.out.println("Filter");
        List<Integer> evens = Stream.of(1, 2, 3, 4, 5, 6).filter(n -> n % 2 == 0).toList();
        System.out.println(evens);


        /**
         * Reduce - Terminal operation, will reduce the element to one element based on function
         */
        System.out.println("Reduce");
        Integer total = Stream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
        System.out.println(total);

        /**
         * FlatMap - Allow to flat arrays [[], []] will become []
         */
        System.out.println("FlatMap");
        List<Integer> oneList = List.of(List.of(1, 2), List.of(3, 4)).stream().flatMap(List::stream).toList();
        System.out.println(oneList);

    }
}
