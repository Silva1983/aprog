/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.empregado;

/**
 *
 * @author ssilv
 */

import com.mycompany.utilitarios.Data;
import com.mycompany.utilitarios.Tempo;

public class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;
    
    private static final String PRIMEIRONOME_POR_OMISSAO = "";
    private static final String ULTIMONOME_POR_OMISSAO = "";
    private static final int DIAS_TRABALHO_POR_SEMANA = 5;
    
    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
        this.horaEntrada = new Tempo (horaEntrada);
        this.horaSaida = new Tempo (horaSaida);
    }
    
    public Empregado(){
        this.primeiroNome  = PRIMEIRONOME_POR_OMISSAO;
        this.ultimoNome = ULTIMONOME_POR_OMISSAO;
        this.dataContrato = new Data(1,1,1);
        this.horaEntrada = new Tempo (1,1,1);
        this.horaSaida = new Tempo (1,1,1);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Data getDataContrato() {
        return new Data(dataContrato);
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato.setData(dataContrato.getAno(), dataContrato.getMes(), dataContrato.getDia());
    }

    public Tempo getHoraEntrada() {
        return new Tempo (horaEntrada);
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada.setTempo(horaEntrada.getHoras(), horaEntrada.getMinutos(), horaEntrada.getSegundos());
    }

    public Tempo getHoraSaida() {
        return new Tempo (horaSaida);
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida.setTempo(horaSaida.getHoras(), horaSaida.getMinutos(), horaSaida.getSegundos());
    }
    
    public int calcularHorasTrabalhoSemana(){
        return (this.horaEntrada.diferencaEmSegundos(this.horaSaida) * DIAS_TRABALHO_POR_SEMANA) / 3600;
    }
    
    public int calcularTempoContrato(){
        Data dataAntiga = new Data(this.dataContrato);
        Data dataNova = Data.dataAtual();
        return dataAntiga.diferenca(dataNova);
    }
    
    public String toStringEmpregado(){
        return String.format("Nome: %s%n Último nome: %s%nData último contrato: %s%n Hora Entrada: %s%n Hora Saída: %s",primeiroNome, ultimoNome, dataContrato,horaEntrada, horaSaida);
    }
}
