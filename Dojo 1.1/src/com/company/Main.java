package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    int ano,dist=0,dias,data=0,dias_ano=0,dpa=0;

    System.out.println("Insira o ano:");
    Scanner teclado = new Scanner(System.in);
    ano = teclado.nextInt();

    System.out.println("Insira o dia:");
    Scanner mouse = new Scanner(System.in);
    dias = mouse.nextInt();

        //Paridade
        if (ano%2 == 0) {
            System.out.println("Paridade: Par");
        }
        else {
            System.out.println("Paridade: Ímpar");
        }

        //Bissexto
        if (ano % 400 == 0 || ano %4 == 0 && ano % 100 != 0) {
            System.out.println("Bissexto: true");
        }
        else {
            System.out.println("Bissexto: false");
        }

        // Anos de dist de 2020
        if (ano<= 2020) {
           dist+= 2020 - ano;
        }
        else {
            dist += ano - 2020;
        }
    System.out.printf("Distancia: %d\n",dist);

    //*****************************************************************


        for (int i = 1;i <=12;i++){     //definir o ano em 360d e 12 meses
           if (i <=12){
               dias_ano+= 30 ;
               if (dias <= dias_ano){      //meses
                   data+= dias - (dias_ano-30); //dias
                   System.out.printf("Data: %d/%d/%d\n",data,i,ano);
                   break;
               }
           }
        }

         dpa+= 360 - dias; // Dias p acabar o ano

    System.out.printf("Dias para acabar o ano: %d", dpa);
    }
}
