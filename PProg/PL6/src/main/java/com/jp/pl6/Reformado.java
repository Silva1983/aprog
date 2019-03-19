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
public class Reformado extends Contribuinte {
    
    private float taxaRT = .01f;
    private float taxaOR = .03f;
    
    public Reformado() {
        super();
    }

    public Reformado(String nome, String morada, float rendimentosTrabalho, float outrosRendimentos) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
    }
    
    public float getTaxaRT() {
        return taxaRT;
    }
    
    public float getTaxaOR() {
        return taxaOR;
    }
    
    public void setTaxaRT(float taxaRT) {
        this.taxaRT = taxaRT;
    }
    
    public void setTaxaOR(float taxaOR) {
        this.taxaOR = taxaOR;
    }

    
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public float calcularImposto() {
        return (rendimentosTrabalho * taxaRT + outrosRendimentos * taxaOR);
    }
}
