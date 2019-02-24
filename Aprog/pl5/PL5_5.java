/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5_5;

import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, d, aux=1, res=0;       
    System.out.println("Insira um número:");
    Scanner ler = new Scanner (System.in);
    num= ler.nextInt();
    while (num != 0){
        d=num%10;
        if (d%2==1){
            res=res+d*aux;
            aux=aux*10;
        }
       num=num/10;
    }
    System.out.println("O resultado é:"+res);
    }
}
