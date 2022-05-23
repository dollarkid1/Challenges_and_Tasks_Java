package com.humble.java_coding_problems.c2.p1_10.p2.CheckingNullReferencesAndThrowingCustomizedNullPointerException;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class Car {

    private final String name;
    private final Color color;

    public Car(String name, Color color) {

        if (name == null){
            throw new NullPointerException("Car name can't be null");
        }
        if (color == null){
            throw new NullPointerException("Car color can't be null");
        }
        this.name = name;
        this.color = color;
    }

    public static void assignDriver(String licence, Point location){

        if (licence == null){
            throw new NullPointerException("Car licence can't be null");
        }
        if (location == null){
            throw new NullPointerException("Car location can't be null");
        }
    }
}

 class Car1 {

    private final String name;
    private final Color color;

    public Car1(String name, Color color) {

        if (name == null){
            throw new NullPointerException("Car name can't be null");
        }
        if (color == null){
            throw new NullPointerException("Car color can't be null");
        }
        //this.name = name;
        String[] carList = {"toyota", "ford", "kia"};
        this.name = Objects.requireNonNull(name, ()->
                "Car name can't be null... Consider one from "+ Arrays.toString(carList));
        this.color = color;
    }

    public static void assignDriver(String licence, Point location){

        if (licence == null){
            throw new NullPointerException("Car licence can't be null");
        }
        if (location == null){
            throw new NullPointerException("Car location can't be null");
        }
    }


}
