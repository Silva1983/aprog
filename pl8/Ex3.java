/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl_8;

/**
 *
 * @author ssilv
 */
import java.util.Scanner;
public class Ex3 {
    public static Scanner ler = new Scanner (System.in);
    public static void main (String[] args){
        
        System.out.println("Introduza o número de linhas da matriz");
        int linhas = ler.nextInt();
        System.out.println("Introduza o número de colunhas da matriz");
        int colunas = ler.nextInt();
        
        int matriz[][] = new int[linhas][colunas];
        int freq[] = new int [linhas * colunas];
        int []vetor = new int [(linhas * colunas) + 1];
        
        int []vec = new int[linhas * colunas];
        
        matriz = preencherMatriz(matriz);
        mostrarMatriz(matriz);
        vetor = converterVetor(matriz, vetor);
        int []vetorOrdenado = ordernarVetor(vetor);
        mostrarVetor(vetorOrdenado);
        
        contarElementos(vetor, freq);
    }
    public static int [][]preencherMatriz(int matriz[][]){
        
        for (int i = 0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("Introduza o valor para a linha " + i + " e para a coluna "+ j+": ");
                matriz[i][j] = ler.nextInt();
            }
        }
        return matriz;
        }
    
    public static void mostrarMatriz(int matriz[][]){
        for (int i=0; i<matriz.length; i++){
            System.out.println(" ");
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print("\t" + matriz[i][j]);
            }
        }
    }
        
    public static int []converterVetor(int matriz[][], int []vetor ){
        System.out.println(" \n");
        int k=0 ;
        for (int i =0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                k++;
                vetor[k] = matriz[i][j];
            }
        }
        return vetor;
    }
    
    public static int []ordernarVetor (int []vetor){
        System.out.println("\n ");
        for (int i = vetor.length-1; i>1; i--){
            for (int j=i-1; j>0; j--){
                if (vetor[i] > vetor[j]){
                    int temp = vetor[i];
                    vetor[i]=vetor[j];
                    vetor[j]= temp;
                }
            }
        }
        for(int i = 0; i<vetor.length-1; i++){
            for (int j=i; j<vetor.length; j++){
                vetor[i]= vetor[i+1];
                
            }
        }
        return vetor;
    }
    public static void mostrarVetor(int []vetor){
        System.out.println("\n");
        for(int i =0; i<vetor.length-1; i++){
            System.out.print("\t" + vetor[i]);
        }
    }
    
    
    public static void contarElementos(int []vetor, int []freq){
        int cont=1; int num=0; int cont2=0; int temp=0;
        int qt[] = new int[vetor.length];
        
        for (int i = 0; i<vetor.length-1; i++){
            cont = 0;
            for ( int j=1; j<vetor.length; j++){
                if ( vetor[j] == vetor[i]){
                    cont++;
                    qt [i] = cont;
                }
            }
        }
  
        System.out.println("");
        System.out.println("");
        System.out.print("\t" + vetor[0]);
        for (int i=0; i<vetor.length-1; i++){
            if(vetor[i]!= vetor[i+1]){
                System.out.print("\t" + vetor[i+1]);  
            }
            if (vetor[0] == vetor[i]){
                cont2++;
            }
        }
        System.out.println("");
        System.out.print("\t" + cont2);
        for (int i = 0; i<vetor.length-1; i++){
            
            if (vetor[i] != vetor[i+1]){
                
                System.out.print("\t" + (qt[i+1]));
            }
        
        }
        System.out.println("");
    }
}