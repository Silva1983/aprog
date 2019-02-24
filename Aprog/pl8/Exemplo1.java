/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Exemplo1 {
    
    static Formatter formatter = new Formatter(System.out);
    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) throws FileNotFoundException, IOException {
        showMenu();

    }
    private final static int MAX_PARTICIPANTES = 30;
    private final static int N_CAMPOS_INFO = 4;
    private final static int N_JOGOS = 6;
    private final static int MAX_LINHAS_PAGINA = 3;
    static String[] jogos = new String[N_JOGOS];
    private static String fileName;

    public static void showMenu() throws FileNotFoundException, IOException {
        final String menuContent = "Escolha uma opção.\n\n" + "1 - Inserir o ficheiro com a informação dos jogos.\n"
                + "2 - Informação dos jogos que compõem o evento.\n"
                + "3 - Inserir um ficheiro com os dados de uma equipa.\n"
                + "4 - Informação dos participantes do evento.\n"
                + "5 - Alterar um dado de um participante.\n"
                + "6 - .\n"
                + "0 - Encerrar programa.\n\n"
                + "Option: ";

        String op;
        String fileTeam;
        String[][] info = new String[MAX_PARTICIPANTES][4];
        int nElems = 0;
        String fileN;
        String IdJogo;
        String MaxPont;
        do {
            formatter.format("%s", menuContent);

            op = scanner.nextLine();

            switch (op) {
                case "1":
                    System.out.println("Introduza a data do evento(AAAAMMDD) - ");
                    fileName = scanner.nextLine();
                    if (carregarJogosDoEvento(fileName, jogos)) {
                        System.out.println("Operação efetuada com sucesso");
                    } else {
                        System.out.println("Ficheiro inválido");
                    }

                    break;
                case "2":
                    if (carregarJogosDoEvento(fileName, jogos) == true) {
                        visualizarInfoJogos(jogos);
                    } else {
                        System.out.println("Ainda não foi introduzido um ficheiro válido");
                    }

                    break;
                case "3":
                    System.out.println("Introduza o nome do ficheiro) - ");
                    fileTeam = scanner.nextLine();
                    nElems = lerInfoFicheiro(fileTeam, info, nElems);
                    break;
                case "4":
                    listagemPaginada(info, nElems);
                    break;
                case "5":
                    System.out.println("Introduza o email do participante");
                    String email = scanner.nextLine();
                    atualizarInfoParticipante(email, info, nElems);
                    break;
                case "6":
                    System.out.println("Introduza a data do evento e o id do jogo separados por um _ (AAAAMMDD_IDJOGO) - ");
                    fileN = scanner.nextLine();
                    System.out.println("Introduza o id do jogo");
                    IdJogo = scanner.nextLine();
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "10":

                    break;
                case "11":

                    break;
                case "12":

                    break;
                case "0":
                    break;

                default:
                    formatter.format("Invalid option!");
            }
        } while (!"0".equals(op));
    }

    private static boolean carregarJogosDoEvento(String fileName, String[] jogos) throws FileNotFoundException {
        int i;

        Scanner fInput = new Scanner(new File(fileName));

        i = 0;
        while (fInput.hasNextLine() && i < N_JOGOS) {
            String linha = fInput.nextLine();
            //Ver se a linha tem texto
            if ((linha.trim()).length() > 0) {
                jogos[i] = linha;
                i++;
            }
        }

        if (i == N_JOGOS) {
            return true;
        } else {
            return false;
        }
    }

    private static void visualizarInfoJogos(String[] jogos) {
        System.out.println("Jogos do evento");
        System.out.printf("%15s%15s%15s%n", "ID do jogo", "Tipo de jogo", "Max. de pontos");
        for (int i = 0; i < jogos.length; i++) {
            String[] temp = jogos[i].split("-");
            System.out.printf("%15s%15s%15s%n", temp[0], temp[1], temp[2]);
        }

    }

    public static int lerInfoFicheiro(String fileTeam, String[][] info, int nElems) throws FileNotFoundException {
        Scanner fInput = new Scanner(new File(fileTeam));
        int nElemsInic = nElems;
        while (fInput.hasNext() && nElems < MAX_PARTICIPANTES) {
            String linha = fInput.nextLine();

            if (linha.trim().length() > 0) {
                nElems = guardarDados(linha, info, nElems);
            }
        }
        fInput.close();
        if (nElems - nElemsInic != 3) {
            nElems = nElemsInic;
            System.out.println("Ficheiro inválido");
        } else {
            System.out.println("Operação efetuada com sucesso");
        }
        return nElems;
    }

    public static int guardarDados(String linha, String[][] info, int nElems) {
        String[] temp = linha.split(";");
        if (temp.length == N_CAMPOS_INFO) {
            for (int i = 0; i < N_CAMPOS_INFO; i++) {
                info[nElems][i] = temp[i].trim();
            }
        }
        nElems++;
        return nElems;
    }

    private static void cabecalho() {
        System.out.printf("%42s%n", "PARTICIPANTES");
        System.out.printf("%60s%n", "==================================================");
    }

    private static void pausa() {
        System.out.println("\n\nPara continuar digite ENTER\n");
        scanner.nextLine();
    }

    private static void listagemPaginada(String[][] info, int nElems) {
        int contPaginas = 0;
        for (int i = 0; i < nElems; i++) {
            if (i % MAX_LINHAS_PAGINA == 0) {
                if (contPaginas > 0) {
                    pausa();
                }
                contPaginas++;
                System.out.println("\nPÁGINA: " + contPaginas);
                cabecalho();
            }
            for (int j = 0; j < N_CAMPOS_INFO; j++) {
                if (j == 1) {
                    System.out.printf("%-15s", info[i][j] + " ");
                } else {
                    System.out.printf("%-15s", info[i][j] + " ");
                }
            }
            System.out.println("");
        }
        pausa();
    }

    public static int pesquisarElemento(String email, int nElems, String[][] info) {
        for (int i = 0; i < nElems; i++) {
            if (info[i][0].equals(email)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean atualizarInfoParticipante(String email, String[][] info, int nElems) {
        int pos;
        if ((pos = pesquisarElemento(email, nElems, info)) > -1) {
            int op;
            do {
                String[] participante = new String[4];
                mostrarParticipante(participante);
                op = menuInfoParticipante();
                switch (op) {
                    case 1:
                        System.out.println("Novo EMail: ");
                        info[pos][0] = scanner.nextLine();
                        break;
                    case 2:
                        System.out.println("Novo nome: ");
                        info[pos][1] = scanner.nextLine();
                        break;
                    case 3:
                        System.out.println("Nova data nascimento: ");
                        info[pos][2] = scanner.nextLine();
                        break;
                    case 0:
                        System.out.println("Fim");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } while (op != 0);
            return true;
        }
        System.out.printf("O participante %s não foi encontrado!  ", email);
        return false;
    }
    private static void mostrarParticipante(String[] participante) {
        for (int j = 0; j < N_CAMPOS_INFO; j++) {
            if (j == 1) {
            System.out.printf("%30s;", participante[j]);
        } else {
            System.out.printf("%12s;", participante[j]);
        }
        }
    }
        private static int menuInfoParticipante() {
            String texto = "Atualizar informação de um participante" + "\n  EMail ... 1 " + "\n  NOME ... 2 " + "\n  DATA NASCIMENTO ... 3 " + "\n  TERMINAR ... 0 ";
            System.out.printf("%n%s%n", texto);
            int op = scanner.nextInt();
            scanner.nextLine();
            return op; 
        }
}