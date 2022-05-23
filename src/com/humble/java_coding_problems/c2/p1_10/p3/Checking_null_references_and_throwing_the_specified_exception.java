package com.humble.java_coding_problems.c2.p1_10.p3;

import java.util.function.Supplier;

public class Checking_null_references_and_throwing_the_specified_exception {

    public static <T> T requireNonNullElseThrowIAE(T obj, String message){
        if (obj == null){
            throw new IllegalArgumentException(message);
        }
        return obj;
    }

    public static <T> T requireNonNullElseThrowIAE(T obj, Supplier<String> messageSupplier){
        if (obj == null){
            throw new IllegalArgumentException(messageSupplier == null ? null : messageSupplier.get());
        }
        return obj;
    }

}
