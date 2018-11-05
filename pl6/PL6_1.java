/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_1;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL6_1 {

    static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cont = 0;
        String palavra;
        boolean resposta = false;

        do {
            System.out.println("Insira uma palavra:");
            palavra = teclado.nextLine();
            if (metodo2(palavra) == true) {
                resposta = true;
            } else { 
                cont++;
            }
        } while (resposta == false);
        System.out.println(cont);
    }

    public static boolean metodo2(String pal) {
        int i, j;
        pal = pal.toLowerCase();
        i = 0;
        j = pal.length() - 1;
        while (i < j && pal.charAt(i) == pal.charAt(j)) {
            i++;
            j--;
        }
        return i >= j;
    }
}
