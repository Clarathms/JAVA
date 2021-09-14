package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println ("Tempo em seg:");

        int seg ,min = 0,hr = 0,segt = 0,mint = 0;

        Scanner teclado = new Scanner (System.in);
        seg = teclado.nextInt();

        min += seg/60;
        segt += seg % 60;
        hr += min/60;
        mint += min % 60;

        System.out.printf ("O tempo total sera de %d : %d : %d", hr,mint,segt);


    }

}
