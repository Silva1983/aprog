/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

import java.util.Scanner;

/**
 * @author ASUS
 *
 * Elabore um programa modular que tenha as seguintes funcionalidades: a)
 * Leitura de N números inteiros para um vetor, sendo N definido pelo
 * utilizador; b) Inversão da ordem dos elementos do vetor; Exemplo: c)
 * Apresentação do vetor invertido; d) Rotação para a direita dos elementos do
 * vetor invertido; Exemplo: e) Apresentação do vetor rodado. Nota: A solução
 * deve ser desenvolvida numa única classe e exclusivamente em modo texto.
 * Deverá apresentar os resultados relativos às alíneas c) e e), em linhas
 * consecutivas, com os números separados por um espaço e sem quaisquer outros
 * carateres. No caso do exemplo apresentado o output deverá ser: 4 3 2 2 4 3
 */
public class Exer4 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num = lerInts("Insira o N");
        int[] vec = new int[num];
        inserirNum(vec);
        invertVec(vec);
        print(vec);
        rotateVec(vec);
        print(vec);
    }

    private static void rotateVec(int[] vec) {
        int k = vec[vec.length-1];
        for (int i = vec.length-1; i > 0 ; i--) {
            vec[i] = vec[i-1];
        }
        vec[0]=k;
    }

    private static void print(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            if (i == vec.length - 1) {
                System.out.print(vec[i]);
            } else {
                System.out.format("%d%s", vec[i], " ");
            }
        }
        System.out.println("");
    }

    private static void invertVec(int[] vec) {
        for (int i = vec.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                int k = vec[i];
                vec[i] = vec[j];
                vec[j] = k;
            }
        }
    }

    private static void inserirNum(int[] vec) {

        for (int i = 0; i < vec.length; i++) {
            if (i == vec.length - 1) {
                System.out.println("Insira o último nº");
                vec[i] = input.nextInt();
            } else {
                System.out.println("Insira o " + (i + 1) + "º nº");
                vec[i] = input.nextInt();
            }
        }
    }

    private static int lerInts(String insert) {
        System.out.println(insert);
        int num = input.nextInt();
        while (num <= 0) {
            System.out.println("Nº inválido. Insira novamente");
            num = input.nextInt();
        }
        return (num);
    }
}
