/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 *
 * Faça um programa que represente sob a forma de gráficos de barras, o número
 * de positivas e negativas dos alunos de uma turma a um conjunto de
 * disciplinas. O programa deverá começar por pedir o nº de alunos da turma e o
 * nº de disciplinas e para cada disciplina pedirá o nome da disciplina e o nº
 * de alunos aprovados. Deve existir um módulo para imprimir a informação de uma
 * disciplina. O output produzido deverá ter o seguinte aspeto: Disciplina:
 * Português - Positivas: *********** - Negativas: **** Disciplina: Matemática -
 * Positivas: *********** - Negativas: *********
 */
public class Exer2 {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nAlunos = lerInts("Quantos alunos tem a turma?");
        int nDisc = lerInts("Quantas disciplinas tem a turma?");

        input.nextLine();
        System.out.println("Indique a disciplina.");
        String nomeDisc = input.nextLine();

        System.out.println("Quantos alunos tiveram aprovação à disciplina?");
        int positivas = input.nextInt();
        int negas = nAlunos - positivas;

        discInfo(nomeDisc, positivas, negas);

        if (nDisc > 1) {

            System.out.println();
            for (int i = 0; i <= nDisc - 1; i++) {
                
                System.out.println("Indique a próxima disciplina.");
                String nomeDisc2 = input.nextLine();
                input.nextLine();

                System.out.println("Quantos alunos tiveram aprovação à disciplina?");
                int positivas2 = input.nextInt();
                int negas2 = nAlunos - positivas2;

                discInfo(nomeDisc2, positivas2, negas2);

                System.out.println();
                
                i++;
            }
        }
    }

    private static int lerInts(String wtv) {
        int num;
        System.out.println(wtv);
        do {
            num = input.nextInt();
            if (num <= 0) {
                System.out.println("O nº inserido é inválido. Insira novamente.");
            }
        } while (num <= 0);

        return num;
    }

    private static void discInfo(String discName, int aprovados, int reprovados) {

        System.out.println("Disciplina: " + discName);
        System.out.print("- Positivas: ");

        for (int j = 0; j < aprovados; j++) {
            System.out.print("*");
        }

        System.out.printf("%n- Negativas: ");
        for (int j = 0; j < reprovados; j++) {
            System.out.print("*");
        }
    }
}
