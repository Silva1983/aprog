/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl_8;

import java.util.Scanner;
public class ex4 {
    public static Scanner ler = new Scanner (System.in);
    public static void main (String args[]){
        System.out.println("Quantos números quer introduzir");
        int N = ler.nextInt();
        int []vec = new int[N];
        for( int i = 0; i<vec.length; i++){
            System.out.println("Digite o número para a posição "+ (i+1) );
            int valor = ler.nextInt();
            while(verificaVetor (vec, i, valor )){
                System.out.println(valor + " já existe no vetor. Digite outro valor: ");
                valor = ler.nextInt();
            }
            vec[i] = valor;
        }
        int M = vec.length;
        verVec(vec, M);
        pausa();
        System.out.println("Quantos números quer ver?");
        M = ler.nextInt();
        while(M>N){
            System.out.println("Valor inválido, introduzido um número inferior a "+ N);
            M = ler.nextInt();
        }
        int []ord = ordenarVec(vec);
        pausa();
        verVec(ord, M);
    }
    private static boolean verificaVetor(int []vetor, int numPercorrido, int numero){
        for( int i = 0; i<numPercorrido; i++){
            if ( vetor[i] == numero){
                return true;
            }
        }
        return false;
    }
    public static void verVec(int []vec, int M){
        for(int i = 0; i<M; i++){
            System.out.print(vec[i] + "\t");
        }
    }
    public static int []ordenarVec(int []vec){
        for(int i = 0; i<vec.length-1; i++){
            for(int j = i+1; j<vec.length; j++){
                if (vec[i] < vec[j]){
                    int temp = vec[i];
                    vec[i] = vec[j];
                    vec[j] = temp;
                }
            }
        }
        return vec;
    }
    public static void pausa(){
        System.out.println("\n==================================================");
        System.out.println("Pressione Enter para continuar");
        ler.nextLine();
        ler.nextLine();
    }
}
