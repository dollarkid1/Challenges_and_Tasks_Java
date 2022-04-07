package com.humble.java_coding_problems.c1.p11_to_20.p14.finding_most;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Finding_the_character_with_the_most_appearances {

    static Map.Entry<Character, Integer> max_occurrence_character(String str){

        Map<Character, Integer> counter = new LinkedHashMap<>();
        char[] chStr = str.toCharArray();

        for (int i = 0; i < chStr.length; i++) {
            char currentCh = chStr[i];

            if (!Character.isWhitespace(currentCh)){//ignore spaces
                Integer noCh = counter.get(currentCh);

                if (noCh == null){
                    counter.put(currentCh, i);
                }else {
                    counter.put(currentCh, ++noCh);
                }
            }
        }
        int maxOccurrences = Collections.max(counter.values());
        char maxCharacter = Character.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : counter.entrySet()){
            if (entry.getValue() == maxOccurrences){
                maxCharacter = entry.getKey();
            }
        }

        return  null;//Map.of(maxCharacter, maxOccurrences);
    }


    

    public static void main(String[] args) {
        System.out.println(max_occurrence_character("i love you mom"));
    }
}
