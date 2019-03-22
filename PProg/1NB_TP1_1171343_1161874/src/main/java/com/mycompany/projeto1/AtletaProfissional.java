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
public class AtletaProfissional{
    private int nPremios;
    
    private static final int NPREMIOS_POR_OMISSAO=0;
    
    public AtletaProfissional (){
        this.nPremios = NPREMIOS_POR_OMISSAO;
    }
    
    public AtletaProfissional(int nPremios){
        this.nPremios = nPremios;
    }

    public int getnPremios() {
        return nPremios;
    }

    public void setnPremios(int nPremios) {
        this.nPremios = nPremios;
    }
    
    
}
