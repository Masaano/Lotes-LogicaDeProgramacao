/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;
import javax.swing.JOptionPane;
/**
 *
 * @author Clederson Cruz
 * Exibir a soma dos 100 nºs positivos
 */
public class Ex1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "A soma é: " + somatorio(1), "Exercício 1", JOptionPane.PLAIN_MESSAGE);
    }
    
    //somatóorio
    static int somatorio(int x) {
        if (x == 100)
            return x;
        else
            return x + somatorio(x + 1);
    }
}
