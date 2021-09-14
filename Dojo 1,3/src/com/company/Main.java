package com.company;

import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        int n1,n2,n3,n4,n5,media=0;

        System.out.println("Digite os 5 numeros iniciais");

        Scanner v1 = new Scanner(System.in);
        n1 = v1.nextInt();
        Scanner v2 = new Scanner(System.in);
        n2 = v2.nextInt();
        Scanner v3 = new Scanner(System.in);
        n3 = v3.nextInt();
        Scanner v4 = new Scanner(System.in);
        n4 = v4.nextInt();
        Scanner v5 = new Scanner(System.in);
        n5 = v5.nextInt();

        media += (n1+n2+n3+n4+n5) / 5;
        int nr;

        do {

            System.out.println("Digite um numero:");
            Scanner v6 = new Scanner(System.in);
            nr = v6.nextInt();

                if (nr < media) {
                    System.out.println("Menor");
                }
                else if (nr > media) {
                    System.out.println("Maior");
                }
                else {
                    System.out.println("Acertou!");
                }

        } while ( nr != media );


        //*****************************************************

        Random random = new Random();

       int media2 = random.nextInt(50);
       int nr2 = 0;
       int i = 0 ;

        for ( i = 0 ; i < 16;i++) {

            if (i != 15){

                System.out.println("Digite um numero:");
                Scanner v6 = new Scanner(System.in);
                nr2 = v6.nextInt();

                if (nr2 < media2) {
                    System.out.println("Menor");
                }
                else if (nr2 > media2) {
                    System.out.println("Maior");
                }
                else {
                    System.out.println("Acertou!");
                    break;
                }
            }
            else {
                System.out.println("Suas tentativas acabaram!");
                break;
            }
        }











    }
}
