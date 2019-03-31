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
import java.util.ArrayList;
import java.util.List;

public class MainEmpregado {
    public static void main(String[] args) {
        //a
        Data d1 =  Data.dataAtual();
        System.out.println(d1.toAnoMesDiaString());
        //b
        Tempo t1 = new Tempo(2, 30, 9);
        Tempo t2 = Tempo.tempoAtual();
        System.out.println(t1.toStringHHMMSS());
        System.out.println(t2.toStringHHMMSS());
        //c
        Empregado e1 = new Empregado("Antonio", "Silva", d1, t1, t2);
        Empregado e2 = new Empregado("Joao", "Pinto", d1, t1, t2);
        //d
        System.out.println("Data igual " + e1.getDataContrato().equals(e2.getDataContrato()));
        //e
        System.out.println("Hora entrada igual" + e1.getHoraEntrada().equals(e2.getHoraEntrada()));
        System.out.println("Hora saída igual " + e1.getHoraSaida().equals(e2.getHoraSaida()));
        //f
        d1.setData(1983, 03, 23);
        t1.setTempo(22, 05, 35);
        t2.setTempo(4, 34, 25);
        //g
        System.out.println(d1.toAnoMesDiaString());
        System.out.println(t1.toStringHHMMSS());
        System.out.println(t2.toStringHHMMSS());
        //h
        e2.setDataContrato(new Data (1992, 23, 1));
        e2.setHoraEntrada(new Tempo (10, 4, 3));
        e2.setHoraSaida(new Tempo (15, 5, 4));
        //i
        List<Empregado> empregado = new ArrayList<>();
        empregado.add(e1);
        empregado.add(e2);

        //j
        System.out.println("### Listagem Empregados ###");
        listaUm(empregado);
        
    }
    private static void listaUm(List<Empregado> lista){ 
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Empregado || lista.get(i) instanceof Empregado) {
                System.out.println(lista.get(i).toStringEmpregado());
            }
        }
    }
}
