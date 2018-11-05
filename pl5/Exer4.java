/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 *
 * Elabore um programa em Java que determine e visualize os N primeiros números
 * perfeitos. Um número é perfeito se for natural e for igual à soma de todos os
 * seus divisores (excluindo o próprio número). Na codificação do programa
 * utilize a classe Scanner para a entrada de dados e a classe System para a
 * saída de dados.
 *
 */

public class Exer4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cont = 0;
        long num = 1, soma = 0;
        
        System.out.println("Quantos nºs perfeitos quer verificar?");
        int n = input.nextInt();

        while (cont < n) {

            for (int i = 1; i < num; i++) {

                if (num % i == 0)

                    soma = soma + i;               
            }
            if (soma == num) {
                cont++;
                System.out.println("O nº " + num + " é perfeito.");
            }
            num++;
            soma = 0;
        }
    }
}