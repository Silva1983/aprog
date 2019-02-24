/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg7;

/**
 *
 * @author ssilv
 */
import java.util.Scanner;
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Serão introduzidos dois valores nas variáveis numA e numB, se a variável numA tiver uma valor
        maior que a variável numB, o programa coloca o maior valor na variável numB e o menor na variável
        numA. O programa pede valores que serão armazenados na variável num e depois verifica quantos desses
        valores são divisiveis por numA e numB.
        */
        int numA,numB, aux, d;
        int num=0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Introduza dois valores");
        numA = ler.nextInt();
        numB = ler.nextInt();
        
        if (numA > numB){
            aux = numA;
            numA = numB;
            numB = aux;
        }
        
         
        int cont = 0;
        System.out.println("Quantos números quer introduzir?");
        
        d = ler.nextInt();
        for (int i =0; i <= d-1; i++){
            do{
                System.out.println("Introduza números");
                num = ler.nextInt();
            } while (num < 0);
            
            if ( num % numA == 0 && numB % num == 0){
                
                cont++;
            }
        }
        
        System.out.println("Foram introduzidos "+ cont + " números divisiveis de "+ numA +" e multiplicador de "+ numB);
    }
}
    

