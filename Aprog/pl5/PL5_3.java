/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5_3;

import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade, numero_pessoas=0, numero_adultos=0;
        String nome = "nome";
        String lista_nomes = "";
        Scanner ler = new Scanner (System.in);
        /* Enquanto o nome for diferente de zzz vai ler nomes e idades */
        while(!nome.equals("zzz"))
        {
            // Pergunta o nome
            System.out.println("Introduza o nome. Para terminar digite zzz");
            nome = ler.next();
            if(!nome.equals("zzz"))
            {
                // Pergunta a idade
                System.out.println("Introduza a idade:");
                idade= ler.nextInt();
                // Adiciona mais uma pessoa ao número de pessoas lidas
                numero_pessoas++;
                // Identifica quantas pessoas são maiores de idade
                if(idade >= 18)
                {
                    numero_adultos++;
                    // Adiciona o nome à lista de nomes
                    lista_nomes += nome + ", ";
                }
            }
        }
        // Verifica se foram inseridas pessoas
        if(numero_pessoas > 0)
        {
            // Verifica se existem adultos
            if(numero_adultos > 0)
            {
                // Calcula a percentagem de adultos
                double percentagem = ((double)numero_adultos/(double)numero_pessoas)*100;
                // Escreve resposta
                System.out.println("A percentagem de pessoas com idade maior ou igual a 18 anos é: " + percentagem +
                        " e os seus nomes são: " + lista_nomes + ".");
            }
            else // Então não há adultos
            {
                System.out.println("Não há pessoas com idade superior ou igual a 18 anos!");
            }
        }
        else // Então não há pessoas
        {
            System.out.println("Não foram inseridas pessoas!");
        }
    }
}
