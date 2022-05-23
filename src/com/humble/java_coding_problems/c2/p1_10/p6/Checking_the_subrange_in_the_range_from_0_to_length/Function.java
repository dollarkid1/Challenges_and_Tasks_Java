package com.humble.java_coding_problems.c2.p1_10.p6.Checking_the_subrange_in_the_range_from_0_to_length;

import java.util.Objects;

public class Function {

    private static final int N_UPPER_BOUND = 101;
    private final int n;


    public Function(int n) {

        if (n < 0 || n >= N_UPPER_BOUND){ throw new IndexOutOfBoundsException("...");}
        this.n = n;
    }

    public int yMinusX(int x, int y){

        if (x < 0 || x > y || y >= n){ throw new IndexOutOfBoundsException("...");}
        return y - x;
    }
}
 class Function1 {
    private static final int N_UPPER_BOUND = 101;
    private final int n;
    public Function1(int n) {
        this.n = Objects.checkIndex(n, N_UPPER_BOUND);
    }
    public int yMinusX(int x, int y) {
        Objects.checkFromToIndex(x, y, n);
        return y - x;
    }
}
