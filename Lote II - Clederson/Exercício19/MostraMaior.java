/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/

import javax.swing.JOptionPane;

public class MostraMaior {
	public static void main(String[] args) {
		double num1, num2;

		//Entrada
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor real: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe outro valor real: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chama módulo que exibe maior número
		exibeMaiorNum(num1, num2);
	}

	//Módulo que exibe maior número
	public static void exibeMaiorNum(double n1, double n2) {
		if (n1 > n2) {
			JOptionPane.showMessageDialog(null, "O maior é: " + n1, "Saída", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "O maior é: " + n2, "Saída", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
