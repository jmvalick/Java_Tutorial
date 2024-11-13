package org.example;

@FunctionalInterface
interface A
{
    int add(int i, int j);
}


public class FunctionalInterfaceDemo
{
    public static void main(String A[]) {
        A obj = (i, j) -> i+j;
        int result = obj.add(5, 8);
        System.out.println(result);
    }
}

