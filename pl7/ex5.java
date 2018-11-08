/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

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
                        + "\n 3 - Listar nomes com apelido começado por S"
                        + "\n 4 - Percentagem de nomes com apelido começado por S"
                        + "\n 5 - Saír");
                op = ler.next().charAt(0);
                switch (op){ 
                    case '1':
                        cont = lerNomes(nomes);
                        break;
                    case '2':
                        
                        listarNomes(cont, nomes);
                        break;
                    case '3':
                        mostrarApelido(nomes, cont);
 
                        break;
                    case'4':
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
            System.out.println("A percentagem de apelidos que começam por 's' é de: " + media);
        }
}
           
            
            
        

