package com.humble.java_coding_problems.c2.p1_10.p7.Equals_and_HashCode;

import java.util.Objects;

public class Player {

    public int id;
    public String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }


//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj){
//            return true;
//        }
//
//        if (obj == null){
//            return false;
//        }
//
//        if (getClass() != obj.getClass()){
//            return false;
//        }
//
//        final Player other = (Player) obj;
//
//        if (this.id != other.id){
//            return false;
//        }
//
//        if (!Objects.equals(this.name, other.name)){
//            return false;
//        }
//
//        return true;
//    }

    public static void main(String[] args) {

        Player p1 = new Player(1, "Dan Lee");
        Player p2 = new Player(1, "Dan Lee");




        System.out.println(p1.equals(p2));

        System.out.println("p1 hash code: " + p1.hashCode());
        System.out.println("p2 hash code: " + p2.hashCode());

        Player2 p3 = new Player2(1, "Dan Lee");
        Player2 p4 = new Player2(1, "Dan Lee");

        System.out.println(p3.equals(p4));

        System.out.println("p1 hash code: " + p3.hashCode());
        System.out.println("p2 hash code: " + p4.hashCode());


    }
}

 class Player2 {

     private int id;
     private String name;

     public Player2(int id, String name) {
         this.id = id;
         this.name = name;
     }


     @Override
     public boolean equals(Object obj) {

         if (this == obj) {
             return true;
         }

         if (obj == null) {
             return false;
         }

         if (getClass() != obj.getClass()) {
             return false;
         }

         final Player2 other = (Player2) obj;

         if (this.id != other.id) {
             return false;
         }

         if (!Objects.equals(this.name, other.name)) {
             return false;
         }

         return true;
     }
 }