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
public class Cumprimentar {
    private String nome;
    private int idade;
    
    private final String NOME_POR_OMISSAO = "Sem nome";
    private final int IDADE_POR_OMISSAO = 0;
    
    private final int TOTAL_NOMES = 0;
    
    public Cumprimentar(){
        
    }
    public Cumprimentar(String nome ){
        this.nome = nome;

    }
    
    public Cumprimentar(int idade){
        this.idade=idade;
    }
    
    public String getNome(){
        
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;  
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String toString(){
        
        return String.format("O nome é %s e tem %d anos de idade ", nome, idade);
    }
}
