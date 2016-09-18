/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
*/

import javax.swing.JOptionPane;

public class CalcularPrimos {
	public static void main(String[] args) {
		int a, b;

		//Entrada
		do {
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de A: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de B: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

			if (a <= 0 || b <= 0) {
				JOptionPane.showMessageDialog(null, "INFORME APENAS VALORES POSITIVOS!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}

		} while(a <= 0 || b <= 0);

		//Trocando valores em caso de B menor que A
		if (b < a) {
			a += b;
			b = a - b;
			a -= b;
		}

		//Passando maior e menor valor
		primos(a, b);
	}

	//Calculando e exibindo se o número é primo
	static void primos(int a, int b) {
		boolean primo = true;

		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i % j == 0) && (j != 1) && (i != j)) {
					primo = false;
					break;
				} else {
					primo = true;
				}
			}

			if ((primo == true) && (i != 1)) {
				JOptionPane.showMessageDialog(null, String.format("%d", i), "Saída", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
