/**
* Autor: Clederson Cruz
* Data: 07/08/2016
* Função: Receba 2 valores reais. Calcule e mostre o maior deles.
*/

import javax.swing.JOptionPane;

public class MaiorReal {
	public static void main(String[] args) {
		double a, b;

		//Recebendo os valores reais
		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de A: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de B: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Exibindo o maior
		if (a > b) {
			JOptionPane.showMessageDialog(null, "O maior é " + a, "Mensagem", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "O maior é " + b, "Mensagem", JOptionPane.PLAIN_MESSAGE);
		}

		
	}
}
