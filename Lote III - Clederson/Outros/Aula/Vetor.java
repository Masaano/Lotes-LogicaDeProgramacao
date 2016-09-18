/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores;
import javax.swing.JOptionPane;
/**
 *
 * @author Clederson Cruz
 */
public class Vetor {
    public static void main(String[] args) {
        int opc;
        int vetor[] = new int[4];
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Carrega\n2-Mostra\n3-Ordena\n9-Sair"));
        
            switch(opc) {
                case 1:
                    vetor = carregaVetor(vetor);
                    break;
                case 2:
                    exibeVetor(vetor);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                    break;
            }
        } while(opc != 9);
    }
    
    static int[] carregaVetor(int[] vet) {
        for (int i = 0; i < 4; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor: "));
        }
        
        return vet;
    }
    
    static void exibeVetor(int[] vet) {
        for (int i = 0; i < 4; i++) {
            JOptionPane.showMessageDialog(null, String.format("vetor[%d] = %d", i+1, vet[i]));
        }
    }
}
