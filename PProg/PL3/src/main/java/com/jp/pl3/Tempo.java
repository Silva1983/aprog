/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl3;

/**
 *
 * @author ASUS
 */
public class Tempo {

    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_POR_OMISSAO = 0;
    private static final int MINUTO_POR_OMISSAO = 0;
    private static final int SEGUNDO_POR_OMISSAO = 0;

    public Tempo() {
        hora = HORA_POR_OMISSAO;
        minuto = MINUTO_POR_OMISSAO;
        segundo = SEGUNDO_POR_OMISSAO;
    }

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tempo(int minuto, int segundo) {
        hora = HORA_POR_OMISSAO;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tempo(int segundo) {
        hora = HORA_POR_OMISSAO;
        minuto = MINUTO_POR_OMISSAO;
        this.segundo = segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s",
                ((hora == 12 || hora == 0) ? hora : hora % 12),
                minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }

    public String toStringHMS() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void tick() {
        segundo = ++segundo % 60;

        if (segundo == 0) {
            minuto = ++minuto % 60;
        }

        if (minuto == 0) {
            hora = ++hora % 24;
        }
    }

    private int calcularSegundos() {
        int segundos = hora * 3600 + minuto * 60 + segundo;

        return segundos;
    }
    
    private int calcularSegHMS(int hora, int minuto, int segundo) {
        int segundos = hora * 3600 + minuto * 60 + segundo;

        return segundos;
    }

    public boolean isMaior(Tempo outroTempo) {
        return calcularSegundos() > outroTempo.calcularSegundos();
    }
    
    public boolean isMaiorHMS(int hora, int minuto, int segundo) {
        return calcularSegundos() > calcularSegHMS(hora, minuto, segundo);
    }
    
    public int calcularDif(Tempo outroTempo) {
        int resultado = Math.abs(calcularSegundos() - outroTempo.calcularSegundos());
        return resultado;
    }

    public void converterSeg(int segundos) {

        hora = segundos / 3600;
        int temp = segundos % 3600;
        minuto = temp / 60;
        segundo = temp % 60;
        
    }
}
