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
public class MainTempo {

    public static void main(String[] args) {
        //1.
        //a
        Tempo relogio1 = new Tempo(17, 27, 31);
        System.out.println(relogio1.toStringHMS());

        System.out.println(relogio1.toString());
        //b
        relogio1.tick();
        System.out.println(relogio1.toString());

        //c
        Tempo relogio2 = new Tempo(6, 7, 8);
        System.out.println(relogio1.isMaior(relogio2));
        System.out.println(relogio1.isMaiorHMS(18, 20, 7));

        //d
        System.out.println("Diferença: " + relogio1.calcularDif(relogio2) + " segundos");
        Tempo diferenca = new Tempo();
        //System.out.println(diferenca.converterSeg(relogio1.calcularDif(relogio2)));
        diferenca.converterSeg(relogio1.calcularDif(relogio2));
        System.out.println(diferenca.toStringHMS());

        //2.
        //a + b
        Tempo t1 = new Tempo(5, 30, 59);
        System.out.println("2.\nb) " + t1.toString());
        //c + d
        t1.tick();
        System.out.println("d) " + t1.toString());
        //e + f
        Tempo t2 = new Tempo(18, 5, 20);
        System.out.println("f) " + t2.toString());
        //g + h
        System.out.println("g) " + t1.isMaior(t2));
        System.out.println("h) " + t1.isMaiorHMS(18, 7, 4));
        //i
        System.out.println("i) Diferença (em segundos): " + t1.calcularDif(t2));
        Tempo resultado = new Tempo();
        resultado.converterSeg(t1.calcularDif(t2));
        System.out.println("i) Diferença (em Tempo): " + resultado.toStringHMS());
    }
}
