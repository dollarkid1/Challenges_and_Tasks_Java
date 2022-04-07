package com.humble.java_coding_problems.c1.p1_to_10.p6_occurences;

public class Counting_the_occurrences_of_a_certain_character {
    static int countOccurrencesOfACertainCharacter(String str, char ch){
        return str.length() - str.replace(String.valueOf(ch), "").length();

    }

    public static void main(String[] args) {
        System.out.println(countOccurrencesOfACertainCharacter("microservice",'i'));
    }
}
