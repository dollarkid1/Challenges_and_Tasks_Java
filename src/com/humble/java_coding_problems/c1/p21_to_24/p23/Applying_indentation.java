package com.humble.java_coding_problems.c1.p21_to_24.p23;

import java.util.Arrays;
import java.util.List;

public class Applying_indentation {

    public static void main(String[] args) {
        List<String> days = Arrays.asList("Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday");

        for (int i = 0; i < days.size(); i++) {
            System.out.println(days.get(i).indent(i));
        }
        String day = "friday" + "monday";

        System.out.println(day.indent(1));
    }
}
