/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameLand;

/**
 *
 * @author António Silva
 */
import java.io.File;
import java.util.Formatter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Metodos1 {
    public static Scanner ler = new Scanner (System.in);
    
    public static boolean carregarJogosDoEvento(String nomeFichJogos, String[] jogos, int N_JOGOS, String[][] infoJogadores)throws FileNotFoundException {
       String[] temp = jogos;
        try{
           
            Scanner fInput = new Scanner(new File(nomeFichJogos));
            int i = 0;
            while (fInput.hasNextLine() && i < N_JOGOS) {
                String linha = fInput.nextLine();
                // Verifica se linha não está em branco
                if ((linha.trim()).length() > 0) {
                    
                    jogos[i] = linha;
                    i++;
                }
            }
            fInput.close();
            if(i==N_JOGOS){
                return true;
            }
        }catch (FileNotFoundException e){
            System.out.println("Ficheiro não existente");
            return false;
        }
        return false;
}
    
    public static int lerInfoFicheiro(String nomeFich, String[][] infoJogadores, int nElems) throws FileNotFoundException{
    int nElemsinic = nElems;
    String [] temp2;
    String[] temp= new String[GameLand.N_CAMPOS_INFO];
    try{    
        Scanner finput= new Scanner (new File("Equipas//"+nomeFich+".txt"));
        while (finput.hasNext() && nElems < GameLand.MAX_PARTICIPANTES){
            String linha = finput.nextLine();
            
            //Verifica se linha não está em branco
            if (linha.trim().length() > 0){            
                nElems = guardarDados(linha, infoJogadores, nElems, GameLand.N_CAMPOS_INFO);
            }
        }
        finput.close();
    }catch(FileNotFoundException e){
        System.out.println("Ficheiro inexistente, introduza um nome correto");   
    }
        System.out.println("");
        if (nElems-nElemsinic != 3){
            nElems = nElemsinic;
        }
        return nElems;
    }
    
    private static int guardarDados(String linha, String[][] infoJogadores, int nElems, int N_CAMPOS_INFO){
        /**
         * Acede à informação de uma linha do ficheiro e guarda-a na estrutura dados se ainda
         * não existe linha com aquele valor no 1º elemento
         * @param linha - String com o conteúdo de uma linha do ficheiro
         * @param info - matriz de strings com a informação lida do ficheiro
         * @param nElems - número de elementos existentes na matriz
         * @return - o novo número de elementos da matriz
         */

        String [] temp = linha.split(";");
        
        if (temp.length == N_CAMPOS_INFO){
            String num = temp[0].trim();
            int pos = pesquisarElemento(num, nElems, infoJogadores);
            if (pos == -1){
                for (int i= 0; i <N_CAMPOS_INFO; i++){
                    infoJogadores[nElems][i] = temp[i].trim();
                    
                }
            nElems++;
            }
        }
        return nElems;
    }
    
    public static int pesquisarElemento(String valor, int nEl, String[][] mat){
        /** 
         * Pesquisar linha de matriz por primeiro elemento da linha 
         * 
         * @param valor - elemento a pesquisar 
         * @param nEl - nº de elementos da matriz 
         * @param matriz - matriz com a informação 
         * @return -1 se não existe linha com esse valor ou o 
         *        nº da linha cujo primeiro elemento é esse valor 
         */
        
        for(int i = 0; i< nEl; i++){
            if (mat[i][0].equals(valor)){
                return i;
            }
        }
        return -1;
    }
    
    
    
    
   /** Esta é uma solução para a listagem paginada, 
    * - Informação é organizada em páginas 
    * - Cada página será constituída, no máximo, por 
    *       MAX_LINHAS_PAGINA  ( constante definida na classe). 
    * - Sempre que muda de página o programa pára até o 
    * utilizador carregar na tecla ENTER 
    * - A nova página inicia sempre com o  cabeçalho.
**/
    
    private static void cabecalho(){
        System.out.printf("%50s%n", "Participantes");
        System.out.printf("%75s%n", "==================================================");
        
    }
    
    
    
    public static boolean actualizarInfoParticipante( String[][] infoJogadores, int nElems, int N_CAMPOS_INFO, int [][]pontos, String[] jogos, int a) throws FileNotFoundException{
        int pos, i=0;
        String eMail = infoJogadores[i][0];
     
        if((pos = pesquisarElemento(eMail, nElems, infoJogadores)) > -1){
            int op;
            do{
                Formatter out = new Formatter (System.out);
                Metodos1.mostrarParticipante(out, infoJogadores[pos], N_CAMPOS_INFO);
                op = menuInfoParticipante();
                switch (op){
                    case 1:
                        
                        System.out.println("Novo Email: ");
                        infoJogadores[a][0] = ler.nextLine();
                        break;
                    case 2:
                       
                        System.out.println("Novo nome: ");
                        infoJogadores[a][1] = ler.nextLine();
                        break;
                    case 3:
                        
                        System.out.println("Nova data nascimento: ");
                        infoJogadores[a][2] = ler.nextLine();
                        break;
                    case 0:
                        Menus.subMenu(jogos, infoJogadores, nElems, pontos) ;
                        break;
                    default:
                        System.out.println("Opção incorreta");
                        break;
                    }
                } while (op != 0);
            return true;
            }
        System.out.println("O participante %s não foi encontrado!" + eMail);
        return false;
    }
    
    /** 
    * Mostrar a informação de um participante separada por ;
    * @param out - instancia de formatter associado ao stream pretendido 
    * @param participante - array de Strings com a informação do participante 
    */ 
    
    public static void mostrarParticipante(Formatter out, String[] participante, int N_CAMPOS_INFO){
        for (int j = 0; j<N_CAMPOS_INFO; j++){
            if (j==1){
                out.format("%30s;", participante[j]);
            }else{
                out.format("%12s;", participante[j]);
            }
        }
    }
    
    /**
     * Apresenta o menu de opções de atualização de dados atualizáveis
     * do participante
     * 
     * @return um inteiro que é opção escolhida
     */
    private static int menuInfoParticipante(){
        
        String texto = "Atualizar Informação de Participante"
                + "\n1 - Email"
                + "\n2 - Nome"
                + "\n3 - Data Nascimento"
                + "\n0 - Terminar"
                + "\n\nQual a sua opção?";
        
        System.out.printf("%n%s%n", texto);
        int op = ler.nextInt();
        ler.nextLine();
        return op;
    }
}
