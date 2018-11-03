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
public class ex7 {
    
   
    public static void main(String[] args) {
        
        
        
        
        octal();
        
      
    }
    //Verifica se o número é octal
    private static void octal(){
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza um número");
        int num = ler.nextInt();
        
        int oct = 0;
        int temp = num;
        while (num != 0){
           int dig = num % 10;
           
           num = num / 10;
           
           if (dig >  7)
              oct ++;
        }
        if (oct > 0 ){
            System.out.println("Número não é octal");
        }else{
            System.out.println("Número é octal");
            num = temp;
            conversao(num, oct); 
        }
          
        
        
    }
    
    private static void conversao(int num, int oct){
        long exp = 0;
        double total=0;
        int temp = num;
        while (num != 0){
            int dig = num % 10;
            num = num / 10;
            total = Math.pow(8, exp) * dig + total;
            exp++;
        }
        System.out.println(" O número " + temp + " em octal é: "+(int)total);
        octal();
    }
}
