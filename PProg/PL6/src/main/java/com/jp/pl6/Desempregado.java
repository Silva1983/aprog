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
public class Desempregado extends ContribuinteSemRendimentos {
    
    public static float taxaOR = .02f;

    public Desempregado() {
        super();
    }

    public Desempregado(String nome, String morada, float outrosRendimentos, int mesesParagem) {
        super(nome, morada, outrosRendimentos, mesesParagem);
    }

    public float getTaxaRT() {
        return taxaOR;
    }
    
    public static void setTaxa(float novaTaxa) {
        taxaOR = novaTaxa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public float calcularImposto() {
        return outrosRendimentos * taxaOR;
    }
}
