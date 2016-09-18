/**
 * @Autor: Clederson Cruz
 * Exemplo de criação de variáveis
 * Objetivo: Somar dois números a partir de uma entrada e mostrar um resultado
 * Data de Compilação: 04/08/2016
 */
import javax.swing.JOptionPane;

public class Exemplo01 {
    public static void main(String[] args) {
        //Declaração de variáveis
        int a, b, c;
        
        //Entrada de dados
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B: "));
        
        //Processamento
        c = a + b;
        
        //Saída de dados
        System.out.println("A soma dos dois valores é digitados é: " + c);
       // System.exit(0);
    }
}
