package com.humble.java_coding_problems.c1.p1_to_10.p2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Finding_the_first_non_repeated_character3 {

    static void firstNonRepeatedCharacter (String str){

        Map<Integer, Long> chs = str
                .codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));


        int cp = chs.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));

        System.out.println(String.valueOf(Character.toChars(cp)));
    }

    public static void main(String[] args) {
        firstNonRepeatedCharacter("Love Love you");
    }
}

/* This d solution has been written in
Java 8 functional style. Moreover, the functional style solution for supporting ASCII,
16-bit Unicode, and Unicode surrogate pairs is as follows */