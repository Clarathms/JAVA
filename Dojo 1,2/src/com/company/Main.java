package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int n1,n2,n3,media=0,rec,nf=0;

        System.out.println("Insira as notas:");

        Scanner teclado = new Scanner(System.in);
        n1 = teclado.nextInt();
        Scanner mouse = new Scanner(System.in);
        n2 = mouse.nextInt();
        Scanner tela = new Scanner(System.in);
        n3 = tela.nextInt();

            media += (n1+ n2 + n3) / 3;

            if (media >= 7) {
                System.out.println("O aluno passou direto!");
            }

            else if(media>=4) {
                System.out.println("O aluno ficou de prova final");

                System.out.println("Insira a nota da prova final:");
                Scanner v1 = new Scanner(System.in);
                rec = v1.nextInt();

                nf+= (media + rec) / 2;

                    if(nf>=5){
                        System.out.println("O aluno passou");
                    }
                    else{
                        System.out.println("O aluno reprovou");
                    }
            }

            else{
                System.out.println("Reprovado");
            }

        //**********************************************************

        int pd,pf,mf;
            media=0;
            nf=0;
        int n7,n8,n9;

        System.out.println("\n\nInsira as notas de avaliação (minima para passar direto,minima para fazer a prova final e minima para passar na media final)");

        Scanner v2 = new Scanner (System.in);
        pd = v2.nextInt();
        Scanner v3 = new Scanner(System.in);
        pf = v3.nextInt();
        Scanner v4 = new Scanner(System.in);
        mf = v4.nextInt();

        System.out.println("Insira as notas:");

        Scanner v5 = new Scanner (System.in);
        n7 = v5.nextInt();
        Scanner v6 = new Scanner(System.in);
        n8 = v6.nextInt();
        Scanner v7 = new Scanner(System.in);
        n9 = v7.nextInt();


        media += (n7+ n8 + n9) / 3;

        if (media >= pd) {
            System.out.println("O aluno passou direto!");
        }

        else if(media>=pf) {
            System.out.println("O aluno ficou de prova final");
            System.out.println("Insira a nota da prova final:");

            Scanner v1 = new Scanner(System.in);
            rec = v1.nextInt();
            
            nf+= (media + rec) / 2;

            if(nf>=mf){
                System.out.println("O aluno passou");
            }
            else{
                System.out.println("O aluno reprovou");
            }
        }

        else{
            System.out.println("Reprovado");
        }
    }
}
