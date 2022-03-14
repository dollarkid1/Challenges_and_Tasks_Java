package com.humble.java_coding_problems.c1.p1_to_10.p4_checker;

public class String_contains_only_digits_checker_functional_style {

    static boolean contains_only_digits(String str){
        return !str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    static boolean contains_only_digits2(String str){
        return str.chars()
                .allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println(contains_only_digits("bk bmsf"));
        System.out.println(contains_only_digits2("03930"));
    }
}
