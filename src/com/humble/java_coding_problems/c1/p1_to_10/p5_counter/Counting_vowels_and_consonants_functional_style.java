package com.humble.java_coding_problems.c1.p1_to_10.p5_counter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Counting_vowels_and_consonants_functional_style {

    private static final Set<Character> allVowels
            = new HashSet<>(Arrays.asList('a','e','i','o','u'));

/*    static Pair<Long, Long> countVowelsAndConsonants(String str){

        str = str.toLowerCase();

        long vowel = str.chars()
                .filter(c-> allVowels.contains((char) c))
                .count();
        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();

        return Pair.of(vowel,consonants);
    }

 */
}
