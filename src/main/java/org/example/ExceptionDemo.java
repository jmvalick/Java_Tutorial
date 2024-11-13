package org.example;

import jdk.incubator.vector.VectorOperators;

import java.awt.*;

public class ExceptionDemo {
    public static void main(String a[])
    {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }
        catch (Exception e){
            System.out.println("Divide by zero");
        }

        System.out.println(j);

    }
}
