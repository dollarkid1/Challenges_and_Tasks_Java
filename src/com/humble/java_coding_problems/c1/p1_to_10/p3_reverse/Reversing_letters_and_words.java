package com.humble.java_coding_problems.c1.p1_to_10.p3_reverse;

public class Reversing_letters_and_words {

    private static final String WHITESPACE = " ";

    static String reverseWords(String str){

        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word: words){
            StringBuilder reversedWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--){
                reversedWord.append(word.charAt(i));
            }

            reversedString.append(reversedWord).append(WHITESPACE);
        }

        return reversedString.toString();
    }


    public static void main(String[] args) {
        System.out.println( reverseWords("I love gifts"));
    }

}
