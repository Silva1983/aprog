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
 * Elabore um programa em Java que permita receber um número e verificar se é um
 * número binário.
 */
public class Exer8 {

    public static void main(String[] args) {

        String n;
        long num, dig;
        //boolean flag = true;

        n = JOptionPane.showInputDialog("Insira um nº.");
        num = Long.parseLong(n);
        
        // num.matches("[01]+")
        
        while (num > 0) {
            dig = num % 10;
            if (dig > 1) {
                //flag = false;
                //break;
            n = JOptionPane.showInputDialog("O nº inserido não é binário. Insira um novo nº.");
            num = Long.parseLong(n);
            } else { num = num / 10;
            }
        }
        //if (flag) {
            JOptionPane.showMessageDialog(null, "O nº inserido é binário.");
        //}
    }
}
