package com.company;

import java.util.Scanner;
public  class Main {
    public static void main (String[]args){

        float salario,aumento,x,sf;

        Scanner sal = new Scanner (System.in);
        System.out.println("Digite o Salário: ");
        salario = sal.nextFloat();

        Scanner aum = new Scanner (System.in);
        System.out.println("Digite o percentual de aumento: ");
        aumento = aum.nextFloat();

        x = (aumento/100) * salario;
        sf = x + salario;

        System.out.println("O aumento foi de R$ " + x);
        System.out.println("O aumento total foi de R$" + sf);
    }
}