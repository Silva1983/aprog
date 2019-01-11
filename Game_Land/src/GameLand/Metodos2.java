/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameLand;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author João Pimentel
 *
 */
public class Metodos2 {

    static Scanner input = new Scanner(System.in);

    /**
     * 2. Visualizar no ecrã toda a informação sobre os jogos que compõem o
     * evento.
     *
     */
    public static void infoJogos(String[] jogos, int N_JOGOS, String[][] infoJogadores, int nElems) throws FileNotFoundException {
        System.out.println("Jogos do evento");
        System.out.printf("%15s%15s%15s%n",
                "ID do jogo", "Tipo de jogo", "Max. de pontos");
        for (int i = 0; i < jogos.length; i++) {
            String[] temp = jogos[i].split("-");
            System.out.printf("%15s%15s%15s%n", temp[0], temp[1], temp[2]);
        }
        pausa();
    }

    /**
     * 4. Visualizar no ecrã, usando paginação, toda a informação sobre os
     * jogadores já inscritos.
     *
     */
    public static void jogadoresInscritos(String[][] infoJogadores, int nElems) {
        int nPagina = 0;
        for (int i = 0; i < nElems; i++) {
            if (i % GameLand.MAX_LINHAS_PAGINA == 0) {
                if (nPagina > 0) {
                    pausa();
                }
                nPagina++;
                System.out.println("\nPÁGINA: " + nPagina);
                System.out.printf("%40s%n", "PARTICIPANTES");
                System.out.printf("%40s%n", "=============");
            }
            listaJogadores(infoJogadores, i);
            System.out.println("");
        }
        pausa();
    }

    public static void listaJogadores(String[][] infoJogadores, int i) {
        
        for (int k = 0; k < GameLand.N_CAMPOS_INFO; k++) {
            if (k > 0) {
                System.out.printf("%15s", infoJogadores[i][k]);
            } else {
                System.out.printf("%-20s", infoJogadores[i][k]);
            }
        }
    }

    public static void pausa() {
        System.out.println("\n\nPara continuar prima Enter\n");
        input.nextLine();
    }

    /**
     * 6. Ler de um ficheiro de texto toda a informação referente aos resultados
     * de um jogo (AAAAMMDD_IDJOGO.txt). 
     * @return 1 se o ficheiro não tiver erros / -1 se o ficheiro tiver erros
     *
     */
    public static int resultadoJogo(String[][] infoJogadores, int nElems, int[][] pontos, String[] jogos) throws FileNotFoundException {

        System.out.println("Indique o código do jogo");
        String codigo = input.nextLine();
        Scanner fInput = new Scanner(new File("Resultados//20181202_" + codigo + ".txt"));
        
        while (maxPontosJogo(jogos, codigo) == -1) {
            System.out.println("Código incorreto. Insira novamente");
            codigo = input.nextLine();
            fInput = new Scanner(new File("Resultados//20181202_" + codigo + ".txt"));
        }
        
        int maxPontos = maxPontosJogo(jogos, codigo);
        int numColuna = colunaJogo(codigo);

        String linha;
        int cont = 0;
        while (fInput.hasNextLine() && cont < GameLand.MAX_PARTICIPANTES) {
            linha = fInput.nextLine();
            if (linha.trim().length() > 0) {
                String[] temp = linha.split(";");
                String email = temp[0].trim();
                int pontuacao = Integer.parseInt(temp[1].trim());

                if (procurarEmail(infoJogadores, nElems, email) == -1 || pontuacao < 0 || pontuacao > maxPontos) {
                    fInput.close();
                    return -1;
                } else {
                    guardarPontos(infoJogadores, nElems, pontos, numColuna, temp);                    
                }
                cont++;
            }
        }
        fInput.close();
        return 1;
    }

    /**
     * 6a. procura a pontuação máxima correspondente ao código inserido
     * @return pontuação máxima do jogo do código inserido (-1 se o código estiver errado)
     * 
     */
    
    public static int maxPontosJogo(String[] jogos, String codigo) {
        for (int k = 0; k < jogos.length; k++) {
            String[] temp = jogos[k].split("-");
            if (temp[0].equals(codigo)) {
                int pontuacaoMax = Integer.parseInt(temp[2]);
                return pontuacaoMax;
            }
        }
        return -1;
    }

    /**
     * 6b. guardar os pontos de um jogo na linha do jogador e coluna do jogo na matriz pontos
     * 
     */
    
    public static void guardarPontos(String[][] infoJogadores, int nElems, int[][] pontos, int numColuna, String[] temp) {
        String email = temp[0].trim();
        int pontuacao = Integer.parseInt(temp[1].trim());
        int pos = procurarEmail(infoJogadores, nElems, email);
        if (pos != -1) {
            pontos[pos][numColuna] = pontuacao;
        }
    }
    
    /**
     * 6c. procurar por email na matriz infoJogadores
     * @return nº da linha do jogador na matriz
     */
    
    public static int procurarEmail(String[][] infoJogadores, int nElems, String email) {

        for (int k = 0; k < nElems; k++) {
            if (infoJogadores[k][0].equalsIgnoreCase(email)) {
                return k;
            }
        }
        return -1;
    }
    
    /**
     * 6d. identificar a coluna do jogo na matriz
     * @return nº da coluna referente ao código do jogo inserido
     */
    
    public static int colunaJogo(String codigo) {
        int colunaJogo = -1;
        switch(codigo) {
            case "110":
                colunaJogo = 0;
                break;
            case "120":
                colunaJogo = 1;
                break;
            case "210":
                colunaJogo = 2;
                break;
            case "220":
                colunaJogo = 3;
                break;
            case "310":
                colunaJogo = 4;
                break;
            case "320":
                colunaJogo = 5;
                break;
        }
        return colunaJogo;
    }
    
    public static void calcularPremios() {
        
        
    }

//    public static pontosEquipa() {
//        int z = 0;
//        for (int i = 0; i < equipas.length - 3; i = i + 3) {
//            somaPontos = pontos[i][j];
//            for (int k = 1; k < 3; k++) {
//                somaPontos += pontos[i + k][j];
//            }
//            pontosEquipa[z++][j]=somalinhas;
//        }
//    }
//    public static void ordenarCrescPorCampo(String[][] participantes) {
//        for (int i = 0; i < nElem; i++) {
//            for (int k = i + k; k < nElem; k++) {
//                if (participantes[i][col].compareTo(participantes[k][??])
//                        || participantes[i][col]compareTo(participantes[k][])) {
//                    
//                }
//                
//            }
//        }
//    }
}
