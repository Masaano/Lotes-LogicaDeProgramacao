/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba 3 valores obrigatoriamente em ordem crescente e um 4o valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
*/

import javax.swing.JOptionPane;

public class OrdemCrescente4 {
	public static void main(String[] args) {
		double n1, n2, n3, n4;

		//Entrada
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor maior: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe outro valor maior: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe qualquer valor: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando módulo que exibe os valores informados de maneira ordenada
		ordenaValores(n1, n2, n3, n4);
	}

	//Módulo que exibe os valores informados de maneira ordenada
	public static void ordenaValores(double n1, double n2, double n3, double n4) {
		if (n4 >= n3) {
			JOptionPane.showMessageDialog(null, String.format("%.2f %.2f %.2f %.2f", n1, n2, n3, n4), "Saída", JOptionPane.PLAIN_MESSAGE);
		} else if (n4 >= n2 && n4 < n3) {
			JOptionPane.showMessageDialog(null, String.format("%.2f %.2f %.2f %.2f\n", n1, n2, n4, n3), "Saída", JOptionPane.PLAIN_MESSAGE);
		} else if (n4 >= n1 && n4 < n2) {
			JOptionPane.showMessageDialog(null, String.format("%.2f %.2f %.2f %.2f\n", n1, n4, n2, n3), "Saída", JOptionPane.PLAIN_MESSAGE);
		} else if (n4 < n1) {
			JOptionPane.showMessageDialog(null, String.format("%.2f %.2f %.2f %.2f\n", n4, n1, n2, n3), "Saída", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
