/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
*/

import javax.swing.JOptionPane;

public class Divisivel2e3 {
	public static void main(String[] args) {
		int x;

		//Recebendo o valor
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando módulo que verifica se o valor é divisível por 3 e 2
		divisao(x);
	}

	//Módulo que realiza a verificação
	public static void divisao(int n) {
		if ((n % 2 == 0) && (n % 3 == 0)) {
			JOptionPane.showMessageDialog(null, String.format("O número %d é divisível por 2 e 3.", n), "Saída", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, String.format("O número %d não é divisível por 2 e 3.", n), "Saída", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
