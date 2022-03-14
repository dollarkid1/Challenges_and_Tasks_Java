package com.humble.java_coding_problems.c1.p1_to_10.p2;

import java.util.Arrays;

public class Finding_the_first_non_repeated_character_2 {

    private static final int EXTENDED_ASCII_CODES = 256;

    static void firstNonRepeatedCharacter (String str){

        int[] flags = new int[EXTENDED_ASCII_CODES];

            // for (int i = 0; i < flags.length; i++){
//            flags[i] = -1;
//        }
        Arrays.fill(flags, -1);

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (flags[ch] == -1){
                flags[ch] = i;
            }
            else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0){
                position = Math.min(position, flags[i]);
            }
        }

        int result =
                position ==
                Integer.MAX_VALUE ? Character.MIN_VALUE
                : str.charAt(position);

        System.out.println(result);

    }

    public static void main(String[] args) {
        firstNonRepeatedCharacter("abiya");
    }

}
