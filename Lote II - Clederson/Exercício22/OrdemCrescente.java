/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
*/

import javax.swing.JOptionPane;

public class OrdemCrescente {
	public static void main(String[] args) {
		int n1, n2;

		//Recebendo valores
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor inteiro: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um outro: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando módulo que exibe em ordem
		exibeEmOrdem(n1, n2);
	}

	//Módulo que exibe em ordem
	public static void exibeEmOrdem(int n1, int n2) {
		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, String.format("%d %d", n2, n1), "Saída", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, String.format("%d %d", n1, n2), "Saída", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
