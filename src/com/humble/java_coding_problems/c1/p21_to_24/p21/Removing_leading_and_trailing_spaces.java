package com.humble.java_coding_problems.c1.p21_to_24.p21;

public class Removing_leading_and_trailing_spaces {

    public static void main(String[] args) {
        String text = "\n \n \n hello \t \n \r";
        String trimmed = text.trim();
        System.out.println(text);
        System.out.println(trimmed);
    }
}
