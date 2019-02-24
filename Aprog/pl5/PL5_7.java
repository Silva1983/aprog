/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5_7;

import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, aux, num, c, d, e;

        System.out.println("Qual o valor a?");
        Scanner ler;
        ler = new Scanner(System.in);
        a = ler.nextInt();

        System.out.println("Qual o valor do b?");
        Scanner ler2;
        ler2 = new Scanner(System.in);
        b = ler2.nextInt();

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        e = 0;

        System.out.println("Quantos números deseja testar?");
        Scanner ler3;
        ler3 = new Scanner(System.in);
        d = ler3.nextInt();

        for (c = 1; c <= d; c++) {
            do {
                System.out.println("Insira um número:");
                Scanner ler4;
                ler4 = new Scanner(System.in);
                num = ler4.nextInt();
            } while (num < 0);
            if ((num % a) == 0 && (b % num) == 0) {
                e = e + 1;
            }
        }
        System.out.println("Foram introduzidos " + e + " números que são divisores de " + a + " e múltiplos de " + b);
    }
}

