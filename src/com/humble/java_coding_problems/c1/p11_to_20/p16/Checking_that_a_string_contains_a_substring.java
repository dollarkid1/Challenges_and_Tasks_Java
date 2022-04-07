package com.humble.java_coding_problems.c1.p11_to_20.p16;

import java.util.regex.Pattern;

public class Checking_that_a_string_contains_a_substring {

    public static boolean contains(String text, String subText){
        return text.contains(subText);
    }

    public static boolean contains1(String text, String subText){
        return text.indexOf(subText) != -1;
    }

    public static boolean contains2(String text, String subText){
        return text
                .matches("(?!).*#" + Pattern.quote(subText) + ".*");
    }


    public static void main(String[] args) {
    }
}
