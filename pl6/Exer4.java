/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author ASUS
 *
 * Analise a classe CalCombinatorio definida nas aulas teóricas. Crie um projeto
 * onde vai incluir esta classe CalCombinatorio. Acrescente à classe
 * CalCombinatorio mais dois métodos de classe, o método arranjos e o método
 * permutações. Crie uma classe TesteCalCombinatorio para testar as
 * funcionalidades da classe.
 */
public class Exer4 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Formatter obj1=new Formatter(System.out);
        Scanner obj2=new Scanner(System.in);
    
        String m = "Escolha um método:\n1) Permutações\n2) Arranjos sem repetiçao";
        
        obj1.format("%s%n", m);
        int op;
        do {
            op=obj2.nextInt();
            if (op <= 0 || op > 2)
                obj1.format("%s%n", "A opção inserida é inválida. Insira novamente.");
        } while(op <= 0 || op > 2);
    
        switch (op){
            case 1:
                obj1.format("%s%n","Insira n");
                long n=obj2.nextLong();
                
                long res1=CalComb.permutações(n);
                obj1.format("%s%d%n", "Resultado = ", res1);
                break;
            case 2:
                obj1.format("%s%n","Insira n");
                n=obj2.nextLong();
                obj1.format("%s%n", "Insira p");
                long p=obj2.nextLong();
                
                long res2=CalComb.arranjos(n, p);
                if (res2 != -1)
                    obj1.format("%s%d%n", "Resultado = ", res2);
                else
                    obj1.format("Erro! (n<p)S");
                break;
        }
    }
}
