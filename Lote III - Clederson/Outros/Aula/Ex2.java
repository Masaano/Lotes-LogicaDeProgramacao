package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Clederson Cruz
 * Data: 01/09/2016 
 * Função: Coletar um nº entre 10 e 50 calcule: 1 + 3 + 5 + 7 + ...
 */
public class Ex2 {
    public static void main(String[] args) {
        int n, soma;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "A soma é: ", "Exercício 1", JOptionPane.PLAIN_MESSAGE));
        
            if (n < 10 || n > 50) {
                JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO! ", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } while(n < 10 || n > 50);
        
        soma = somatorio(n, 1);
        
    }
    
    //somatóorio
    static int somatorio(int x, int val) {
      
    }
}
