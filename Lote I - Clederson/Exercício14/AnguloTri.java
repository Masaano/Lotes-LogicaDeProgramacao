/**
* Autor: Clederson Cruz
* Data: 07/08/2016
* Função: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
*/

import javax.swing.JOptionPane;

public class AnguloTri {
	public static void main(String[] args) {
		float ang1, ang2, ang3;

		//Recebendo os ângulos
		ang1 = Float.parseFloat(JOptionPane.showInputDialog(null, "1º ângulo: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		ang2 = Float.parseFloat(JOptionPane.showInputDialog(null, "2º ângulo: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando o terceiro ângulo
		ang3 = 180F - ang1 - ang2;

		//Exibindo na tela
		JOptionPane.showMessageDialog(null, String.format("Terceiro ângulo: %.1f", ang3), "Mensagem", JOptionPane.PLAIN_MESSAGE);

	}
}
