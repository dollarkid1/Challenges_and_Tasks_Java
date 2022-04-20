package com.humble.java_coding_problems.c1.p21_to_24.p24;

public class Transforming_strings {
    public static void main(String[] args) {
        String result = "hello".transform(s -> s + " world");
        System.out.println(result);

        String result1 = "hello".transform(String::toUpperCase)
                .transform(s -> s.repeat(2))
                .transform(s -> s.replaceAll("O", "OOO"));

        System.out.println(result1);

    }

}
