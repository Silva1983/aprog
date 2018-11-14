/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * Pretende-se uma aplicação modular para determinar algumas estatísticas sobre
 * vencimentos de funcionários duma empresa. O número de funcionários varia ao
 * longo do tempo mas não é superior a 20. O programa deve ter as seguintes
 * funcionalidades: a) Leitura de nomes e vencimentos de funcionários da
 * empresa. A leitura deve terminar com a introdução do nome “tt”; b) Listagem
 * dos nomes dos funcionários com vencimentos inferiores à média; c)
 * Apresentação da percentagem de funcionários com vencimentos inferiores a um
 * dado valor fornecido pelo utilizador.
 * Nota: A solução deve ser desenvolvida numa única classe e exclusivamente em 
 * modo texto. A percentagem pedida deve ser apresentada com duas casas 
 * decimais. Para esse fim utilize System.out.format("%.2f%%", valor); em que 
 * valor é a percentagem a apresentar. Caso não haja resultados deve ser 
 * apresentada a mensagem: sem dados.
 */
public class Exer2 {
    
    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nomes = new String[20];
        float[] salarios = new float[20];
        lerNomesVenc(nomes, salarios);

        //remover para ficar em modo de texto
        System.out.println("Escolha uma das opções:\na) Funcionários com vencimentos inferiores à média"
        + "\nb) Percentagem de funcionários com vencimentos inferiores ao valor indicado");
        String op = input.nextLine();
        while (!op.equals("a") && !op.equals("b")) {
            System.out.println("A opção inserida é inválida. Insira novamente.");
            op = input.nextLine();
        }        
        switch (op) {
            case "a":
                inferiorMedia(nomes, salarios);
                break;
            case "b":
                System.out.println("Insira o valor");
                float valor = input.nextInt();
                
                System.out.format("%s%.2f%%", "A percentagem de funcionários com vencimentos inferiores a " + valor + " é de ", 
                        percentValor(salarios, valor));
                break;
        }
        //remover para ficar em modo de texto
    }
    
    private static float percentValor(float[] salarios, float valor) {
        float contInferiores = 0;
        float cont = 0;
                
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] < valor && salarios [i] > 0) {
                contInferiores += 1;
            }
            if (salarios[i] != 0) {
                cont++;
            }
        }
        float percentagem = contInferiores / cont * 100;
        
        return (percentagem);
    }
    
    private static void lerNomesVenc(String[] nomes, float[] salarios) {
        String nome;
        int nElem = 20;
        int cont = 0;
        float total = 0;
        
        for (int i=0; i < nElem; i++) {
            System.out.println("Insira o nome do " + (i+1) + "º funcionário");
            nomes[i] = input.nextLine();
            if (nomes[i].equalsIgnoreCase("tt")) {
                i = nElem;
            } else {
            salarios[i] = lerInt("Insira o vencimento de " + (nomes[i]));
            input.nextLine();
            cont++;
            total = total + salarios[i];
            }
        }
    }
    
    private static void inferiorMedia(String[] nomes, float salarios[]) {
        float total = 0;
        float cont = 0;

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] != 0) {
            total += salarios[i];
            cont++;
            }
        }
        float media = total / cont;
        System.out.println("Funcionários com vencimentos inferiores à média:");
        for (int j = 0; j < cont; j++) {
            if (salarios[j] < media) {
                System.out.println(nomes[j]);
            }
        }
    }
    
    private static int lerInt(String insert) {
        System.out.println(insert);
        int num = input.nextInt();
        while (num <= 0) {
            System.out.println("Nº inválido. Insira novamente.");
            num = input.nextInt();
        }
        return (num);
    }
}
