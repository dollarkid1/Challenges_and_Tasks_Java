package com.humble.java_coding_problems.c1.p11_to_20.p13_removing;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Removing_a_given_character {

    static String removing_character(String str, char ch){
        return str.replaceAll
                (Pattern.quote(String.valueOf(ch)), "");
    }

    static String removing_character_2(String str, char ch){

        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for (char c: chars){
            if (c != ch){
                sb.append(c);
            }
        }

        return sb.toString();
    }

    static String removing_character_with_functional_styles(String str, char ch){

        return str.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(removing_character("i love = love", 'i'));
        System.out.println(removing_character_2("i love = love", 'i'));
        System.out.println(removing_character_with_functional_styles("i love = love", 'i'));
    }
}
