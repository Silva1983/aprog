/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_7b;

import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL6_7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int octal, dig, ord=0, decimal=0;
        Scanner leitor = new Scanner (System.in);

        System.out.println("Introduza um número de base 8:");
        octal = leitor.nextInt();
        
        while (octal!=0) {
            dig = octal%10;
            decimal = (int) (decimal + (dig * Math.pow(8, ord)));
            ord = ord + 1;
            octal = octal/10;
        }  
             System.out.println("O número convertido para decimal é = " + decimal);
        }
}

