/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
*/

import javax.swing.JOptionPane;

public class Circun {
	public static void main(String[] args) {
		double cir, raio;

		//Recebendo o valor do raio
		raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do raio: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Cálculo da Circunferência
		cir = 2 * Math.PI * raio;

		//Saída
		JOptionPane.showMessageDialog(null, String.format("Circonferência mede %.1f", cir), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
