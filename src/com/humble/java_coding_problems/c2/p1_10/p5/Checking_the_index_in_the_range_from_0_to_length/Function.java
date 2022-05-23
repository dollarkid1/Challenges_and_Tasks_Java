package com.humble.java_coding_problems.c2.p1_10.p5.Checking_the_index_in_the_range_from_0_to_length;

import java.util.Objects;

public class Function {

    public static final int X_UPPER_BOUND = 11;
    public static final int Y_UPPER_BOUND = 16;
    private final int x;

    public Function(int x) {

        if (x < 0 || x >= X_UPPER_BOUND){
            throw new IndexOutOfBoundsException("...");
        }
        this.x = x;
    }

    public int xMinusY (int y){

        if (y < 0 || y >= x) {
            throw new IndexOutOfBoundsException("...");
        }
        return x-y;
    }

    public int oneMinusY (int y){

        if (y < 0 || y >= Y_UPPER_BOUND) {
            throw new IndexOutOfBoundsException("...");
        }
        return 1-y;
    }

}

class Function_2 {

    public static final int X_UPPER_BOUND = 11;
    public static final int Y_UPPER_BOUND = 16;
    private final int x;

    public Function_2(int x) {
        this.x = Objects.checkIndex(x, X_UPPER_BOUND);
    }

    public int xMinusY (int y){
        Objects.checkIndex(y, x);
        return x-y;
    }

    public int oneMinusY (int y){

        Objects.checkIndex(y, Y_UPPER_BOUND);
        return 1-y;
    }

}
