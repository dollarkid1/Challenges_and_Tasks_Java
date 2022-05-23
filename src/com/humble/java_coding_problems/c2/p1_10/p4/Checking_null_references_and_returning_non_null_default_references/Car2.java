package com.humble.java_coding_problems.c2.p1_10.p4.Checking_null_references_and_returning_non_null_default_references;

import java.awt.*;
import java.util.Objects;

public class Car2 {

    private final String name;
    private final Color color;


    public Car2(String name, Color color) {

        this.name = Objects.requireNonNullElse(name, "No name");

        this.color = Objects.requireNonNullElseGet(color, () -> new Color(0, 63, 255));
    }
}
