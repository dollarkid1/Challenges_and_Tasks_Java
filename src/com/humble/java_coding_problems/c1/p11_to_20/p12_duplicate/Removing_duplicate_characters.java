package com.humble.java_coding_problems.c1.p11_to_20.p12_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Removing_duplicate_characters {

    static String remove_duplicates(String str){

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch: chars){
            if (sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    static String remove_duplicates_2(String str){

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashset = new HashSet<>();

        for (char c: chars){
            if (chHashset.add(c)){
                sb.append(c);
            }
        }

        return sb.toString();
    }

    static String remove_duplicates_with_functional_style(String str){
        return Arrays.asList(str.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(remove_duplicates("i love love"));
        System.out.println(remove_duplicates_2("i love love"));
    }
}
