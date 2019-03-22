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
public class Profissional extends Atleta{
    private int nPremios;
    
    private static final int NPREMIOS_POR_OMISSAO=0;
    
    public Profissional (){
        super();
        this.nPremios = NPREMIOS_POR_OMISSAO;
    }
    
    public Profissional(String nome, int nIC, String genero, int idade, int fcr){
        super(nome, nIC, genero, idade, fcr);
        this.nPremios = nPremios;
    }
}
