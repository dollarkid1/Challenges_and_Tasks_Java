package com.humble.java_coding_problems.c1.p1_to_10.p8;

public class Removing_white_spaces_from_a_string {

    static String remove_white_spaces(String str){
        return str.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(remove_white_spaces("i love you too dear"));
    }
}
