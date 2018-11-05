/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_6;

import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r, h, volume;
        String solido;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o sólido revolução? Digite FIM para terminar.");
        solido = leitor.nextLine();

        while (!"FIM".equalsIgnoreCase(solido)) {
            if("esfera".equalsIgnoreCase(solido) || "cilindro".equalsIgnoreCase(solido) || "cone".equalsIgnoreCase(solido))
            {
                if ("esfera".equalsIgnoreCase(solido))
                {
                    System.out.println("Qual é o raio?");
                    r = leitor.nextDouble();
                    volume = v_esfera(r);
                    System.out.println("O volume da esfera=" + volume);

                }
                if ("cilindro".equalsIgnoreCase(solido))
                {
                    System.out.println("Qual é o raio?");
                    r = leitor.nextDouble();
                    System.out.println("Qual é a altura?");
                    h = leitor.nextDouble();
                    volume = v_cilindro(r, h);
                    System.out.println("O volume do cilindro=" + volume);
                } 
                if ("cone".equalsIgnoreCase(solido))
                {
                    System.out.println("Qual é o raio?");
                    r = leitor.nextDouble();
                    System.out.println("Qual é a altura?");
                    h = leitor.nextDouble();
                    volume = v_cone(r, h);
                    System.out.println("O volume do cone=" + volume);
                }
            }
            else
            {
                System.out.println("Impossível");
            }
            System.out.println("Qual o sólido revolução? Digite FIM para terminar.");
            solido = leitor.nextLine();
        }
    }

    public static double v_esfera(double r) {
        double v_esfera;
        v_esfera = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        return v_esfera;
    }

    public static double v_cilindro(double r, double h) {
        double v_cilindro;
        v_cilindro = Math.PI * Math.pow(r, 2) * h;
        return v_cilindro;
    }

    public static double v_cone(double r, double h) {
        double v_cone;
        v_cone = (1.0/3.0) * Math.PI * Math.pow(r, 2) * h;
        return v_cone;
    }
}
