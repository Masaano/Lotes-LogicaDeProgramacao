/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função:Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
*/

import javax.swing.JOptionPane;

public class Hipotenusa {
	public static void main(String[] args) {
		double cat1, cat2, hipo;

		//Recebendo o valor dos catetos
		cat1 = Double.parseDouble(JOptionPane.showInputDialog(null, "1º cateto: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		cat2 = Double.parseDouble(JOptionPane.showInputDialog(null, "2º cateto: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando a hipotenusa
		hipo = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

		//Exibindo a hipotenusa
		JOptionPane.showMessageDialog(null, String.format("Hipotenusa: %.1f", hipo), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}

}
