/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ginasio;

/**
 *
 * @author ssilv
 */
import java.util.Scanner;
public class GinasioMain {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Ginasio g1 = new Ginasio();
        System.out.println("Introduza o nome do utente");
        g1.setNome(ler.nextLine());
        
        System.out.println("Introduza o genero do " + g1.getNome());
        g1.setGenero(ler.nextLine());
        
        System.out.println("Introduza a idade do " + g1.getNome());
        g1.setIdade(ler.nextInt());
        
        System.out.println("Introduza a altura do " + g1.getNome());
        g1.setAltura(ler.nextDouble());
        
        System.out.println("Introduza o peso do " + g1.getNome());
        g1.setPeso(ler.nextDouble());
        
        System.out.println("****************************************************************************");
        System.out.println(g1.toString());
        System.out.println(g1.grauObesidade());
        
        Ginasio g2 = new Ginasio("Joao", "masculino", 40, 1.80, 80);
        System.out.println("****************************************************************************");
        System.out.println(g2.toString());
        
        System.out.println("A diferença de idade entre " + g1.getNome()+ " e o " +g2.getNome()+ " é de: " + Math.abs(g1.calcularDiferenca(g2.getIdade()))+ " anos");
        
        System.out.println("O IMC do " + g1.getNome() +" é de: " + g1.calcularIMC());
        
        
        g1.maisVelho(g2.getNome(), g2.getIdade());
        
        //j
        System.out.println("Número de instâncias criadas: " + Ginasio.getTotalGinasio());
        
        
    }
}
