/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameLand;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author AJ
 *
 */
public class TesteMetodos {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        String jogos[] = {"110-estrategia-150", "210-aventura-150", "310-acao-100"};
        String[][] infoJogadores = {{"wizy@abc.pt", "Joana Santos", "2/12/2000", "Wizards"},{"broliv@abc.pt", "Bruno Oliveira", "15/5/1997", "Wizards"},{"ribeiro@xyz.pt", "Luis Ribeiro", "1/10/1995", "Wizards"}};
        int[][] pontos = {{100, 90, 70}, {50, 100, 50}, {70, 40, 30}};
//        int[][] pontos = new int[30][6];
        double[][] premios = new double[GameLand.MAX_PARTICIPANTES][GameLand.N_JOGOS];
        int nElems = 3;
        
//        for (int i = 0; i < pontos.length; i++) {
//            for (int j = 0; j < pontos[0].length; j++) {
//                pontos[i][j] = 0;
//            }            
//        }

        Metodos2.jogadoresInscritos(infoJogadores, nElems);
//        Metodos2.resultadoJogo(infoJogadores, pontos);
//        System.out.println(Metodos2.maxPontosJogo(jogos, "310"));
//        Metodos2.resultadoJogo(infoJogadores, nElems, pontos, jogos);
//        for (int i = 0; i < pontos.length; i++) {
//            for (int k = 0; k < pontos[0].length; k++) {
//                if (pontos[i][k] != 0) {
//                    System.out.println(pontos[i][k]);
//                }
//            }
//        }
    }
}
