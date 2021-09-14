package com.company;

import java.util.Scanner;

 public class Main {
     public static void main (String[]args) {
/*
         final double PI = 3.14;
         double p,a;
         double raio;

         System.out.println("Raio do círculo: ");

            Scanner raio_leitura =  new Scanner (System.in);
            raio =  raio_leitura.nextInt();
        System.out.println("O Raio é " + raio);

        p = raio * 2 * PI;
        a = PI*(raio*raio);

        System.out.println("O Perímetro do círculo é: " + p);
        System.out.println("A Àrea do circulo é: " + a);

     }

*/

         System.out.println("tempo em segs:");

         int hora, min,seg;
         Scanner leitura = new Scanner (System.in);
         seg = leitura.nextInt();

         min = seg/60;
         hora = min / 60;

         System.out.println("O tempo total é de " + hora );
         System.out.println(": " + min );
         System.out.println(": " + seg );



     }

 }