package com.humble.java_coding_problems.c1.p1_to_10.p4_checker;

public class String_contains_only_digits_checker2 {

    static boolean contains_only_digits(String str){
        return str.matches("[0-9]+");
    }

    public static void main(String[] args) {
        System.out.println(contains_only_digits("83423"));
    }
}
