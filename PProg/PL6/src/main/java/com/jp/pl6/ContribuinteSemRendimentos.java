/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl6;

/**
 *
 * @author ASUS
 */
public abstract class ContribuinteSemRendimentos {

    private String nome;
    private String morada;
    public float outrosRendimentos;
    private int mesesParagem;
    
    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String MORADA_POR_OMISSAO = "sem morada";
    private static final float OR_POR_OMISSAO = 0;
    private static final int PARAGEM_POR_OMISSAO = 0;

    public ContribuinteSemRendimentos() {
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
        outrosRendimentos = OR_POR_OMISSAO;
        mesesParagem = PARAGEM_POR_OMISSAO;
    }

    public ContribuinteSemRendimentos(String nome, String morada, float outrosRendimentos, int mesesParagem) {
        this.nome = nome;
        this.morada = morada;
        this.outrosRendimentos = outrosRendimentos;
        this.mesesParagem = mesesParagem;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public float getOutrosRendimentos() {
        return outrosRendimentos;
    }
    
    public int getMesesParagem() {
        return mesesParagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setOutrosRendimentos(float outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }
    
    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s%nMorada: %s%nMeses paragem: %d", nome, morada, mesesParagem);
    }
    
    public abstract float calcularImposto();
    
}
