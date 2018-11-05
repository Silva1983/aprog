/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5_1;

import java.util.Scanner;
/**
 *
 * @author mariapires
 */
public class PL5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, n, i, s=0, c=0;
        double m;
        System.out.println("Quantos números deseja testar?");
        Scanner ler;
        ler= new Scanner (System.in);
        n= ler.nextInt();
        for (i=1; i<=n; i++){
            System.out.println("Introduza um número:");
            Scanner ler2;
            ler2= new Scanner (System.in);
            num= ler2.nextInt();
            if (num%2==0){
                c++;
                s= s+num;
            }
        }
        if(c!=0){
            m=s/c;
            System.out.println(m);
        }
        else{
            System.out.println("Não existem números pares.");
            }
    }
}

            
            
       
            
       
        
               

 
            
            
                
        
        
    
    

