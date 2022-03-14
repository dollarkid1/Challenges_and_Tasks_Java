package com.humble.java_coding_problems.c1.p1_to_10.p1;

import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicateCharacters_2 {

    static void countingDuplicateCharacters(String str){
        Map<Character,Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(result);
    }

    public static void main(String[] args) {
        countingDuplicateCharacters("I am Motunrayo victoria, " +
                "and i want to be busty");
    }
}
