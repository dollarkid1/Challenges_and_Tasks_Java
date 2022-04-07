package com.humble.java_coding_problems.c1.p11_to_20.p17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counting_substring_occurrences_in_a_string {

    public static int countStringInString(String str, String toFind){

        int position = 0;
        int count = 0;
        int n = toFind.length();

        while ( (position =  str.indexOf(toFind, position)) != 1 ){
            position = position + n;
            count++;
        }

        return count;
    }

    public static int countStringInString2(String str, String toFind){

        int result = str.split(Pattern.quote(toFind), -1).length -1;

        return result < 0 ? 0 : result;
    }


    /*In the second case (11 in 111 occurs 2 times), the solution can rely on the Pattern and
Matcher classes in a simple implementation, as follows:
     */
    public static int countStringInString_1(String str, String toFind){

        Pattern pattern = Pattern.compile(Pattern.quote(toFind));
        Matcher matcher = pattern.matcher(str);

        int position = 0;
        int count = 0;

        while (matcher.find(position)){
            position = matcher.start() + 1;
            count++;
        }

        return count;
    }
}
