package com.humble.java_coding_problems.c2.p1_10.p1;

import java.util.*;

public class Checking_null_references_in_functional_style_and_imperative_code {

    static List<Integer> numbers
            = Arrays.asList(1, 2, null, 4, null, 16, 7, null);
    static List<Integer> nulls
            = Arrays.asList( null, null, null);

    public static List<Integer> evenIntegers(List<Integer> integers){

        if (integers == null){
            return Collections.EMPTY_LIST;
        }

        List<Integer> evens = new ArrayList<>();
        for (Integer nr : integers){
            if (nr != null && nr % 2 == 0){
                evens.add(nr);
            }
        }
        return evens;
    }

    public static List<Integer> evenIntegers2(List<Integer> integers){
        if (Objects.isNull(integers)){
            return Collections.EMPTY_LIST;
        }

        List<Integer> evens = new ArrayList<>();

        for (Integer nr : integers){
            if (Objects.nonNull(nr) && nr % 2 == 0){
                evens.add(nr);
            }
        }
        return evens;
    }

    public static int sumIntegers(List<Integer> integers){

        if (integers == null){
            throw new IllegalArgumentException("List can not be null");
        }

        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();
    }


    public static boolean integerContainsNull(List<Integer> integers){
        if (integers == null){
            return false;
        }

        return integers.stream()
                .anyMatch(Objects::nonNull);

    }




    public static void main(String[] args) {
        System.out.println(evenIntegers(numbers));
        System.out.println(evenIntegers2(nulls));
        System.out.println(sumIntegers(numbers));
    }

    }
