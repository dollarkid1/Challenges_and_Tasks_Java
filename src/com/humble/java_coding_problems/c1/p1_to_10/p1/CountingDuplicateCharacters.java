package com.humble.java_coding_problems.c1.p1_to_10.p1;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateCharacters {

    static void countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        // or use for(char ch: str.toCharArray()) { ... }

//        for(char ch: str.toCharArray()) {
//            char ch = str.charAt(i);
//            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
//        }

        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch,(k,v) -> (v == null) ? 1 : ++v);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        countDuplicateCharacters("23ccvh2");
        countDuplicateCharacters("madam");

    }


}
