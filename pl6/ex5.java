/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL6;

/**
 *
 * @author ssilv
 */

import java.util.Scanner;
public class ex5 {
    
    
    public static void main(String[] args){
        
        int i=1;
            Scanner ler = new Scanner(System.in);
            System.out.println("Quantas vezes quer repetir a sequência?");
            int rep = ler.nextInt();
            
            while ( rep <= 0){
                System.out.println("Número inválido, introduza outro número de repetição");
                rep = ler.nextInt();
            }
            while (i <= rep){
                
                digito(rep, i);
                i++;
            }
    }
        public static void digito(int rep, int i) {
            
            
            System.out.println(i);
            int pos=0;
            int maior=0;
            int temp3 = 0;
            int temp4 = 0;
            
            Scanner ler = new Scanner (System.in);
            
            System.out.println("Introduza dois digitos");
            int num1 = ler.nextInt();
            int num2 = ler.nextInt();
            
            int temp1 = num1;
            int temp2 = num2;
            
            while(num1 != 0 || num2!= 0){
                int dig1= num1 % 10;
                int dig2 = num2 % 10;
                
                if (dig1 == dig2){
                    pos++;
                    if (maior < pos){
                        maior = pos;
                        temp3 = temp1;
                        temp4 = temp2;
                    }           
                    
                }
                num1 = num1 / 10;
                num2 = num2 / 10;
                      
            }
           if (pos == 0){
                System.out.println("Sem resultado");
           }else{
                System.out.println("Os números " + temp1 + " e " + temp2 + " têm " + pos + " digitos nas mesmas posições");
            }
           if (i == rep)
               System.out.println("A maior sequencia "+ temp3+ " e "+ temp4);
    }
        
        
}
