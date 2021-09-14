package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int n;

        System.out.println("n:");
        Scanner teclado = new Scanner (System.in);
        n = teclado.nextInt();

        /// x = n%2 == 0 ? p : i;

        if (n%2 == 0) {
            System.out.println("Numero par");
        }
        else {
            System.out.println ("Numero impar");
        }



    }
}
