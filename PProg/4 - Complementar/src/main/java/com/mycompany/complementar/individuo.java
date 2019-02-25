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
public class individuo {
    
     /**
     * Nome
     */
    private String nome;
    
    /**
     * idade
     */
    private int idade;
    
    /**
     * peso
     */
    private double peso;
    
    /**
     * altura
     */
    private double altura;
    
    private static final String NOME_POR_OMISSAO = "Sem nome";
    
    private final int IDADE_POR_OMISSAO = 0;
    
    private final int PESO_POR_OMISSAO = 0;
    
    private final int ALTURA_POR_OMISSAO = 0;
    
    /**
     * Constroi uma instancia do Individuo, recebendo o nome, idade, peso e altura
     * @param nome do individuo
     * @param idade do individuo
     * @param peso do individuo 
     * @param altura do individuo
     */
    public individuo(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    /**
     * Constroi uma instância por omissão
     */
    public individuo(){
        nome = NOME_POR_OMISSAO;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        idade = IDADE_POR_OMISSAO;
    }
    /**
     * Devolve o nome do individuo
     * @return nome
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Modifica o nome do individuo
     * @param nome novo nome
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
     * Devolve idade do individuo
     * @return idade
     */
    public int getIdade(){
        return idade;
    }
    /**
     * Modifica idade do individuo
     * @param idade nova idade
     */
    public void setIdade(int idade){
        this.idade = idade;
    }
    /**
     * Devolve peso
     * @return peso
     */
    public double getPeso(){
        return peso;
    }
    /**
     * Devolve altura
     * @return altura
     */
    public double getAltura(){
        return altura;
    }
    /**
     * Altera peso
     * @param peso 
     */
    public void setPeso(double peso){
        this.peso = peso;
    }
    /**
     * Altera altura
     * @param altura 
     */
    public void setAltura(double altura){
        this.altura = altura;
    }
    /**
     * 
     * @param peso do individuo
     * @param altura do individuo
     * @return  IMC
     */
    public double imc(double peso, double altura){
        
        return ( peso / (altura * altura));
    }
    
    public String toString(){
        
        return  String.format("\nNome: " + nome + "\nIdade: " + idade + " \nAltura: " + altura + "\nPeso: " + peso+ " \nIMC: " + imc(peso, altura));
    }
    
}
