package com.humble.java_coding_problems.c1.p1_to_10.p9;

import java.util.StringJoiner;

public class Joining_multiple_strings_with_a_delimiter {

    static String join_by_delimiter(char delimiter, String[] args){

        StringBuilder result = new StringBuilder();

        int j = 0;

        for (int i = 0; i < args.length; ++i) {
            result.append(args[i]).append(delimiter);
        }
        result.append(args[j]);

        return result.toString();
    }


    static String join_by_delimiter2(char delimiter, String... args){

        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for (String arg: args){
            joiner.add(arg);
        }

        return joiner.toString();
    }

    static String join_by_delimiter_(CharSequence delimiter, CharSequence... elems){

        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for (CharSequence elem: elems){
            joiner.add(elem);
        }

        return joiner.toString();
    }

    static String eg = String.join(" ", "sarah", "was", "sad");


    public static void main(String[] args) {
        System.out.println(join_by_delimiter('-',new String[]{"123","456", "789"}));

        System.out.println(join_by_delimiter2('-', "123","456", "789"));

        System.out.println(join_by_delimiter_("+", "123","456", "789"));

        System.out.println(eg);
    }
}
