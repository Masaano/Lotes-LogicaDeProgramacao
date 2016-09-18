package prj_1108;

import javax.swing.JOptionPane;
/**
 * Ano: 2016
 * @author Clederson Cruz
 * Função: Demonstrar estrutura de decisão Encadeada
 */

public class ExemploEncadeado {
    public static void main(String[] args) {
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade: "));
        
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Pode votar e dirigir");
        } else if (idade >= 16) {
            JOptionPane.showMessageDialog(null, "Pode votar porém não dirigir");
        } else {
            JOptionPane.showMessageDialog(null, "Não pode votar e dirigir");
        }
    }
}
