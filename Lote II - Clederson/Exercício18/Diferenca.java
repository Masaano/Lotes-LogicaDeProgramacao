/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
*/

import javax.swing.JOptionPane;

public class Diferenca {
	public static void main(String[] args) {
		int n1, n2;

		//Entrada
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro valor: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando módulo que calcula a diferença
		if (n1 > n2) {
			calcDiferenca(n1, n2);
		} else {
			calcDiferenca(n2, n1);
		}
	}

	//Módulo que calcula a diferença e exibe
	public static void calcDiferenca(int n1, int n2) {
		int resul = n1 - n2;
		JOptionPane.showMessageDialog(null, "A diferença é: " + resul, "Saída", JOptionPane.PLAIN_MESSAGE);
	}

}
