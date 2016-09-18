/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplofatorial;
import javax.swing.JOptionPane;
/**
 * Data: 01/09/2016
 * @author Clederson Cruz
 * Função: calcular o fatorial de um número recursivamente
 */
public class ExemploFatorial {

    public static void main(String[] args) {
        int n;
        
        //Entrada
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número natural: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
        
            if (n < 0)
                JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO", "ERRO", JOptionPane.ERROR_MESSAGE);
        } while(n < 0);
        
        //Cálculo e Exibição
        
         JOptionPane.showMessageDialog(null, String.format("%d! = %d", n, fFatorial(n)), "Saída", JOptionPane.PLAIN_MESSAGE);
        
    }
    
    static int fFatorial(int x) {
        if (x == 0)
            return 1;
        else
            return x * fFatorial(x - 1);
    }
    
    
}