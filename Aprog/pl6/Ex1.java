/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL6;



/**
 *
 * @author ssilv
 */

public class Ex1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* O Método 1 converte letras maiusculas em minusculas e verifica se uma determinada palavra
        na String pal é políndromo (palavra que se lê da mesma maneira da direita para a esquerda e da 
        esquerda para a direita)
        */
        
        /* método 2 converte maiusculas em minusculas e verifica se é polindromo. Imprime em consola
        o número de vezes que a palavra é polindromo, ex "ARARA", pode ser dividida em 2 palavras polindromos,
        "ARA" e "ARARA", logo imprime duas vezes e converte a palavra para minusculas
        */
        String pal = "arara";
        
           metodo2(pal);   
       
        }
    
    
    public static boolean metodo1 (String pal){
            boolean resposta = true;
            pal = pal.toLowerCase();
            int tamanho = pal.length();
            for (int i = 0; i<tamanho / 2; i++){
                if (pal.charAt(i) != pal.charAt(tamanho - 1 - i)){
                    resposta = false; break;
                }
            }
            System.out.println(pal);
            return resposta;
    }
    
    public static boolean metodo2 (String pal){
        
        int i, j;
        pal = pal.toLowerCase();
        i = 0; j = pal.length() - 1;
        while (i < j && pal.charAt(i) == pal.charAt(j)){
            i++;
            j--;
            System.out.println(pal);
        }
        
        return i >= j;
    } 
}
