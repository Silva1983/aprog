/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto1;

/**
 *
 * @author ssilv
 */
public class Ciclismo extends Atleta{
    
    public Ciclismo(){
        super();
    }
    
    public Ciclismo(String nome, int nIC, String genero, int idade){
        super(nome, nIC, genero, idade);
    }
    
    @Override
    public double calculoFCM(){
        return (getGenero().toLowerCase().charAt(0)=='m') ? 202 -(0.72*getIdade()): 189 - (0.56 * getIdade());
    }
    
}
