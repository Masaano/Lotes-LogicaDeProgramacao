/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba os valores em x e y. Efetue a troca de seus valores e mostre seus conteúdos.
*/

import javax.swing.JOptionPane;

public class Troca {
	public static void main(String[] args) {
		int x, y;

		//Recebendo X e Y
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor X: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		y = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de Y: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Efetuando a Troca
		x += y;
		y = x - y;
		x -= y;

		//Saída
		JOptionPane.showMessageDialog(null, String.format("X = %d\nY = %d", x, y), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}

