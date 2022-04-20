package com.humble.java_coding_problems.c1.p11_to_20.p20;

public class Concatenating_the_same_string_n_times {

    public static String concatRepeat(String str, int n){

        StringBuilder sb = new StringBuilder(str.length() * n);

        for (int i = 1; i <= n ; i++) {
            sb.append(str);
        }

        return sb.toString();
    }

    static String result = "Hello".repeat(5);


    public static void main(String[] args) {

        System.out.println(result);
        System.out.println(concatRepeat("World", 5));;
    }
}
