package com.company;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        float a , b , s , m , d , sub;

        Scanner id1 = new Scanner (System.in);
        System.out.println("A: ");
        a = id1.nextInt();

        Scanner id2 = new Scanner (System.in);
        System.out.println("B: ");
        b = id2.nextInt();

        s = a + b;
        sub = a - b;
        m = a * b;
        d = a / b;

        System.out.println("A = "+ a);
        System.out.println("B = "+ b);
        System.out.println("Soma= "+ s);
        System.out.println("Subtração = "+ sub);
        System.out.println("Multiplicação = "+ m);
        System.out.println("Divisão = "+ d);


    }
}
