/*
2. Modifique as classes criadas por forma a que cada instância possa calcular a sua área.
a) Calcule e mostre as áreas das várias instâncias, de retângulo e de círculo, armazenadas no contentor
figuras.
b) Verifique que é possível adicionar uma instância do tipo String ao contentor figuras.
c) Verifique que em runtime, o varrimento do contentor aquando do cálculo das áreas gera um erro.
d) Altere o código de forma a resolver este problema.
e) Programe as seguintes listagens separadas de:
    i. Instâncias retângulo;
    ii. Instâncias círculo.
*/

package org.dei.figuras;

public class Circulo extends Figura {

    private double raio;

    private static final int RAIO_POR_OMISSAO = 1;

    public Circulo(double raio, String cor) {
        super(cor);
// super sem . serve para invocar o construtor da superclasse
        this.raio = raio;
    }

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    public Circulo(String cor) {
        super(cor);
        raio = RAIO_POR_OMISSAO;
    }

    public Circulo() {
        super();
        raio = RAIO_POR_OMISSAO;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return String.format("Círculo: raio=%.1f %s", raio, super.toString());
// super com o ponto serve para invocar um método da superclasse
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
}
