/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 *
 * Elabore um programa em Java que leia duas sequências de números, a primeira
 * terminada com 0 e a segunda que termina em -1 e determine qual a sequência (a
 * 1ª ou a 2ª) que contém mais números pares.
 */
public class Exer6 {

    public static void main(String[] args) {

        String n1, n2;
        int num1, cont1 = 0, num2, cont2 = 0;

        n1 = JOptionPane.showInputDialog("Insira um nº na sequência 1");
        num1 = Integer.parseInt(n1);

        while (num1 != 0) {

            if (num1 % 2 == 0) {
                cont1 = cont1 + 1;
            }
            n1 = JOptionPane.showInputDialog("Insira um nº na sequência 1");
            num1 = Integer.parseInt(n1);
        }

        n2 = JOptionPane.showInputDialog("Insira um nº na sequência 2");
        num2 = Integer.parseInt(n2);

        while (num2 != -1) {

            if (num2 % 2 == 0) {
                cont2 = cont2 + 1;
            }
            n2 = JOptionPane.showInputDialog("Insira um nº na sequência 2");
            num2 = Integer.parseInt(n2);
        }
        if (cont1 > cont2) {
            JOptionPane.showMessageDialog(null, "A 1ª sequência tem mais nºs pares.");
        } else if (cont1 < cont2) {
            JOptionPane.showMessageDialog(null, "A 2ª sequência tem mais nºs pares.");
        } else {
            JOptionPane.showMessageDialog(null, "A 1ª sequência tem tantos nºs pares como a 2ª.");
        }
    }
}
