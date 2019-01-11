/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl_8;

import java.util.Scanner;

/**
 *
 * @author ssilv
 */
public class ex_2 {
    static Scanner ler = new Scanner (System.in);
    public static void main(String[] args) {
        int linha;
        System.out.println("Introduza as dimensoes da matriz: ");
        linha = ler.nextInt();
        
        while (linha <= 1){
            System.out.println("Valor inválido, introduza um valor maior do que 1");
            linha = ler.nextInt();
        }
        
        int dia = linha - 1; 
        int matriz[][] = new int[linha][linha];
        matriz = preencherMatriz(matriz);
        verMatriz(matriz);
        int somaLinha[] = somaLinhaMatriz(matriz);
        int somaColuna[] = somaColunaMatriz(matriz);
        int somaDiagonal = somaDiagonalMatriz(matriz);
        int somaSecundaria = somaDiagonalSecundaria(matriz, dia);
        verificaQuadro(matriz, somaLinha, somaColuna, somaDiagonal, somaSecundaria, linha);
    }
    
    public static int [][]preencherMatriz (int matriz[][]){
        
        for (int i =0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.println("Introduza valor para a linha " + i+ " coluna " + j+": ");
                
                matriz[i][j]=ler.nextInt();
            }
        }
        return matriz;
    }
    
    public static void verMatriz(int matriz[][]){
        for (int i = 0; i<matriz.length;i++){
            for (int j = 0; j< matriz[i].length; j++){
            }
        }
    }
    
    public static int [] somaLinhaMatriz(int matriz[][]){
        int s[] = new int [matriz.length];
        for (int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                s[i] = s[i] + matriz[i][j];     
            }
        }
        return s;
    }
        
    public static int []somaColunaMatriz(int [][]matriz){
        int c[] = new int [matriz.length];
        
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                c[i] = c[i] + matriz[j][i];   
            }
        }
        return c;
    }
      
       public static int somaDiagonalMatriz(int [][]matriz){
           int d = 0;
           for (int i=0; i<matriz.length; i++){
               d = d + matriz[i][i];
               for(int j=0; j<matriz[i].length; j++){
                   
               }   
           }
           return d;
       }
       
       public static int somaDiagonalSecundaria(int [][] matriz, int dia){
           int sec=0;
           for (int i=0; i <matriz.length; i++) {
                for (int j=0; j<matriz[i].length; j++){
                    if (i+j == dia)
                        sec = sec + matriz[i][j];
               }
           }
           return sec;
       }
  
       public static void verificaQuadro(int matriz[][], int somaLinha[],int somaColuna[], int somaDiagonal, int somaSecundaria, int linha){
           int i, cont=0, valor=0;
           for ( i= 0; i<matriz.length; i++){
                if(somaLinha[i] == somaColuna[i]){
                    cont++;
                    valor = somaLinha[i];
                }
           }
           if (cont == linha && somaDiagonal== somaSecundaria && somaDiagonal == valor)
               System.out.println("True");
           else
               System.out.println("False");
       }
}
