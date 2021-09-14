package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
       float P=0,Pt=0,D=0;
        int Kw=0;

        System.out.println("Kw consumidos pela casa:");
        Scanner teclado = new Scanner(System.in);
        Kw = teclado.nextInt();

        System.out.println("Valor por Kw:");
        Scanner mouse = new Scanner(System.in);
        P = mouse.nextFloat();

        Pt+= Kw * P;
        //D+= Pt - ((10/100) * Pt);

        if (Kw < 150){
            D = D + (Pt - ((float)0.1 * Pt));
            System.out.printf("O valor total a ser pago é de R$ %.2f",D);
        }
        else {
            System.out.printf("O valor total a ser pago é de R$ %.2f",Pt);
        }


        //a = Kw < 150 ? D:Pt;

      // System.out.printf("O valor total a ser pago é de R$ %.2f",a);



    }
}
