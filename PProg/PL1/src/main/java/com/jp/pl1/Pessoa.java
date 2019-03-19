/*
2. Altere o programa para que seja criado um objeto representativo da pessoa, com apenas um atributo - o
seu nome. O programa deve implementar:
§ Dois construtores:
    § Sem parâmetros;
    § Com um parâmetro para receber o nome da pessoa.
§ Métodos de consulta e de modificação do nome;
§ Método toString que devolva uma string com a representação interna do objeto (exemplo: "O nome é Maria").
 */
package com.jp.pl1;

import java.util.Scanner;

/**
 * @author ASUS
 */
public class Pessoa {

    private String nome;
    private int idade;

    private static final String SEM_NOME = "sem nome";
    private static final int SEM_IDADE = 0;

    public static Scanner input = new Scanner(System.in);

    //2.
    public Pessoa() {
        nome = SEM_NOME;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getName() {
        return nome;
    }

    /**
     * Constrói uma instância de Pessoa recebendo o nome.
     */
    public void setName(String nome) {
        this.nome = nome;
    }

    public static void welcome(Pessoa p) {
        System.out.println("Insira o nome...");
        p.setName(input.nextLine());
    }

    public static void consultar(String nome) {
        System.out.println("O nome inserido é: " + nome);
    }

    public static void modificar(Pessoa p) {
        System.out.println("Insira o novo nome...");
        p.setName(input.nextLine());
    }

    public String toString() {
        return String.format("O nome é %s", nome);
    }

    //3.
    public Pessoa(String nome, int idade) {
        nome = SEM_NOME;
        idade = SEM_IDADE;
        this.nome = nome;
        this.idade = idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static Pessoa welcome2() {
        Pessoa p = new Pessoa();
        System.out.println("Olá! Insira um nome...");
        p.setName(input.nextLine());
        System.out.println("Insira a idade...");
        p.setIdade(input.nextInt());
        return p;
    }

    public static int parseInt(String myString) {
        int num = Integer.parseInt(myString);
        return num;
    }

    public String toString2() {
        return String.format("%s tem %d anos.", nome, idade);
    }

    public static void modificarIdade(Pessoa p) {
        System.out.println("Insira nova idade");
        p.setIdade(input.nextInt());
    }
}
