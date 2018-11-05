/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5_2;

import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp, N, i, max=-100, dia = 0;
        
    System.out.println("Introduza o número de dias:");
    Scanner ler;
    ler= new Scanner(System.in);
    N= ler.nextInt();
    for (i=1; i<=N ; i++){
        System.out.println("Introduza a temperatura máxima:");
        Scanner ler2;
        temp= ler.nextInt();
        if (temp>max){
            max=temp;
            dia=i;
        }
    }
    if(max<-30 || max>=50){
        System.out.println("O dia com a temperatura máxima mais elevada foi o dia"+dia+"=Temperatura Extrema");
    }
    else if (max<9){
        System.out.println("O dia com a temperatura máxima mais elevada foi o dia"+dia+"=Muito Frio");
        }
    else if (max<15){
        System.out.println("O dia com a temperatura máxima mais elevada foi o dia"+dia+"=Frio");
        }
    else if (max<20){
        System.out.println("O dia com a temperatura máxima mais elevada foi o dia"+dia+"=Ameno");
        }
    else if (max<30){
        System.out.println("O dia com a temperatura máxima mais elevada foi o dia"+dia+"=Quente");
        }
    else if (max<50){
        System.out.println("O dia com a temperatura máxima mais elevada foi o dia"+dia+"=Muito Quente");
        }
    }
}

    
   
    
    
            

