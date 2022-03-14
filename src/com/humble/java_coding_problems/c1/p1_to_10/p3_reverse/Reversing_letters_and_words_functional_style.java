package com.humble.java_coding_problems.c1.p1_to_10.p3_reverse;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Reversing_letters_and_words_functional_style {

    private static final Pattern PATTERN = Pattern.compile(" +");

    static String reverseWords(String str){
        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(reverseWords(" i love her"));
    }
}
