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

// public class Figura {
public abstract class Figura {

    private String cor;

    private static final String COR_POR_OMISSAO = "cinzento";

    public Figura(String cor) {
        this.cor = cor;
    }

    public Figura() {
        cor = COR_POR_OMISSAO;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("cor=%s", cor);
    }
    
    public abstract double calcularArea();
    // um método abstrato tem de estar numa classe também abstrata e esta classe não pode ser invocada (a partir deste momento não funciona o new)
    // ou seja, não se pode instanciar objectos desta classe (criar instâncias desta classe)
    // métodos static numa classe abstrata podem ser invocados, pois são static
}
