package com.humble.java_coding_problems.c1.p11_to_20.p11_palindrome;

import java.util.stream.IntStream;

public class Checking_whether_a_string_is_a_palindrome {

    static boolean isPalindrome(String str){

        int left = 0;
        int right = str.length() - 1;

        while (right > left){
            if (str.charAt(left) != str.charAt(right)) { return  false; }

            left++;
            right--;
        }
        return true;
    }


    static boolean isPalindrome2(String str){

        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }

        return true;
    }

    static boolean isPalindrome3(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    static boolean isPalindromeWithFunctionalStyle(String str){
        return IntStream.range(0, str.length() / 2)
                .noneMatch(p -> str.charAt(p) != str.charAt(str.length() - p - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome2("madam"));
        System.out.println(isPalindrome3("madam"));
        System.out.println(isPalindromeWithFunctionalStyle("fugazi"));
    }

}
