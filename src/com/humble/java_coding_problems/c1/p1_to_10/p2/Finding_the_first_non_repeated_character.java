package com.humble.java_coding_problems.c1.p1_to_10.p2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Finding_the_first_non_repeated_character {

    static void firstNonRepeatedCharacter(String str){
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()){
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
            }

            System.out.println(Character.MIN_VALUE);
        }

    }

    public static void main(String[] args) {
        firstNonRepeatedCharacter("llkkjjhhgf");
    }
}
