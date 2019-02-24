/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg5;

/**
 *
 * @author ssilv
 */
import java.util.Scanner;
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Resposta alinea a), Este programa separa os digitos impares de um número
            e forma um novo número com os digitos impares.
        */
        int res = 0;
        int aux = 1;
        int num;
        int d;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Introduza um número");
        num = ler.nextInt();
        
        while(num != 0){
            d = num  % 10;
            if(d % 2 == 1){
                res = res + d * aux;
                aux = aux * 10;    
            }
            num = num / 10;
        }
        System.out.println("O resultado é: "+res);
    }
    
}
