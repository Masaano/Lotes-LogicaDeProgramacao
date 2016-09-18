/**
* Autor: Clederson Cruz
* Data: 11/08/2016
* Função: Receba um valor inteiro. Verifica se ele é divisível por 2 e 3.
*/


import javax.swing.JOptionPane;

public class Divisivel2e3 {
	public static void main(String[] args) {
		int n;

		//Recebendo o número
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Exibindo a mensagem
		if ((n % 2 == 0) && (n % 3 == 0)) {
			JOptionPane.showMessageDialog(null, String.format("O número %d é divisível por 2 e 3", n), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, String.format("O número %d não é divisível por 2 e 3", n), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
