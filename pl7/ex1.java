/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl7;

/**
 *
 * @author ssilv
 */
import java.util.Scanner;

public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int i, s = 0, c = 0;
        int [] v = new int[10];
        
        int menor = menorInteiro(v); 
        Scanner ler = new Scanner (System.in);
        
        for (i = 0; i < v.length; i++){
            System.out.println("Número");
            v[i] = ler.nextInt();
        }
        
        for (i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                s = s + v[i];
                c++;
            }
        }
        if (c != 0)
            System.out.println(((double)s)/c);
        else
            System.out.println("Operação impossível de realizar");
    }
    
    public static int menorInteiro (int v[]){
        int menor = 0;
        for (int i = 0; i <v.length; i++){
            if (menor < v[i])
                menor = v[i];
            
        }
        return menor;
    }
}
