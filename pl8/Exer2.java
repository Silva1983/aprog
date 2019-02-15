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
 * Um quadrado mágico é uma matriz quadrada de números inteiros onde a soma dos
 * números de qualquer linha, de qualquer coluna e de cada uma das diagonais dá
 * sempre o mesmo valor. Exemplo de um quadrado mágico: 8 1 6 3 5 7 4 9 2
 * Elabore uma aplicação modular que permita verificar se uma dada matriz é um
 * quadrado mágico. Deve iniciar pedindo ao utilizador a dimensão da matriz e,
 * de seguida, cada um dos seus elementos. A solução deve ser desenvolvida numa
 * única classe e exclusivamente em modo texto. A mensagem a apresentar deverá
 * ser apenas: true ou false.
 *
 */
public class Exer2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int linhas = intNum("Insira o nº de linhas");
        int colunas = intNum("Insira o nº de colunas");
        while (linhas != colunas) {
            System.out.println("Erro! Nº de linhas diferente do nº de colunas");
            linhas = intNum("Insira o nº de linhas");
            colunas = intNum("Insira o nº de colunas");
        }
        int[][] matriz = new int[linhas][colunas];
        elemMatriz(matriz);
        int soma = soma(matriz);
        boolean linha = calcLinha(matriz, soma);
        boolean coluna = calcColuna(matriz, soma);
        boolean diagonal1 = calcDiagonal1(matriz, soma);
        boolean diagonal2 = calcDiagonal2(matriz, soma);
        boolean flag = true;
        mostrar(matriz);

        if (linha == true && coluna == true && diagonal1 == true && diagonal2 == true) {
            System.out.println(flag);
        } else {
            flag = false;
            System.out.println(flag);
        }
    }

    public static void mostrar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz.length; k++) {
                System.out.printf("%d%s", matriz[i][k], " ");
            }
            System.out.println();
        }
    }

    public static boolean calcDiagonal2(int matriz[][], int soma) {
        boolean flag = false;
        int somaD = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaD += matriz[i][matriz[0].length - 1 - i];
        }
        System.out.println(somaD);
        if (somaD == soma) {
            flag = true;
        } else {
            return flag;
        }
        return flag;
    }

    public static boolean calcDiagonal1(int matriz[][], int soma) {
        boolean flag = false;
        int somaD = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaD += matriz[i][i];
        }
        System.out.println(somaD);
        if (somaD == soma) {
            flag = true;
        } else {
            return flag;
        }
        return flag;
    }

    public static boolean calcColuna(int matriz[][], int soma) {
        boolean flag = false;
        for (int i = 0; i < matriz[0].length; i++) {
            int somaC = 0;
            for (int k = 0; k < matriz.length; k++) {
                somaC += matriz[i][k];
            }
            System.out.println(somaC);
            if (somaC == soma) {
                flag = true;
            } else {
                return flag;
            }
        }
        return flag;
    }

    public static boolean calcLinha(int matriz[][], int soma) {
        boolean flag = false;
        for (int i = 1; i < matriz.length; i++) {
            int somaL = 0;
            for (int k = 0; k < matriz[i].length; k++) {
                somaL = somaL + matriz[i][k];
            }
            System.out.println(somaL);
            if (somaL == soma) {
                flag = true;
            } else {
                return flag;
            }
        }
        return flag;
    }

    public static int soma(int matriz[][]) {
        int soma = 0;
        for (int i = 0; i < 1; i++) {
            for (int k = 0; k < matriz[0].length; k++) {
                soma += matriz[i][k];
            }
        }
        return soma;
    }

    public static void elemMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[0].length; k++) {
                System.out.println("Insira o " + (k + 1) + "º nº da " + (i + 1) + "ª linha");
                matriz[i][k] = input.nextInt();
            }
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
}
