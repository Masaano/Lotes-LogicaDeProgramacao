/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/

import javax.swing.JOptionPane;

public class Diferenca {
	public static void main(String[] args) {
		double a, b, diferenca;

		//Recebendo A e B
		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de A: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de B: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando a diferença
		diferenca = Math.abs(a - b);

		//Saída
		JOptionPane.showMessageDialog(null, String.format("Diferença: %.1f", diferenca), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
