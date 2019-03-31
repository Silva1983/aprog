/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl12exposicao;

/**
 *
 * @author ssilv
 */
import java.util.List;
import java.util.Objects;

public class Exposicao {
    
    public String designacao;
    public int anoCriacao;
    List<Quadro> quadros;
    
    public static final String DESIGNACAO_POR_OMISSAO ="";
    public static final int ANOCRIACAO_POR_OMISSAO = 0;
    
    public Exposicao(){
        this.anoCriacao = ANOCRIACAO_POR_OMISSAO;
        this.designacao = DESIGNACAO_POR_OMISSAO;
    }
    
    public Exposicao(String designacao, int anoCriacao, List<Quadro> quadros){
        this.designacao = designacao;
        this.anoCriacao = anoCriacao;
        this.quadros = quadros;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
    
    public List<Quadro> getQuadros(){
        return quadros;
    }
    
    public void setQuadros(List<Quadro>quadros){
        this.quadros = quadros;
    }
    
    
}
