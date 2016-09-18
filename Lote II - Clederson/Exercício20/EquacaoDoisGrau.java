/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba 3 coeficientes A, B, e C de uma equação do 2o grau da fórmula AX2+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
*/

import javax.swing.JOptionPane;

public class EquacaoDoisGrau {
	public static void main(String[] args) {
		double a, b, c;

		//Entrada de A, B e C
		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de A: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de B: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		c = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de C: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando módulo que verifica a existência de raízes reais
		verificaDelta(a, b, c);
	}

	//Módulo que verifica a existência de raízes reais
	public static void verificaDelta(double a, double b, double c) {
		double delta = Math.pow(b, 2) - 4 * a * c;

		if ((delta >= 0) && (a != 0)) {
			calculaRaiz(a, b, c, delta); //Chamando módulo que calcula as raízes
		} else {
			JOptionPane.showMessageDialog(null, "Essa equação não possui raízes reais", "Saída", JOptionPane.WARNING_MESSAGE);
		}
	}

	//Módulo que calcula e exibe as raízes da equação
	public static void calculaRaiz(double a, double b, double c, double delta) {
		double s1 = (-b + Math.sqrt(delta))/(2*a);
		double s2 = (-b - Math.sqrt(delta))/(2*a);

		JOptionPane.showMessageDialog(null, String.format("Solução real: S = {%.1f, %.1f}", s1, s2), "Saída", JOptionPane.PLAIN_MESSAGE);
	}

}
