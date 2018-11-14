/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6;

/**
 *
 * @author ASUS Exercício 4 Analise a classe CalCombinatorio definida nas aulas
 * teóricas. Crie um projeto onde vai incluir esta classe CalCombinatorio.
 * Acrescente à classe CalCombinatorio mais dois métodos de classe, o método
 * arranjos e o método permutações. Crie uma classe TesteCalCombinatorio para
 * testar as funcionalidades da classe.
 */
public class CalComb {

    public static void main(String[] args) {

    }

    public static long factorial(long num) {
        long fact = 1;

        for (long i = num; i > 1; i--) {
            fact = fact * i;
        }
        return (fact);
    }

    public static long arranjos(long n, long p) {

        if (n < p) {
            return -1;
        }
        return factorial(n) / factorial(n - p);
    }

    public static long permutações(long n) {

        return factorial(n);
    }
}
