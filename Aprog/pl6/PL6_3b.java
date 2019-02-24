/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_3b;

import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL6_3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, resultado_ab = 0, resultado_ac= 0, resultado_bc= 0;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("Qual a medida do lado a?");
            a = leitor.nextDouble();
        } while (a <= 0);
        do {
            System.out.println("Qual a medida do lado b?");
            b = leitor.nextDouble();
        } while (b <= 0);
        do {
            System.out.println("Qual a medida do lado c?");
            c = leitor.nextDouble();
        } while (c <= 0);
        
        if (a + b > c && a + c > b && b + c > a) {
            resultado_ab = calcAng(a, b, c);
            resultado_ac = calcAng(a, c, b);
            resultado_bc = calcAng(b, c, a);
            System.out.println("Angulo_ab="+ Math.toDegrees(resultado_ab)+"Angulo ac="+ Math.toDegrees(resultado_ac)+"Angulo bc="+ Math.toDegrees(resultado_bc));
        }
        else
        {
            System.out.println("Impossível");
        }
    }

    public static double calcAng(double a, double b, double c) {
        return Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
    }
}
