/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author ASUS
 */
public class MainAutomovel {
    
    public static void main(String[] args) {
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);
//        Automovel a3 = new Automovel();
//        a3.setCilindrada(0);
        
        System.out.println("Automovel a1: " + a1.toString()); //o método toString não é necessário invocar
        System.out.println("Matrícula Automovel a1: " + a1.getMatricula());
//        System.out.println("Matrícula Automovel a1: " + a1.matricula);
            
        System.out.println("#Automoveis: " + Automovel.getTotalAutomoveis());
        System.out.println("#Automoveis (v2): " + a1.getTotalAutomoveis());
        
        Automovel a2 = new Automovel();
        
        System.out.println("Automovel a2: " + a2);
        a2.setCilindrada(1800);
        a2.setMatricula("33-44-BB");
        System.out.println("Automovel a2: " + a2);
        System.out.println("#Automoveis (pós a2): " + Automovel.getTotalAutomoveis());
        
//        int asd = a1.calcularDiferencaCilindrada(a2);
        
        System.out.println("Diferença cilindrada: " + Math.abs(a1.calcularDiferencaCilindrada(a2)));
        
//        Automovel a3;
//        new Automovel();
//        System.out.println("#Automoveis (pós a3): " + Automovel.getTotalAutomoveis());

        System.out.println("Automovel com > cilindrada: " + a1.isCilindradaMaior(a2));
        System.out.println("Automovel com > cilindrada: " + a2.isCilindradaMaior(a1));
        System.out.println("Automovel com > cilindrada: " + a1.isCilindradaMaior(a2.getCilindrada()));
        
//        boolean cilindrada = a1.isCilindradaMaior(a2);
        
        if (a1.isCilindradaMaior(a2) == true) {
            System.out.println("O automóvel com maior cilindrada é " + a1.getMatricula());
        } else {
            System.out.println("O automóvel com maior cilindrada é " + a2.getMatricula());
        }
        
        System.out.println("Cilindrada do a1 superior a 2000 cc: " + a1.isCilindradaMaior(2000));
        
    }
}
