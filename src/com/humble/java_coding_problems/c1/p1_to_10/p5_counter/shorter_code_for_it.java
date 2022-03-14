package com.humble.java_coding_problems.c1.p1_to_10.p5_counter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class shorter_code_for_it {

    private static final Set<Character> allVowels
            = new HashSet<>(Arrays.asList('a','e','i','o','u'));


/*    public static Pair<Long, Long> countVowelsAndConsonants(String str){

        Map<Boolean, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .collect(partitioningBy(c -> allVowels.contains(c), Collectors.counting()));

        return Pair.of(result.get(true), result.get(false));

    }

 */

}
