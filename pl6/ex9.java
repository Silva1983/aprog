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
public class ex9 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int lim;
        int a = 0;
        int b = 1;
        int pos = 0;
        System.out.println("Introduza o limite máximo da sequencia fabonacci");
        lim = ler.nextInt();
        
        while ( pos < lim){
            
            if ( pos < lim){
                System.out.println(a);
                pos++;
            }
            if (pos < lim){
                System.out.println(b);
                pos++;
            }
            a= a+ b;
            b = b+ a;
            
        }
    }
    
}
