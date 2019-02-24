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

        int positivas = lerAprovados(nomeDisc, nAlunos); 
        int negas = nAlunos - positivas;

        discInfo(nomeDisc, positivas, negas);

        if (nDisc > 1) {

            System.out.println();
            for (int i = 0; i <= nDisc - 1; i++) {
                
                input.nextLine();
                System.out.println("Indique a próxima disciplina.");
                String nomeDisc2 = input.nextLine();

                int positivas2 = lerAprovados(nomeDisc2, nAlunos);      
                int negas2 = nAlunos - positivas2;

                discInfo(nomeDisc2, positivas2, negas2);

                input.nextLine();
                
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
                System.out.println("O nº é inválido. Insira novamente.");
            }
        } while (num <= 0);

        return num;
    }
    
    private static int lerAprovados(String discName, int totalAlunos) {
        int aprovados;
        System.out.println("Quantos alunos tiveram aprovação a " + discName);
        aprovados = input.nextInt();
        while (aprovados > totalAlunos || aprovados < 0) {
            System.out.println("Nº de positivas maior que nº total de alunos. Insira novamente.");
            aprovados = input.nextInt();
        }
        return (aprovados);
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
        if (aprovados == 0) {
            System.out.println();
        }
    }
}
