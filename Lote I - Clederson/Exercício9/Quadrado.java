/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
*/

import javax.swing.JOptionPane;

public class Quadrado {
	public static void main(String[] args) {
		int x, y, soma;

		//Entrada, recebendo X e Y
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de X: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		y = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de Y: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando o Quadrado
		soma = (x * x) + (y * y);

		//Exibindo o resultado
		JOptionPane.showMessageDialog(null, "Quadrado: " + soma, "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}

