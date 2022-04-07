package com.humble.java_coding_problems.c1.p1_to_10.p10;

import java.util.*;

public class Generating_all_permutations_2 {

    static  Set<String> permute_and_store(String prefix, String str){

        Set<String> permutation = new HashSet<>();

        int k = str.length();

        if (k == 0){
            permutation.add(prefix);
        }else {
            for (int i = 0; i < k; i++) {
                permutation.addAll(permute_and_store(prefix + str.charAt(i),
                        str.substring(i + 1, k) + str.substring(0, i)));
            }
        }

        return permutation;
    }

    public static void main(String[] args) {
        System.out.println(permute_and_store("","abc"));
    }

}
