/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba os coeficientes A, B e C de uma equação do 2o grau (AX2+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possui duas raízes).
*/

import javax.swing.JOptionPane;

public class RaizSGrau {
	public static void main(String[] args) {
		int a, b, c;
		double x1, x2, delta;

		//Entrada de A, B e C
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de A: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de B: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de C: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando o Delta
		delta = (double) (Math.pow(b,2) - 4 * a * c);

		//Calculando as raízes reais
		x1 = (-b + Math.sqrt(delta))/(2 * a);
		x2 = (-b - Math.sqrt(delta))/(2 * a);

		//Saída
		JOptionPane.showMessageDialog(null, String.format("As raízes reais são:\n%.1f\n%.1f", x1, x2), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
