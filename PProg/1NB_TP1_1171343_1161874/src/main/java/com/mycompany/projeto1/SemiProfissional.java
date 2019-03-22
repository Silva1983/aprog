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
public class SemiProfissional extends Atleta {
    
    private int antiguidade;
    private int nPremios;
    
    private final static int ANTIGUIDADE_POR_OMISSAO = 0;
    private final static int NPREMIOS_POR_OMISSAO=0;
    
    public SemiProfissional (){
        super();
        this.antiguidade = ANTIGUIDADE_POR_OMISSAO;
        this.nPremios = NPREMIOS_POR_OMISSAO;
    }
    
    public SemiProfissional(String nome, int nIC, String genero, int idade, int fcr){
        super(nome, nIC, genero, idade, fcr);
        this.antiguidade = antiguidade;
        this.nPremios = nPremios;
    }
}
