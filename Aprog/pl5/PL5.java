/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author ssilv
 */
public class PL5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double perc=0;
       int cont=0;
       int cont2=0;
       
       String nome = new String();
       JFrame frame = new JFrame("sfsd");
        
        
        while ( !nome.equals("zzz")){
            nome = JOptionPane.showInputDialog(frame,"Introduza o nome", "Nome", JOptionPane.QUESTION_MESSAGE);
            String id = JOptionPane.showInputDialog(frame,"Introduza a idade do " + nome, "Idade", JOptionPane.QUESTION_MESSAGE);
            int idade = Integer.parseInt(id);
            
            cont++;
            if (idade >= 18){
                
                cont2++;
                perc = (cont2 * 100) / cont;
            }
        }
        JOptionPane.showMessageDialog(frame,"A porcentagem de pessoas com idade igual ou superior a 18 é de " + perc +"%", "Porcentagem",JOptionPane.INFORMATION_MESSAGE);
    
    }
}
