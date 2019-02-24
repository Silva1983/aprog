/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author ssilv
 */
import java.util.Scanner;
public class ex5 {
    public static Scanner ler = new Scanner(System.in);
    
    public static void main(String arg[]){
        menu();
    }
        public static void menu(){
            String nomes[] = new String[100];
            
            int cont = 0;
            char op;
            do{
                System.out.println("\n 1 - Introduzir nomes"
                        + "\n 2 - Listar nomes lidos"
                        + "\n 3 - Listar nomes com apelido começando por S"
                        + "\n 4 - Percentagem de nomes com apelido começando por S"
                        + "\n 5 - Sair");
                op = ler.next().charAt(0);
                switch (op){ 
                    case '1':
                        cont = lerNomes(nomes);
                        break;
                    case '2':
                        
                        listarNomes(cont, nomes);
                        break;
                    case '3':
                    	PreencherVetorApelidosS(nomes, new String[0]);
                        break;
                    case'4':
                        mostrarApelido(nomes, cont);
                        break;
                    case '5':
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }while(op !='5');
    }
        
        public static int lerNomes(String nomes[]){
            int cont= 0;
            System.out.println("Introduza o nome");
            for(int i= 0; i<nomes.length; i++){
                
                nomes[i] = ler.nextLine();
                cont++;
                if (nomes[i].equalsIgnoreCase("Fim")){
                    break;
                }
            }
            return cont;
        }
        
        public static void listarNomes(int cont, String nomes[]){
            for(int i = 0; i< cont-1; i++){
                System.out.println(nomes[i]);
            }
        }
        
        public static void mostrarApelido (String nomes[], int cont){
            String [] nomesSeparado;
            String palavra;
            int contApelidos = 0;
            double media;
            String apelido[]=new String[cont-1];
            for (int i = 0; i < cont-1; i++){
                 nomesSeparado = nomes[i].split(" ");
                 palavra = nomesSeparado[nomesSeparado.length-1];
                 palavra = palavra.toLowerCase();
                 if (palavra.startsWith("s")){
                         apelido[i] = palavra;
                         contApelidos++;
                         System.out.println(apelido[i]);
                 } 
            }
            media = cont/contApelidos;
            System.out.println("A percentagem de apelidos que começando por 's'é de: " + media);
        }
        
        public static int PreencherVetorApelidosS(String[] v1, String[] v2) {
        	//retira os valores nulos do v1
        	//retirando os valores "null" podemos temos o tamanho real do array]
        	//seu seu calculo de porcentagem esta errado, acredito que isso vá te ajudar
        	// no final do programa colocarei um método de exemplo.
        	v1 =  Arrays.stream(v1)
                    .filter(s -> (s != null && s.length() > 0))
                    .toArray(String[]::new); 
        	
        	//crio uma lista para adicionar os nomes com apelido iniciados com S
        	// essa lista futuramente sera atribuida ao array v2
        	List<String> listaS = new ArrayList<>();
        	for(String s : v1) {
        		String[] aux= s.split(" ");
        		//verifica se a ultima palavra do nome é escrita com a letra S, se for adiciona na lista
        		if(aux[aux.length-1].toLowerCase().startsWith("s")) {
        			listaS.add(s);
        		}
        	}
        	
        	//transforma a lista em um array de String e adiciona ao V2
        	v2 = listaS.toArray(new String[listaS.size()-1]);
        	
        	System.out.printf("temos %d%% de apelidos iniciando com a letra S\n", porcentagemComS(v1,v2));
        	
        	//segundo o enunciado deve ser retornado o tamanho do array de finalS
        	return v2.length;
        }
        
        
        // metodo para retornar a porcentagem entre 2 arrays.
        // este método é só um exemplo de como efetuar o calculo de porcentagem.
        // primeiro voce deve desconsiderar os valores nulos do array
        // quando você cria o array no inicio do programa você inicia com "new String[100]"
        // então mesmo que os 100 itens não preenchido irá considerar sempre que tem 100 itens.
        // com a retirada dos itens null dos 2 arrays você consegue chegar no verdadeiro resultado.
        public static int porcentagemComS(String[] v1, String[] v2) {
         	v1 =  Arrays.stream(v1)
                    .filter(s -> (s != null && s.length() > 0))
                    .toArray(String[]::new); 
         	v2 =  Arrays.stream(v2)
                    .filter(s -> (s != null && s.length() > 0))
                    .toArray(String[]::new); 
         	
         	return (v2.length*100)/v1.length;
        }
}
           
            
            
        

