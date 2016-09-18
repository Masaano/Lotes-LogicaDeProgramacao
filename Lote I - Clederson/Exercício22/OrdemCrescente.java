/**
* Autor: Clederson Cruz
* Data: 11/08/2016
* Função: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
*/

import javax.swing.JOptionPane;

public class OrdemCrescente {
	public static void main(String[] args) {
		int a, b;

		//Recebendo dois valores inteiros
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor inteiro: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro número inteiro: ", "Entrada", JOptionPane.PLAIN_MESSAGE ));

		//Saída
		if (a >= b)
			JOptionPane.showMessageDialog(null, String.format("Ordem Crescente: %d, %d", b, a), "Mensagem", JOptionPane.PLAIN_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, String.format("Ordem Crescente: %d, %d", a, b), "Mensagem", JOptionPane.PLAIN_MESSAGE);

	}
}
