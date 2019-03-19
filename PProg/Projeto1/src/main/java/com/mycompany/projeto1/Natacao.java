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
public class Natacao extends Atleta {
    
    public Natacao(){
        super();
    }
    
    public Natacao(String nome, int nIC, String genero, int idade){
        super(nome, nIC, genero, idade);
    }
    
    @Override
    public double calculoFCM(){
        return 204 - (1.7*getIdade());
    }
}
