package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int dist = 0, t = 0, l = 0, Vm = 0, comb = 0;

        System.out.println ("Distancia percorrida (Km) :");
        Scanner teclado = new Scanner(System.in);
        dist = teclado.nextInt();

        System.out.println("Tempo gasto (H) : ");
        Scanner mouse = new Scanner (System.in);
        t = mouse.nextInt();

        System.out.println("Consumo de combustivel (L) :");
        Scanner tela = new Scanner (System.in);
        l = tela.nextInt();

        Vm += dist/t;
        comb += dist/l;

        System.out.printf ("A velocidade media é %d Km/h e o consumo de combustivel foi de %d Km/l",Vm,comb);


    }
}
