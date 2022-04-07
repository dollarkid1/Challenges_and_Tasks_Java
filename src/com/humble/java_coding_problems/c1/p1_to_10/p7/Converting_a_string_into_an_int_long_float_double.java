package com.humble.java_coding_problems.c1.p1_to_10.p7;

public class Converting_a_string_into_an_int_long_float_double {

    private static final String TO_INT = "453";
    private static final String TO_LONG = "45234223233";
    private static final String TO_FLOAT = "45.823F";
    private static final String TO_DOUBLE = "13.83423D";

    public static void main(String[] args) {

        int toInt = Integer.parseInt(TO_INT);
        long toLong = Long.parseLong(TO_LONG);
        float toFloat = Float.parseFloat(TO_FLOAT);
        double toDouble = Double.parseDouble(TO_DOUBLE);

        Integer to_int = Integer.valueOf(TO_INT);
        Long to_long = Long.valueOf(TO_LONG);
        Float to_float = Float.valueOf(TO_FLOAT);
        Double to_double = Double.valueOf(TO_DOUBLE);

        System.out.println(toInt);
        System.out.println(to_int);

    }
}
