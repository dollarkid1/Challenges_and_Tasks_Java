package com.humble.java_coding_problems.c4_type_inference;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class UsingVar {


    public static void andLambdas(){

    }


    public static void withPrimitiveTypes() {

        var intNumber = 10; // inferred as int
        var longNumber = 10L; // inferred as long
        var floatNumber = 10F; // inferred as float, 10.0
        var doubleNumber = 10D; // inferred as double, 10.0

        System.out.println(doubleNumber);
    }

    public static void andImplicitTypeCasting() {

        var playerStack = new ArrayDeque<String>();

        var playerList = new ArrayList<>(playerStack);
        var numberArray = new int[10];


        boolean containsEven = false;
        Collection evensOrOdds = containsEven ?
                List.of(10, 2, 12) : Set.of(13, 1, 11);

        System.out.println(evensOrOdds);

        boolean intOrString = false;
        Serializable numberOrText = intOrString ? 2234 : "2234";
        System.out.println(numberOrText);
        //Object numberOrText = intOrString ? 2234 : "2234";

    }

    private void withLoops(){
        // a variable 'array' representing an int[]
        int[] array = { 1, 2, 3 };
        // or the same variable, 'array', but representing a String[]
        String[] array1 = {
                "1", "2", "3"
        };
        // depending on how 'array' is defined
        // 'i' will be inferred as int or as String
        for (var i: array) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) throws IOException {

        // inferred type, Collection<Integer>
        boolean containsEven = false;
        var evensOrOddsCollection = containsEven ?
                List.of(10, 2, 12) : Set.of(13, 1, 11);
// inferred type, Serializable
        boolean intOrString = false;
        var numberOrText
                = intOrString ? 2234 : "2234";

       // andStreams();
        andLargeChainsOfExpressions();

    }

/*
    public static void andStreams() throws IOException {

        //explicit type
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        numbers.filter(t -> t % 2 == 0).forEach(System.out::println);

        // using var, inferred as Stream<Integer>
        var numberStream = Stream.of(1, 2, 3, 4, 5);
        numberStream.filter(t -> t % 2 == 0).forEach(System.out::println);


        //Here is another example:

        // explicit types
        Stream<String> paths = Files.lines(Path.of("..."));
        List<File> files = paths.map(File::new).collect(toList());
        // using var
        // inferred as Stream<String>
        var pathStream = Files.lines(Path.of(""));
        // inferred as List<File>
        var fileList = pathStream.map(p -> new File(p)).collect(toList());

    }
*/

    public static void andLargeChainsOfExpressions(){

        /*. Using LVTI to break up nested/large chains
        of expressions */

        List<Integer> ints = List.of(1, 1, 2, 3, 4, 4, 6, 2, 1, 5, 4, 5);
        // Avoid
        int result = ints.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .values()
                .stream()
                .max(Comparator.comparing(List::size))
                .orElse(Collections.emptyList())
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(result);

        // Prefer
        Collection<List<Integer>> evenAndOdd = ints.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .values();
        System.out.println(evenAndOdd + "first");

        List<Integer> evenOrOdd = evenAndOdd.stream()
                .max(Comparator.comparing(List::size))
                .orElse(Collections.emptyList());
        System.out.println(evenOrOdd + "second");

        int sumEvenOrOdd = evenOrOdd.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumEvenOrOdd + "third");


        // this is the best...
        var intList = List.of(1, 1, 2, 3, 4, 4, 6, 2, 1, 5, 4, 5);
        // Prefer
        var evenAndOdd1 = intList.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .values();
        var evenOrOdd1 = evenAndOdd1.stream()
                .max(Comparator.comparing(List::size))
                .orElse(Collections.emptyList());
        var sumEvenOrOdd1 = evenOrOdd1.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }




}
