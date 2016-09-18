/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
*/

import javax.swing.JOptionPane;

public class AreaQuadrado {
	public static void main(String[] args) {
		float lado, area;

		//Entrada
		lado = Float.parseFloat(JOptionPane.showInputDialog(null, "Largura do lado do quadrado: ", "Medida do Lado", JOptionPane.PLAIN_MESSAGE));

		//Processamento
		area = lado * lado;

		//Saída
		JOptionPane.showMessageDialog(null, "A área mede: " + area, "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
