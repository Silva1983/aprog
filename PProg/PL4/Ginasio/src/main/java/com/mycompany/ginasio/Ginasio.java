/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ginasio;

/**
 *
 * @author ssilv
 */
public class Ginasio {
    /**
     * Nome
     */
    private String nome;
    /**
     * Genero
     */
    private String genero;
    /**
     * idade
     */
    private int idade;
    /**
     * altura
     */
    private double altura;
    /**
     * peso
     * 
     */
    private double peso;
  
    private final String NOME_POR_OMISSAO = "Sem nome";
    
    private final String GENERO_POR_OMISSAO = "Sem genero";
    
    private final int IDADE_POR_OMISSAO = 0;
    
    private final int ALTURA_POR_OMISSAO = 0;
    
    private final int PESO_POR_OMISSAO = 0;
    
    private static int totalGinasio = 0;
    //1.
    //a
    /**
     * Constroi uma instancia por omissao
     */
    public Ginasio (){
        this.nome = NOME_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        totalGinasio++;
    }
   /**
    * Constroi uma instancia com dois parametros
    * @param nome - nome do utente
    * @param idade - idade do utente
    */
    public Ginasio (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        totalGinasio++;
    }
    
    /**
     * Constroi uma intancia com todos os parametros do utente
     * @param nome - nome do utente
     * @param genero - genero do utente
     * @param idade - idade do utente
     * @param altura - altura do utente
     * @param peso - peso do utente
     */
    public Ginasio (String nome, String genero, int idade, double altura, double peso){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        totalGinasio++;
    }
    //b
    /**
     * Devolve o nome do utente
     * @return 
     */
    public String getNome(){
        return nome;
    }
    /**
     * Devolve o genero do utente
     * @return 
     */
    public String getGenero(){
        return genero;
    }
    /**
     * Devolve a idade do utente
     * @return 
     */
    public int getIdade(){
        return idade;
    }
    /**
     * Devolve a idade do utente
     * @return 
     */
    public double getAltura(){
        return altura;
    }
    /**
     * Devolve o peso do utente
     * @return 
     */
    public double getPeso(){
        return peso;
    }
    //c
    /**
     * Modifica o nome do utente
     * @param nome 
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
     * Modifica o genero do utente
     * @param genero 
     */
    public void setGenero(String genero){
        this.genero = genero;
    }
    /**
     * Modifica a idade do utente
     * @param idade 
     */
    public void setIdade(int idade){
        this.idade = idade;
    }
    /**
     * Modifica a altura do utente
     * @param altura 
     */
    public void setAltura(double altura){
        this.altura = altura;
    }
    /**
     * Modifica o peso do utente
     * @param peso 
     */
    public void setPeso(double peso){
        this.peso = peso;
    }
    //d
    public String toString(){
        return String.format("Nome: " + nome +"\nGenero: "+genero+"\nIdade: "+ idade+ "\nAltura: " + altura+ "\nPeso: " + peso);        
    }
    //e
    /**
     * Calcula a diferença de idades entre dois utentes
     * @param outraIdade
     * @return diferença de idades
     */
    public int calcularDiferenca(int outraIdade){
        
        return (idade - outraIdade);
    }
    
    //f
    /**
     * Calcula o IMC
     * @return - IMC
     */
    public double calcularIMC(){
        return (peso / (Math.pow(altura, 2)));
    }
    //g
    /**
     * Retorna grau de obesidade de um utente
     * @return 
     */
    public String  grauObesidade(){
        String saudavel="Saudavel!";
        String magro = "Magro!";
        String obeso = "Obeso!";
        
        return String.format(calcularIMC() < 18 ? magro: calcularIMC()>= 18 || calcularIMC()<25 ? saudavel:calcularIMC() >= 25 ? obeso: obeso);
        
    }
    //i
    /**
     * Diz qual dos dois utentes é o mais velho
     * @param outroNome - nome de outro utente
     * @param outraIdade - idade do outro utente
     */
    public void maisVelho(String outroNome, int outraIdade){
        if (calcularDiferenca(outraIdade) > 0){
            System.out.println("O" + outroNome + " é mais novo do que o " + nome);
        }else if (calcularDiferenca(outraIdade) < 0){
             System.out.println("O " + outroNome + " é mais velho do que o " + nome);
        }else
            System.out.println("Têm os dois a mesma idade");
        
    }
    
    //j
    /**
     * Obtém o número de instancias de ginasios
     * @return totalGinasio
     */
    public static int getTotalGinasio(){
        return totalGinasio;
    }
    
}
