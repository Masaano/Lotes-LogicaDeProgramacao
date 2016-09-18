/**
* Autor: Clederson Cruz
* Data: 07/08/2016
* Função: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
*/

import javax.swing.JOptionPane;

public class Diferenca {
	public static void main(String[] args) {
		int a, b, diferenca;

		//Recebendo o valor de A e de B
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de A: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de B: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando a diferença
		diferenca = a - b;

		if (diferenca < 0) {
			diferenca *= -1;
		}

		//Exibindo o resultado da diferença do maior pelo menor
		JOptionPane.showMessageDialog(null, "Diferença: " + diferenca, "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
