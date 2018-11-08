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
       /* 
        O programa preenche um vector de 10 elementos introduzidos pelo utilizador, depois de preenchido,
        verifica quais desses elementos são pares, calcula a quantidades, a sua soma e por último, a média
        desses números.
        */
       
       
        int i, s = 0, c = 0;
        int [] v = new int[10];
        
        
        Scanner ler = new Scanner (System.in);
        
        for (i = 0; i < v.length; i++){
            System.out.println("Número");
            v[i] = ler.nextInt();
        }
        int menor = menorInteiro(v);
        System.out.println("O menor número introduzido foi "+ menor);
        mostraIndice(menor, v);
        
        for (i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                s = s + v[i];
                c++;
                 
            }
        }
        System.out.println("A soma dos números pares é de: "+s);
        if (c != 0)
            System.out.println("A média dos números pares é de: " +((double)s)/c);
        else
            System.out.println("Operação impossível de realizar");
    }
    
    public static int menorInteiro (int v[]){
        int indice = 0;
        int menor = v[0];
        
        for (int i = 0; i <v.length; i++){
            if (v[i] < menor){
                menor = v[i];
                indice = i+1;
            }
       }
        return menor;
    }
    
    public static void mostraIndice (int menor, int v[]){
        
        
        for (int i = 0; i<v.length; i++){
            if (v[i] == menor ){
                System.out.println("Os menores indices desses números são "+ i);
            }
            
        }
        
    }
    
   
}
