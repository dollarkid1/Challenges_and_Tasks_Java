package com.humble.java_coding_problems.c1.p1_to_10.p4_checker;

public class String_contains_only_digits_checker {

    static boolean contains_only_digits(String str){

        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(contains_only_digits("bbe123"));
        System.out.println(contains_only_digits("0701001082"));
    }
}
