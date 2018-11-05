/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_3a;

import java.util.Scanner;

/**
 *
 * @author mariapires
 */
public class PL6_3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, resultado=0;
        String angulo;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("Qual a medida do lado a?");
            a= leitor.nextDouble();
        } while (a<=0);
        do {
            System.out.println("Qual a medida do lado b?");
            b= leitor.nextDouble();
        } while (b<=0);
        do {
            System.out.println("Qual a medida do lado c?");
            c= leitor.nextDouble();
        } while (c<=0);
        do {
            System.out.println("Qual o angulo interno que deseja calcular?(ab/ac/bc)");
            angulo= leitor.next();
        } while (!(angulo.equals("ab") || angulo.equals("ac") || angulo.equals("bc")));
        if(angulo.equals("ab")){
            resultado = calcAng(a, b, c);
        }
        if(angulo.equals("ac")){
            resultado = calcAng(a, c, b);
        }
        if(angulo.equals("bc")){
            resultado = calcAng(b, c, a);
        }
        System.out.println("O angulo é:"+Math.toDegrees(resultado));
    }
    
    public static double calcAng(double a, double b, double c) {
        return Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
    }
}
