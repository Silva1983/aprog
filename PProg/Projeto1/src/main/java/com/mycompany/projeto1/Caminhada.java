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
public class Caminhada extends Atleta{
    public Caminhada(){
        super();
    }
    
    public Caminhada(String nome, int nIC, String genero, int idade){
        super(nome, nIC, genero, idade);
    }
    
    @Override
    public double calculoFCM(){
        return 208.75 - (0.73 * getIdade());
    }
}
