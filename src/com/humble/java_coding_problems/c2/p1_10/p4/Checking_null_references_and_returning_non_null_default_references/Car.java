package com.humble.java_coding_problems.c2.p1_10.p4.Checking_null_references_and_returning_non_null_default_references;

import java.awt.*;

public class Car {

    private final String name;
    private final Color color;


    public Car(String name, Color color) {

        if (name == null){
            this.name = "No name";
        }else
        this.name = name;

        if (color == null){
            this.color = new Color(0, 63, 255);
        }
        else
        this.color = color;
    }
}
