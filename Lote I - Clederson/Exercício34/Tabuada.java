/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Receba um número. Calcule e mostre os resultados da tabuada desse número.
 */

import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String[] args) {
		int n;
		String tabu = "";

		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		for (int i = 0; i <= 10; i++){
			tabu += n + " x " + i + " = " + (n * i) + "\n";
		}

		JOptionPane.showMessageDialog(null, tabu, "Saída", JOptionPane.PLAIN_MESSAGE);
	}
}
