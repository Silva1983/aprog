package org.dei.figuras;

public class MainFiguras {

    public static void main(String[] args) {

        System.out.println("\n### Figuras Construídas ###");
        Circulo c1 = new Circulo();
        System.out.println(c1);

        Circulo c2 = new Circulo(5, "amarelo");
        System.out.println(c2);

        Retangulo r1 = new Retangulo();
        System.out.println(r1);

        Retangulo r2 = new Retangulo(5, 2, "azul");
        System.out.println(r2);              
        
        System.out.println("\n### Variável do Tipo Object ###");
        Object obj; // object é a superclasse de todas as classes (dá para armazenar várias instâncias/variáveis diferentes)
        
        obj = c1; // c1 é uma instancia do Circulo
        System.out.println(obj.toString()); // polimorfismo (se o método toString não estivesse na classe Circulo (classe mais específica), procurava na superclasse Figura (classe mais genérica))
        // polimorfismo só funciona quando o método está reescrito
        obj = r1; // r1 é uma instância do Retangulo
        System.out.println(obj.toString()); 
        
        // Armazenamento de Objetos num Contentor do Tipo Array
        Object[] figuras = new Object[10];
        // b) pode-se substituir o contentor object por um  Figura para o figuras[5] não causar erro
        // Figura[] figuras = new Figuras[10];

        figuras[0] = c1;
        figuras[1] = c2;
        figuras[2] = r1;
        figuras[3] = r2;
        
        figuras[5] = "isep"; // do tipo String não dá, pois não é um objeto da classe

        System.out.println("\n### Listagem de Figuras Armazenadas no Contentor ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                System.out.println(figuras[i]);
                
                // downcasting
                Figura fig = (Figura) figuras[i];
                System.out.println("Área figura: " + fig.calcularArea() + "\n"); // calcuraArea é abstrato, mas o polimorfismo permite que recorra ao circulo ou retangulo
                // ao substituir fig.calcularArea() por figuras[i].calcularArea() já se obtém acesso direto
            }
        }
        
        // outra hipótese para aplicar o downcasting
        System.out.println("\n### Listagem de Figuras Armazenadas no Contentor ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Retangulo) { // instanceof - verifica se é da classe Retangulo ou suas subclasses
                System.out.println(figuras[i]);
            }
        }
        
    }
    
}
