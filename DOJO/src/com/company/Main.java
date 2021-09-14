package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input do ano e qtd de dias
        System.out.println("Insira o ano: ");
        int ano = scanner.nextInt();
        System.out.println("Insira o dia: ");
        int quant_dias = scanner.nextInt();

        //verificar se ele é impar
        //Acessando a pasta System
        System.out.println("Paridade: " + (ano % 2 == 0 ? "Par" : "Ímpar"));
        //verificar se é bissexto
        System.out.println("Bissexto: " + (((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) ? "true" : "false"));

        //verificar distancia
        int distancia = ano - 2021;

        if (distancia < 0)
            distancia *= -1;

        System.out.println("Distância = " + distancia);



        /*for (int i = 1;i <=12;i++){     //definir o ano em 360d e 12 meses
            if (i <=12){
                dias_ano+= 30 ;
                if (dias <= dias_ano){      //meses
                    data+= dias - (dias_ano-30); //dias
                    System.out.printf("Data: %d/%d/%d\n",data,i,ano);
                    break;
                }
            }
        }*/

        while(quant_dias > 360 || quant_dias <= 0){
            System.out.println("Dia inválido, insira-o novamente: ");
            quant_dias = scanner.nextInt();
        }

        int dia, mes;

        dia = quant_dias % 30;
        mes = quant_dias / 30 + 1;

        System.out.printf("%d / %d / %d\n", dia, mes, ano);

        System.out.println("Dias restantes: " + (360 - quant_dias));

    }
}