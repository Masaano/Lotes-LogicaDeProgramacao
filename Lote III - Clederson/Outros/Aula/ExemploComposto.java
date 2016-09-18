package prj_1108;

import javax.swing.JOptionPane;
/**
 * Ano: 2016
 * @author Clederson Cruz
 * Função: Demonstrar estrutura de decisão composto
 */

public class ExemploComposto {
    public static void main(String[] args) {
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade: "));
        
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "De maior");
        } else {
            JOptionPane.showMessageDialog(null, "De menor");
        }
    }
}
