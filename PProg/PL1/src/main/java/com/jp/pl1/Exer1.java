/*
 * 1. Escreva um programa que pergunte o nome da pessoa e dê uma saudação usando esse nome.
 */
package com.jp.pl1;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Exer1 {
    
    public static Scanner input = new Scanner(System.in);
    
    public static String welcome() {
        System.out.println("Olá! Insira um nome...");
        String nome = input.nextLine();
        return nome;
        }
    
    public static void main(String[] args) {
        
        String nome = welcome();        
        System.out.println("Bem-vindo " + nome);        
        
    }    
}
