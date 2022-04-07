package com.humble.java_coding_problems.c1.p11_to_20.p18;

public class Checking_whether_two_strings_are_anagrams {

    private static final int EXTENDED_ASCII_CODES = 256;

    public static boolean isAnagram(String str1, String str2){

        int[] chCounts = new int [EXTENDED_ASCII_CODES];
        char[] chStr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] chStr2 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();

        if (chStr1.length != chStr2.length){
            return false;
        }

        for (int i = 0; i < chStr1.length; i++) {
            chCounts[chStr1[i]]++;
            chCounts[chStr2[i]]++;
        }

        for (int i = 0; i < chCounts.length; i++) {
            if (chCounts[i] != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        isAnagram("fresh", "fresh");
    }


}
