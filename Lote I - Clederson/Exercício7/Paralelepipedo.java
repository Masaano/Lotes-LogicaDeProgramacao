/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
*/

import javax.swing.JOptionPane;

public class Paralelepipedo {
	public static void main(String[] args) {
		float x, y, z, vol;

		//Recebendo as medidas
		x = Float.parseFloat(JOptionPane.showInputDialog(null, "Comprimento: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		y = Float.parseFloat(JOptionPane.showInputDialog(null, "Largura: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		z = Float.parseFloat(JOptionPane.showInputDialog(null, "Altura: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando o volume
		vol = x * y * z;

		//Exibindo o volume
		JOptionPane.showMessageDialog(null, String.format("Volume: %.2f", vol), "Mensagem", JOptionPane.PLAIN_MESSAGE);

	}
}
