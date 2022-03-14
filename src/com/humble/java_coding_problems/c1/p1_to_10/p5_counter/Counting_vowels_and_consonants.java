package com.humble.java_coding_problems.c1.p1_to_10.p5_counter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Counting_vowels_and_consonants {

    static final Set<Character> allVowel =
            new HashSet<>(Arrays.asList('a','e','i','o','u'));


/*    static Pair<Integer, Integer>
    countVowelAndConsonants (String str){

        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (allVowel.contains(ch)){
                vowels++;
            }else if((ch >= 'a' && ch <= 'z')){
                consonants++;
            }
        }

        return Pair.of(vowels, consonants);
    }

 */

}
