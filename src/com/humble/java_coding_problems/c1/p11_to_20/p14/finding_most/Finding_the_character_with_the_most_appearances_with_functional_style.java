package com.humble.java_coding_problems.c1.p11_to_20.p14.finding_most;

public class Finding_the_character_with_the_most_appearances_with_functional_style {

    public static void main(String[] args) {

    }

  /*  public static Pair<Character, Long> maxOccurrenceCharacter(String str){

        return str.chars()
                .filter(c -> Character.isWhitespace(c) == false) //ignoring space
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(p -> Pair.of(p.getKey(), p.getValue()))
                .orElse(Pair.of(Character.MIN_VALUE, -1L));

    }

   */
}
