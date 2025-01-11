package org.example.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputDemo {
    public static void main(String a[]) throws IOException {
/*        System.out.println("Enter number");
        int num1 = System.in.read();
        System.out.println(num1);  // prints ascii

 */

        System.out.println("Enter number");
        InputStreamReader in = new InputStreamReader(System.in);
        try(BufferedReader bf = new BufferedReader(in);){
            int num2 = Integer.parseInt(bf.readLine());
            System.out.println(num2);
            // bf.close(); // redundant
        }


        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.println(num3);
    }
}
