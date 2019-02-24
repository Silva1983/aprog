/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameLand;

/**
 *
 * @author AJ
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class GameLand {

    public static Scanner ler = new Scanner(System.in);
    public final static int MAX_PARTICIPANTES = 30;
    public final static int N_CAMPOS_INFO = 4;
    public final static int N_JOGOS = 6;
    public final static int MAX_LINHAS_PAGINA = 3;

    public static void main(String[] args) throws FileNotFoundException {
        /**
         * @param jogos - array com a informação dos jogos
         * @param infoJogadores - matriz com a informação dos jogadores
         * @param pontos - matriz com os pontos por jogo de cada jogador
         * @param premios - matriz com os premios por jogo de cada jogador
         * @param nElems - nº de jogadores inseridos na matriz
         */

        System.out.println("*************************************************************************"
                + "\n************************** GameLand ************************************"
                + "\n*************************************************************************");

        String jogos[] = new String[N_JOGOS];
        String[][] infoJogadores = new String[MAX_PARTICIPANTES][N_CAMPOS_INFO];
        int[][] pontos = new int[MAX_PARTICIPANTES][N_JOGOS];
        double[][] premios = new double[MAX_PARTICIPANTES][N_JOGOS];
        int nElems = 0;

        /**
         * preenche a matriz pontos com zeros
         */
        for (int i = 0; i < pontos.length; i++) {
            for (int k = 0; k < pontos[0].length; k++) {
                pontos[i][k] = 0;
            }
        }

        Menus.menu(jogos, infoJogadores, nElems, pontos);
    }
}
