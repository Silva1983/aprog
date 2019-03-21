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
public abstract class Atleta {
    private String nome;
    private int nIC;
    private String genero;
    private int idade;
    
    private static final String NOME_POR_OMISSAO="";
    private static final int NIC_POR_OMISSAO = 0;
    private static final String GENERO_POR_OMISSAO="";
    private static final int IDADE_POR_OMISSAO = 0;
    
    public Atleta(){
        this.nome = NOME_POR_OMISSAO;
        this.nIC = NIC_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
    }
    
    public Atleta(String nome, int nIC, String genero, int idade){
        this.nome = nome;
        this.nIC = nIC;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnIC() {
        return nIC;
    }

    public void setnIC(int nIC) {
        this.nIC = nIC;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString(){
        return String.format("Nome: %s%nNúmero de Identificação Fiscal: %s%nGénero: %s%nIdade: $s",nome,nIC,genero,idade);
    }
    
    public abstract double calculoFCM();
}
