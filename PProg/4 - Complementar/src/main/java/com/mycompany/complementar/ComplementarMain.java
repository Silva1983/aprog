/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.complementar;

/**
 *
 * @author ssilv
 */
import java.util.Scanner;
public class ComplementarMain {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        individuo c1 = new individuo();
        System.out.println("Introduza o nome");
        c1.setNome(ler.nextLine());
        
        System.out.println("Introduza a idade do " + c1.getNome());
        c1.setIdade(ler.nextInt());
        
        System.out.println("Introduza a altura do " + c1.getNome());
        c1.setAltura(ler.nextDouble());
        
        System.out.println("Introuza o peso do " + c1.getNome());
        c1.setPeso(ler.nextDouble());
        
        ler.nextLine();
        morada c2 = new morada();
        System.out.println("Introduza a morada do " + c1.getNome());
        c2.setMorada(ler.nextLine());
        
        System.out.println("Introduza o código postal do " + c1.getNome());
        c2.setPostal(ler.nextLine());
        
        System.out.println("Introduza a localidade do " + c1.getNome());
        c2.setLocalidade(ler.nextLine());
        
        System.out.println(c1.toString());
        System.out.println("*******************************************************************************************************");
        System.out.println(c2.toString());
        System.out.println("*******************************************************************************************************");
        
        if (c1.imc(c1.getPeso(), c1.getAltura()) < 16 && c1.imc(c1.getPeso(), c1.getAltura()) <=16.9){
            System.out.println("Muito abaixo do peso!");   
        }else
            if(c1.imc(c1.getPeso(), c1.getAltura()) > 16.9 && c1.imc(c1.getPeso(), c1.getAltura()) <=18.4){
                System.out.println("Abaixo do peso!");
            }else
                if (c1.imc(c1.getPeso(), c1.getAltura()) > 18.4 && c1.imc(c1.getPeso(), c1.getAltura()) <= 24.9){
                    System.out.println("Peso normal!");
                }else
                    if (c1.imc(c1.getPeso(), c1.getAltura()) > 24.9 && c1.imc(c1.getPeso(), c1.getAltura()) <= 29.9){
                        System.out.println("Acima da média");
                    }else
                        if (c1.imc(c1.getPeso(), c1.getAltura()) > 29.9 && c1.imc(c1.getPeso(), c1.getAltura()) <= 34.9){
                            System.out.println("Obesidade Grau I");
                        }else
                            if (c1.imc(c1.getPeso(), c1.getAltura()) > 34.9 && c1.imc(c1.getPeso(), c1.getAltura()) <= 40){
                                System.out.println("Obesidade Grau II");
                            }else
                                if (c1.imc(c1.getPeso(), c1.getAltura()) > 40){
                                    System.out.println("Obesidade Grau III");
                                }
        
    }
    
}
