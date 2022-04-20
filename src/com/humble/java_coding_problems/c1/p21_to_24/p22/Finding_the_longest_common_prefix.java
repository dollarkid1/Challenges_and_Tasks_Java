package com.humble.java_coding_problems.c1.p21_to_24.p22;

public class Finding_the_longest_common_prefix {

   static String[] texts = {"import", "intel", "impose", "ib", "imso", "impact"};

    public static String longestCommonPrefix(String[] strs){

        if(strs.length == 1){
            return strs[0];
        }

        int firstLen = strs[0].length();

        for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
            char ch = strs[0].charAt(prefixLen);
            for (int i = 1; i < strs.length; i++) {
                if (prefixLen >= strs[i].length() || strs[i].charAt(prefixLen) != ch){
                    return strs[i].substring(0, prefixLen);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(texts));
    }
}
