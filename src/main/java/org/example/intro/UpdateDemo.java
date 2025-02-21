package org.example.intro;

record Alien(int id, String name) { };

public class UpdateDemo {

    public static void main(String[] args){

        // var data type
        int num1 = 9;
        var num2 = 8;

        var string = "gem";

        var nums = new int[10];

        // record class
        Alien a1 = new Alien(1, "Bob");
        Alien a2 = new Alien(2, "Jim");

        System.out.println(a1.equals(a2));
        System.out.println(a1);
        System.out.println(a2.name());

    }
}

