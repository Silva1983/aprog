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
public class Quadro {
    public String designacao;
    public String nomeAutor;
    public int anoCriacao;
    
    public   static final String DESIGNACAO_POR_OMISSAO = "";
    public static final String NOMEAUTOR_POR_OMISSAO = "";
    public static final int ANOCRIACAO_POR_OMISSAO = 0;
    
    public Quadro(){
        this.nomeAutor = NOMEAUTOR_POR_OMISSAO;
        this.designacao = DESIGNACAO_POR_OMISSAO;
        this.anoCriacao = ANOCRIACAO_POR_OMISSAO;
    }
    
    public Quadro(String designacao, String nomeAutor, int anoCriacao){
        this.designacao = designacao;
        this.nomeAutor = nomeAutor;
        this.anoCriacao = anoCriacao;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
    
    @Override
    public String toString(){
        return String.format("Designação: %s%n Nome autor: %s%n Ano criaçao: %d%n", designacao, nomeAutor,anoCriacao);
    }
}
