package com.humble.java_coding_problems.c1.p1_to_10.p10;

public class Generating_all_permutations {

    static void permute_and_print(String prefix, String str){

        int n = str.length();

        if (n == 0){
            System.out.println(prefix + "");
        }else {
            for (int i = 0; i < n; i++) {
                permute_and_print(prefix + str.charAt(i),
                str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }

  /*  static void permute_and_print_stream(String prefix, String str){

        int n = str.length();

        if (n == 0){
            System.out.println(prefix + " ");
        }else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i -> permute_and_print_stream(prefix + str.charAt(i),
                            str.substring(i + 1, n) + str.substring(0, 1)));
        }
    }

   */



    public static void main(String[] args) {
        permute_and_print("","ABC");
       // permute_and_print_stream("","ABC");
    }
}
