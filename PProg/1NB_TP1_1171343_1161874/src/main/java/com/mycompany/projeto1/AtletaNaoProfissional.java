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
public class AtletaNaoProfissional {
    private int antiguidade;
    private int nPremios;
    
    private final static int ANTIGUIDADE_POR_OMISSAO = 0;
    private final static int NPREMIOS_POR_OMISSAO=0;
    
    public AtletaNaoProfissional(){
        this.antiguidade = ANTIGUIDADE_POR_OMISSAO;
        this.nPremios = NPREMIOS_POR_OMISSAO;
    }
    
    public AtletaNaoProfissional(int antiguidade, int nPremios){
        this.nPremios = nPremios;
        this.antiguidade = antiguidade;
    }

    public int getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    public int getnPremios() {
        return nPremios;
    }

    public void setnPremios(int nPremios) {
        this.nPremios = nPremios;
    }
    
}
