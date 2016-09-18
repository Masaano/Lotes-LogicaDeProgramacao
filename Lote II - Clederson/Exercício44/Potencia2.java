/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
*/

import javax.swing.JOptionPane;

public class Potencia2 {
	public static void main(String[] args) {
		int base, expo;
		double pote;

		//Entrada
		base = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a base: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		expo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o expoente: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando e exibindo o resultado (se possível calcular)
		if (base == 0) {
			potZero(expo);
		} else {
			pote = potNum(base, expo);
			JOptionPane.showMessageDialog(null, String.format("Resultado: %.4f", pote), "Saída", JOptionPane.PLAIN_MESSAGE);
		}
	}

	//Exbindo o resultado de uma potência envolvendo base zero
	static void potZero(int exp) {
		if (exp >= 1) {
			JOptionPane.showMessageDialog(null, "Resultado: 0", "Saída", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "INDEFINIDO!", "Saída", JOptionPane.WARNING_MESSAGE);
		}
	}

	//Calculando a potência de uma base diferente de zero
	static double potNum(int bas, int exp) {
		double pot = 1;
		int exp2 = exp; //exp2 é uma cópia de exp para comparação

		if (exp < 0) {
			exp2 *= -1;
		}

		for (int i = 1; i <= exp2; i++) {
			pot *= bas;
		}

		if (exp < 0) {
			pot = 1/pot;
		}

		return pot;
	}
}
