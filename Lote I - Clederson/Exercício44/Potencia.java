/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 */

import javax.swing.JOptionPane;

public class Potencia {
	public static void main(String[] args) {

		int base, expo;
		double pote;

		base = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a base: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		expo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o expoente: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		pote = Math.pow(base, expo);
		JOptionPane.showMessageDialog(null, String.format("Potência: %.0f ", pote), "Saída", JOptionPane.PLAIN_MESSAGE);
	}
}
