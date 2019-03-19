/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl5;

/**
 *
 * @author ASUS
 */
public class MainVencimentos {
    
    public static void main(String[] args) {
        
        //3.
        TrabalhadorPeca tp1 = new TrabalhadorPeca("Jorge Silva", 53, 62);
        TrabalhadorComissao tc1 = new TrabalhadorComissao("Susana Ferreira", 650, 2731.5f, 4.25f);
        TrabalhadorHora th1 = new TrabalhadorHora("Carlos Miguel", 168, 4.5f);        
        //4 e 7 - ao alterar do tipo Object para o tipo Trabalhador já dá para simplificar as listagens do 6.
        Trabalhador[] trabalhadores = new Trabalhador[10];        
        //5.
        trabalhadores[0] = tp1;
        trabalhadores[1] = tc1;
        trabalhadores[2] = th1;        
        //6.
        System.out.println("6. v1");
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] != null) {
                System.out.println(trabalhadores[i].toString());
            }            
        }
        
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] instanceof TrabalhadorHora) {
                System.out.println(trabalhadores[i].toString());
            }            
        }
        
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] instanceof TrabalhadorPeca) {
                Trabalhador t1 = (Trabalhador) trabalhadores[i];
                System.out.println(String.format("Nome: %s%nVencimento: %.2f", 
                        t1.getNome(), t1.calcularVencimento()));
            }
            
            if (trabalhadores[i] instanceof TrabalhadorComissao) {
            //não é preciso criar um outro objecto t1
                System.out.println(String.format("Nome: %s%nVencimento: %.2f", 
                        ((Trabalhador) trabalhadores[i]).getNome(), ((Trabalhador) trabalhadores[i]).calcularVencimento()));
            }
            
            if (trabalhadores[i] instanceof TrabalhadorHora) {
                System.out.println(String.format("Nome: %s%nVencimento: %.2f", 
                        ((Trabalhador) trabalhadores[i]).getNome(), ((Trabalhador) trabalhadores[i]).calcularVencimento()));
            }
        }
        //6. v2
        System.out.println("6. v2");
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] != null) {
                System.out.println(trabalhadores[i].toString());
            }            
        }
        
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] instanceof TrabalhadorHora) {
                System.out.println(trabalhadores[i].toString());
            }            
        }
        
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] != null){
                System.out.printf("Nome: %s%nVencimento: %.2f%n", trabalhadores[i].getNome(), trabalhadores[i].calcularVencimento());   
            }             
        }
    }    
}
