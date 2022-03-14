package com.humble.java_coding_problems.c1.p1_to_10.p3_reverse;

public class Reversing_letters_and_words_StringBuilder_reverse_method {

    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("i love you"));
    }
}
