/*
2. Altere o programa para que seja criado um objeto representativo da pessoa, com apenas um atributo - o
seu nome. O programa deve implementar:
§ Dois construtores:
    § Sem parâmetros;
    § Com um parâmetro para receber o nome da pessoa.
§ Métodos de consulta e de modificação do nome;
§ Método toString que devolva uma string com a representação interna do objeto (exemplo: "O nome é Maria").

3. Modifique novamente o programa, acrescentando o atributo idade ao objeto representativo da pessoa. O
novo programa deve incluir:
§ Construtor que receba como parâmetros o nome e a idade da pessoa;
§ Métodos de consulta e de modificação da idade;
§ Método toString que devolva uma string legível para o utilizar contendo o nome e a idade da
pessoa, como por exemplo: "Maria tem 14 anos.".
 */
package com.jp.pl1;

/**
 * @author ASUS
 */
public class MainPessoa {

    public static void main(String[] args) {
        //2
        Pessoa indiviuo1 = new Pessoa();
        
        Pessoa.welcome(indiviuo1);
        
        Pessoa.consultar(indiviuo1.getName());
        
        Pessoa.modificar(indiviuo1);
        
        System.out.println(indiviuo1.toString());
        
        //3 
        Pessoa individuo2 = Pessoa.welcome2();
        
        System.out.println(individuo2.toString2());
        
        Pessoa.modificarIdade(individuo2);
                
        System.out.println(individuo2.toString2());
    }
}
