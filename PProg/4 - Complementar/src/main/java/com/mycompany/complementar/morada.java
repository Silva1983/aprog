/*
 * a) Crie uma classe Morada com os seguintes atributos:
        localidade, 
        código postal e  
        respetivo endereço da morada(rua, travessa, entre outros). 
b) Crie uma classe individuo com os atributos nome, idade, morada, peso e altura. 
c) Crie um método que permita calcular o IMC e devolver esse mesmo valor. 
d) Na classe anterior adicione o método toString() para apresentar a informação inicial do individuo. 
e) Na classe Main crie a lógica necessária para reproduzir o cenário pretendido. 
 */
package com.mycompany.complementar;

/**
 *
 * @author ssilv
 */
public class morada {
    /**
     * localidade do individuo
    */
    private String localidade;
    
    /**
     * código postal do individuo
     */
    
    private String cPostal;
    
    /**
     * morada 
     */
    private String endMorada;
   
    private final String CODIGO_POSTAL_OMISSAO = "Sem código postal";
    
    private final String LOCALIDADE_POR_OMISSAO = "Sem localidade";
    
    private final String MORADA_POR_OMISSAO = "Sem morada";
    
/**
 * Constroi uma instancia da morada do individuo, recebendo o endmorada, código postal e a localidade
 *  @param endMorada 
 * @param localidade
 * @param cPostal
 */
    public morada(String endMorada, String localidade , String cPostal){
        this.endMorada = endMorada;
        this.localidade = localidade;
        this.cPostal = cPostal;
        
    }
    /**
     * Constroi uma instância da morada por omissão
     */
    public morada(){
        this.localidade = LOCALIDADE_POR_OMISSAO;
        this.cPostal = CODIGO_POSTAL_OMISSAO;
        this.endMorada = MORADA_POR_OMISSAO  ;
    }
    /**
     * Devolve a morada
     * @return endMorada
     */
    public String getMorada(){
        return endMorada;
    }
    /**
     * Altera a morada
     * @param endMorada 
     */
    public void setMorada(String endMorada){
        this.endMorada = endMorada;
    }
    /**
     * Devolve código postal
     * @return cPostal
     */
    public String getPostal(){
        return cPostal;
    }
    /**
     * Altera código postal
     * @param cPostal 
     */
    public void setPostal(String cPostal) {
        this.cPostal = cPostal;
    }
    
    public String getLocalidade(){
        return localidade;
    }
    
    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }
    
    public String toString(){
        return String.format("\nMorada: " +endMorada + "\nCódigo Postal: "+ cPostal+ " \nLocalidade: " + localidade);
    }
}
