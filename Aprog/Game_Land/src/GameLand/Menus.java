/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameLand;

/**
 *
 * @author AJ
 */
import static GameLand.GameLand.N_CAMPOS_INFO;
import static GameLand.Metodos1.ler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menus {

    public static Scanner ler = new Scanner(System.in);

    public static void menu(String[] jogos, String[][] infoJogadores, int nElems, int[][] pontos) throws FileNotFoundException {
        int op;

        do {

            System.out.println("\n\t1 - Abrir ficheiro"
                    + "\n\t0 - Sair");
            op = ler.nextInt();

            
            switch (op) {
                case 1:
                    ler.nextLine();
                    System.out.println("Qual a data do evento? (AAAAMMDD)"
                            + "\n\t20181202");
                    String nomeFich = ler.nextLine();

                    if (Metodos1.carregarJogosDoEvento("Eventos//" + nomeFich + ".txt", jogos, GameLand.N_JOGOS, infoJogadores)) {
                        System.out.println("Jogos carregados com sucesso");
                        subMenu(jogos, infoJogadores, nElems, pontos);
                    } else {
                        System.out.println("Erro no carregamento dos jogos. Verifique o ficheiro");
                        menu(jogos, infoJogadores, nElems, pontos);
                    }

                    break;
                case 0:

                    System.out.println("Já fez todas as gravações necessárias? Confirma terminar (s/n)?");
                    char resp = (ler.next()).charAt(0);
                    if (resp != 's' && resp != 'S') {
                       System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (op < 0 || op > 1);
    }

    public static void subMenu(String[] jogos, String[][] infoJogadores, int nElems, int[][] pontos) throws FileNotFoundException {
        int op;

        do {
            System.out.println("\n\t1 - Visualizar informação sobre os jogos"
                    + "\n\t2 - Ler ficheiro de texto informação dos participantes que se inscreveram no evento"
                    + "\n\t3 - Visualizar no ecrã"
                    + "\n\t4 - Alterar qualquer dado sobre participante"
                    + "\n\t5 - Ler de um ficheiro de texto toda a informação referente aos resultados"
                    + "\n\t6 - Guardar informação existente em memória"
                    + "\n\t7 - Calcular e guardar em memória os prémios dos participantes obtidos em memória"
                    + "\n\t8 - Remover das estrturas de dados toda a informação relativa a uma equipa"
                    + "\n\t9 - Visualizar no ecrã, para uma determinada equipa, os prémios auferidos pelos seus elementos"
                    + "\n\t10 - Visualizar no ecrã"
                    + "\n\t0 - Voltar");

            String temp = ler.nextLine();

            if (temp.length() > 2) {
                System.out.println("O valor que introduziu não é válido, por favor introduza um número válido");
                subMenu(jogos, infoJogadores, nElems, pontos);
                break;
            } else {
                if (!temp.equals("0") && !temp.equals("1") && !temp.equals("2") && !temp.equals("3") && !temp.equals("4") && !temp.equals("5") && !temp.equals("6") && !temp.equals("7") && !temp.equals("8") && !temp.equals("9") && !temp.equals("10")) {
                    System.out.println("O valor que introduziu não é válido, por favor introduza um número válido!!");
                    subMenu(jogos, infoJogadores, nElems, pontos);
                    break;
                } else {
                    op = Integer.parseInt(temp);
                }
            }
            switch (op) {
                case 1:
                    Metodos2.infoJogos(jogos, GameLand.N_JOGOS, infoJogadores, nElems);
                    Menus.subMenu(jogos, infoJogadores, nElems, pontos);
                    break;
                case 2:
                    System.out.println("\n\tAteam"
                            + "\n\tEsports"
                            + "\n\tIsepians"
                            + "\n\tRacers"
                            + "\n\tTeamjava"
                            + "\n\tTheBest"
                            + "\n\tWizards");
                    String nomeFich = ler.nextLine();
                    nElems = Metodos1.lerInfoFicheiro(nomeFich, infoJogadores, nElems);
                    Menus.subMenu(jogos, infoJogadores, nElems, pontos);
                    break;
                case 3:
                    Metodos2.jogadoresInscritos(infoJogadores, nElems);
                    Menus.subMenu(jogos, infoJogadores, nElems, pontos);
                    break;
                case 4:
                    int a;
                    do{
                        System.out.println("Qual a posição que quer alterar?");
                        a = ler.nextInt();
                        a--;
                    }while(a<0 || a> nElems);
                    Metodos1.actualizarInfoParticipante( infoJogadores, nElems, N_CAMPOS_INFO, pontos, jogos, a);
                    Menus.subMenu(jogos, infoJogadores, nElems, pontos);
                    break;
                case 5:
                    int flag = Metodos2.resultadoJogo(infoJogadores, nElems, pontos, jogos);
                    if (flag == -1) {
                        System.out.println("O ficheiro contém erros e não será guardado na memória");
                    } else {
                        System.out.println("O ficheiro foi guardado com sucesso na memória");
                    }
                    Menus.subMenu(jogos, infoJogadores, nElems, pontos);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    subMenu3(jogos, infoJogadores, nElems, pontos);
                    break;
                case 0:
                    menu(jogos, infoJogadores, nElems, pontos);
                   break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (op < 0 || op > 10);
    }

    public static void subMenu3(String[] jogos, String[][] infoJogadores, int nElems, int[][] pontos) throws FileNotFoundException {
        int op;
        String temp;
        do {
            System.out.println("\n\t1 - Pontuação média obtida pelos participantes nesse jogo"
                    + "\n\t2 - Percentagem de jogadores que não participaou ou desistiu"
                    + "\n\t3 - Valor total de prémios atribuídos nesse jogo"
                    + "\n\t0 - Voltar");
            temp = ler.nextLine();

            if (temp.length() != 1) {
                System.out.println("O valor que introduziu não é válido, por favor introduza um número válido!!");
                subMenu3(jogos, infoJogadores, nElems, pontos);
                break;
            } else {
                if (!temp.equals("0") && !temp.equals("1") && !temp.equals("2") && !temp.equals("3") && !temp.equals("4")) {
                    System.out.println("O valor que introduziu não é válido, por favor introduza um número válido!!");
                    subMenu3(jogos, infoJogadores, nElems, pontos);
                    break;
                } else {
                    op = Integer.parseInt(temp);
                }
            }
            switch (op) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    subMenu(jogos, infoJogadores, nElems, pontos);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op < 0 || op > 3);
    }
}
