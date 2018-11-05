/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5_4;

import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, num, cont = 0;
        System.out.println("Introduza um número:");
        Scanner ler;
        ler= new Scanner(System.in);
        num= ler.nextInt();
        for (i = 1; i < num; i++) {
            if (num%i==0) {
                cont = cont + i;
            }
        }
            if (num == cont) {
                System.out.println("É um número perfeito.");
            }
                else {
                System.out.println("Não é um número perfeito.");
            }
        }
    }


