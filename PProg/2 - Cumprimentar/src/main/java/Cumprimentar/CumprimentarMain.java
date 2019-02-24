/*
    Altere o programa para que seja criado um objeto representativo da pessoa, com apenas um atributo - o
    seu nome. O programa deve implementar:
        § Dois construtores:
        § Sem parâmetros;
        § Com um parâmetro para receber o nome da pessoa.
        § Métodos de consulta e de modificação do nome;
        § Método toString que devolva uma string com a representação interna do objeto (exemplo: "O nome é Maria").
 */

package Cumprimentar;

/**
 *
 * @author ssilv
 */
import java.util.Scanner;
public class CumprimentarMain {
    public static void main(String[] args) {
            Scanner ler = new Scanner (System.in);
            //Exercícicio 1
        /*
            
            System.out.println("Introduza o seu nome");
            String nome = ler.nextLine();
            System.out.println("Olá " + nome);
        */
        
            //Exercício 2
           
            Cumprimentar c1 = new Cumprimentar();
            System.out.println("Introduza o seu nome ");
            c1.setNome(ler.nextLine());

            System.out.println("Introduza a sua idade");
            c1.setIdade(ler.nextInt());

            System.out.println(c1.toString());
        
            
            
    }
}
