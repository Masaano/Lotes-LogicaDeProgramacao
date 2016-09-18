/**
* Autor: Clederson Cruz
* Data: 11/08/2016
* Função:Receba 3 valores obrigatoriamente em ordem crescente e um 4o valor não necessariamente em ordem. Mostre os 4 números em ordem crescente. 
*/

import javax.swing.JOptionPane;

public class OrdemCrescente4 {
	public static void main(String[] args) {
		float a, b, c, d;

		//Entrada
		a = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um número: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		b = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um número maior que o anterior: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		c = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um número maior que o anterior mais uma vez: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		d = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe qualquer número: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Exibindo em ordem crescente
		if (d > c) {
			JOptionPane.showMessageDialog(null, String.format("Em Ordem Crescente: %.1f; %.1f; %.1f; %.1f", a, b, c, d), "Mensagem", JOptionPane.PLAIN_MESSAGE);
		} else if (d > b) {
			JOptionPane.showMessageDialog(null, String.format("Em Ordem Crescente: %.1f; %.1f; %.1f; %.1f", a, b, d, c), "Mensagem", JOptionPane.PLAIN_MESSAGE);
		} else if (d > a) {
			JOptionPane.showMessageDialog(null, String.format("Em Ordem Crescente: %.1f; %.1f; %.1f; %.1f", a, d, b, c), "Mensagem", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, String.format("Em Ordem Crescente: %.1f; %.1f; %.1f; %.1f", d, a, c, d), "Mensagem", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
