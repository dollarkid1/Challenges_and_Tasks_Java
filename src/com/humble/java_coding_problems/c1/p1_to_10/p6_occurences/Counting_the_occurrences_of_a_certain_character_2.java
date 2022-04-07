package com.humble.java_coding_problems.c1.p1_to_10.p6_occurences;

public class Counting_the_occurrences_of_a_certain_character_2 {

    /*The following solution covers Unicode surrogate pairs as well*/

    public static int countOccurrenceOfACertainCharacter(String str, char ch){

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count ++;
            }
        }
        return count;
    }


    public static long countOccurrenceOfACertainCharacter2(String str, char ch){

        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(countOccurrenceOfACertainCharacter("monica lewinshy", 'i'));
        System.out.println(countOccurrenceOfACertainCharacter2("monica lewinshy", 'i'));
    }

}
