/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
*/

import javax.swing.JOptionPane;

public class AreaTriangulo {
	public static void main(String[] args) {
		float area, base, altura;

		//Recebendo a base e altura
		base = Float.parseFloat(JOptionPane.showInputDialog(null, "Base do Triângulo: ", "Cálculo de Área", JOptionPane.PLAIN_MESSAGE));
		altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Altura do Triângulo: ", "Cálculo de Área", JOptionPane.PLAIN_MESSAGE));

		//Cálculo
		area = (base * altura)/2;

		//Saída
		JOptionPane.showMessageDialog(null, String.format("Área do Triângulo: %.2f", area), "Área", JOptionPane.PLAIN_MESSAGE);
	}

}
