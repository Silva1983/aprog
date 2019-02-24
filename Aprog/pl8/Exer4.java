/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 *
 * Elabore uma aplicação que leia uma sequência de N números inteiros
 * obrigatoriamente todos diferentes e mostre os M números maiores, sendo N e M
 * definidos pelo utilizador.
 */
public class Exer4 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = new int[Exer2.intNum("Indique o tamanho (N) da sequência")];
        intArray(vetor);
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.println(vetor[i]);
//        }
        ordenarVetor(vetor);
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.println(vetor[i]);
//        }
        maiores(vetor);
    }

    public static void maiores(int[] vetor) {
        int m = intNum("Indique a quantidade de nºs maiores (M)");
        while (m > vetor.length) {
            m = intNum("Erro! Nº de maiores (M) superior ao tamanha da sequência (N)");
        }

        for (int i = vetor.length - 1; i > vetor.length - 1 - m; i--) {
            System.out.println(vetor[i]);
        }
    }

    public static void ordenarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int k = i + 1; k < vetor.length; k++) {
                if (vetor[k] < vetor[i]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[k];
                    vetor[k] = temp;
                }
            }
        }
    }

    public static void intArray(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = intNum("Insira um nº inteiro");
        }
    }

    public static int intNum(String msg) {
        System.out.println(msg);
        int num = input.nextInt();

        while (num <= 0) {
            System.out.println("Erro! Insira um nº positivo");
            num = input.nextInt();
        }
        return num;
    }

//    Inserir tamanho do array (outra versão)
//    int[][] vetor = intNum();
//    public static int[] intNum() {
//        System.out.println("Insira N");
//        int num = input.nextInt();
//
//        while (num <= 0) {
//            System.out.println("Erro! Insira um nº positivo");
//            num = input.nextInt();
//        }
//        return new int[num];
//    }
}
