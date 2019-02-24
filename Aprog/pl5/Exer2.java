/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5;

import javax.swing.JOptionPane;

/**
 * @author JP
 *
 * Descreva um algoritmo e codifique-o em Java, em que dadas as temperaturas
 * máximas registadas em N dias classifique o dia com a temperatura máxima mais
 * elevada, de acordo com a tabela abaixo. Caso a temperatura máxima mais
 * elevada ocorrida nos N dias seja menor que -30ºC ou maior ou igual a 50ºC
 * deverá ser enviada ao utilizador a mensagem “Temperatura extrema”. Para a
 * resolução do exercício considere que todas as temperaturas máximas
 * introduzidas têm valores inteiros.
 *
 */
public class Exer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String tempMax, dias;
        int maxTemp, cont = 0;
        final int nDias;

        dias = JOptionPane.showInputDialog("Quantos dias pretende inserir?");
        nDias = Integer.parseInt(dias);

        while (cont < nDias) {
            cont++;
            tempMax = JOptionPane.showInputDialog("Insira a tempreatura máxima.");
            maxTemp = Integer.parseInt(tempMax);

            if (maxTemp >= -30 && maxTemp < 9) {
                JOptionPane.showMessageDialog(null, "Muito Frio");
            } else if (maxTemp >= 9 && maxTemp < 15) {
                JOptionPane.showMessageDialog(null, "Frio");
            } else if (maxTemp >= 15 && maxTemp < 20) {
                JOptionPane.showMessageDialog(null, "Ameno");
            } else if (maxTemp >= 20 && maxTemp < 30) {
                JOptionPane.showMessageDialog(null, "Quente");
            } else if (maxTemp >= 30 && maxTemp < 50) {
                JOptionPane.showMessageDialog(null, "Muito Quente");
            } else {
                JOptionPane.showMessageDialog(null, "Temperatura extrema");
            }
        }
    }
}
