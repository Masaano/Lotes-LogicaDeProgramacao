
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tecnico
 */
import javax.swing.JOptionPane;

public class Exemplo02 {
    public static void main(String[] args) {
        
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade: "));
        
        if (idade >= 18) {
            int id = JOptionPane.showConfirmDialog(null,"MAIOR DE IDADE");
             if (id == 0) {
                 JOptionPane.showMessageDialog(null,"MAIOR DE IDADE");
                 
                
            }
             {
                 
             }
        }
    }
}
