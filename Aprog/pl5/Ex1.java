/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

import java.util.*;
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*Respota a alinea a)
        c <- contador de números pares (variável cont)
        n <- Quantidade de números a introduzir 
        s <- soma os números pares introduzidos (variável soma)
        m <- media dos números pares introduzidos (variável media)
        Este programa pergunta ao utilizador quantos números quer introduzir, desses números, verifica se
        há números pares, calcula a média da soma dos números pares e calcula a média da quantidade dos 
        números pares.*/
        
        int cont =0;
        int soma = 0;
        int num;
        int n;
        double media;
        
       
        Scanner ler = new Scanner (System.in);
        
        System.out.printf("Quantos números quer introduzir?");
        n = ler.nextInt();
        
        for (int i=0; i <= n-1; i++){
            System.out.println("Introduza um número");
            num = ler.nextInt();
            if (num % 2 == 0){
                cont = cont + 1;
                soma = soma + num;
            }   
        }   
        if (cont != 0){
            media = soma / cont;
            System.out.println("A média da soma dos números pares é "+media+"e a média dos números introduzidos é de "+ (double)cont/n);
        }else{
            System.out.println("Não existem números pares");
        }
    }
    
}
