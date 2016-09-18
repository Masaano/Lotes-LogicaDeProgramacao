/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
*/

import javax.swing.JOptionPane;

public class Temperatura {
	public static void main(String[] args) {
		float c, f;

		//Recebendo a temperatura em ºC
		c = Float.parseFloat(JOptionPane.showInputDialog(null, "Temperatura em ºC: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Conversão
		f = (9F * c + 160)/5;

		//Saída
		JOptionPane.showMessageDialog(null, String.format("Temperatura em ºF: %.1f", f), "Mensagem", JOptionPane.PLAIN_MESSAGE);

	}
}

