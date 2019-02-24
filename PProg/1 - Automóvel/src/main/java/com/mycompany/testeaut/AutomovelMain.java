/*
 *3. Crie uma nova classe chamada MainAutomovel para invocar as funcionalidades da classe Automovel. Para
isso:
a) Crie uma instância da classe Automovel, designada a1, com a marca Toyota, matrícula 11-11-AA e
cilindrada 1400 cc;
b) Mostre o automóvel a1 no ecrã;
c) Mostre apenas a matrícula do automóvel a1;
d) Mostre a quantidade de instâncias Automovel criadas;
e) Crie uma nova instância da classe Automovel, designada a2, com a marca Audi e matrícula 22-22-
BB;
 */
package com.mycompany.testeaut;

/**
 *
 * @author ssilv
 */
public class AutomovelMain {
    public static void main(String[] args) {
        
        Automovel a1 = new Automovel("11-11-AA" , "Toytota", 1400);
        //System.out.println(a1);
        System.out.println("Automovel a1: " + a1.toString());
        System.out.println("Matrícula do automóvel: " + a1.getMatricula());
        System.out.println("#Total de automóveis: " + Automovel.getTotalAutomoveis());
        //System.out.println("Total de automóveis: (V2):" + a1.getTotalAutomoveis());
        
        Automovel a2 = new Automovel("22-22-BB", "Audi");
        System.out.println("Automóvel a2: " + a2.toString());
        a2.setCilindrada(1800);
        System.out.println("Automóvel a2: " + a2.toString());
        System.out.println("#Total automóveis: " + Automovel.getTotalAutomoveis());
        System.out.println("Diferença de cilindrada:" + Math.abs(a1.calcularDiferencaCilindrada(a2)));
        
        if (a1.getCilindrada()>a2.getCilindrada()){
            System.out.println("Veículo com maior cilindrada é: " + a1.getMarca()+ "\ncom a matrícula: " + a1.getMatricula());
        }else
            System.out.println("Veículo com maior cilindrada é: " +a2.getMarca()+ "\ncom a mátricula: " + a2.getMatricula());
        
        if (a1.getCilindrada() > 2000){
            System.out.println("O automóvel " + a1.getMarca() +" tem uma cilindrada superior a 2000cc");
        }else 
            System.out.println("O automóvel " + a1.getMarca() + " tem uma cilindrada inferior a 2000cc");
    }
    
}
