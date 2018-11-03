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

public class ex3 {
    
    public static void main(String[] args) {
      
       
       medidasTriangulo();
       
       
    }
    
    public static void angulos(double  a,double  b, double c){
        
       
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Introduza os lados adjacentes do ângulo que quer calcular");
        a = ler.nextDouble();
        b = ler.nextDouble();
        
        System.out.println("Introduza o lado oposto ao angulo que quer calcular");
        c = ler.nextDouble();
        
        double angulo = (a*a + b*b - c*c) / (2 *a * b);
        double ang = Math.acos(angulo);
        
        System.out.println(" O angulo mede: " + (int)((Math.toDegrees(ang))) + "º");
    }
    
    public static void medidasTriangulo(){
        int a, b, c ; 
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza os 2 lados adjacentes ao angulo que quer calcular ");
        
        a = ler.nextInt();
        b = ler.nextInt();
        
        while (a <= 0){
            System.out.println("Valor inválido, introduza valores válidos");
            a = ler.nextInt();
            b = ler.nextInt();
          
        }
        System.out.println("Introduza o lado oposto ao angulo");
        c = ler.nextInt();
        while ( c <= 0){
            System.out.println("Valor inválido, introduza um valor válido");
            c = ler.nextInt();
          
        }
        triangulo(a, b, c);
        
    }
    public static void triangulo(int a, int b, int c){
    
       
             if ((a +b > c) && (a + c > b) && (b +c > a)){
                 System.out.println("É possível formar triângulo");
                 
             }   else{
                 System.out.println("Não é possível formar triângulo");
                 medidasTriangulo();
                 
             }
             angulos(a, b, c);
             angulos(a,b,c);
             angulos(a,b, c);
             
    }
}
