/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author ssilv
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Ex3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
       double perc=0;
       int cont=0;
       int cont2=0;
       int exit;
       int idade;
       int name;
       
       String nome = new String();
       JFrame frame = new JFrame("sfsd");
        
        do{
            while ( !nome.equals("zzz")){
                nome = JOptionPane.showInputDialog(frame,"Introduza o nome", "Nome", JOptionPane.QUESTION_MESSAGE);
                
                    
                if (!nome.equals("zzz")){
                    String id = JOptionPane.showInputDialog(frame,"Introduza a idade do " + nome, "Idade", JOptionPane.QUESTION_MESSAGE);
                    idade = Integer.parseInt(id);
                    
                    
                    cont++;
                    if (idade >= 18){

                        cont2++;
                        perc = (cont2 * 100) / cont;
                    }
                }
                
                
            }
            JOptionPane.showMessageDialog(frame,"A porcentagem de pessoas com idade igual ou superior a 18 é de " + perc +"%", "Porcentagem",JOptionPane.INFORMATION_MESSAGE);
            exit = JOptionPane.showConfirmDialog(frame, "Tem a certeza que deseja saír?", "Saír", JOptionPane.YES_NO_OPTION);
    
        } while (exit == JOptionPane.NO_OPTION);
        if (exit == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
}
