/**
 * Autor Clederson Cruz
 * Data: 21/08/2016
 * Função: Receba um número inteiro. Calcule e mostre o seu fatorial.
 */

import javax.swing.JOptionPane;

public class Fatorial {
	public static void main(String[] args) {
		int n, fat = 1;

		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor natural: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

			if (n < 0)
				JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!", "ERRO", JOptionPane.ERROR_MESSAGE);
		} while(n < 0);

		for (int i = 0; i < (n - 1); i++) {
			fat *= (n - i);
		}

		JOptionPane.showMessageDialog(null, String.format("%d! = %d", n, fat), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
