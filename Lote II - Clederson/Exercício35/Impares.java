/**
 * Data: 28/08/2016
 * Autor: Clederson Cruz
 * Função: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
 * mostre o resultado da somatória dos números ímpares entre esses valores.
 */

import javax.swing.JOptionPane;

public class Impares{
	public static void main(String[] args) {
		int n1, n2, sum;

		//Recebendo 2 números inteiros
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor numérico qualquer: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Agora informe outro: ", "Entrada", JOptionPane.PLAIN_MESSAGE));


		//Calculando o somatório
		sum = somatorio(n);

		//Saída
		JOptionPane.showMessageDialog(null, "O somatório dos números ímpares é: " + sum, "Saída", JOptionPane.PLAIN_MESSAGE);
	}

	//Módulo para calcular o sommatório dos números ímpares
	static int somatorio(int n) {
		int sum = 0;

		if (n1 > n2) {
			while (n2 <= n1) {
				if (n2 % 2 != 0) {
					sum += n2;
				}
				n2 += 1;
			}
		} else if (n1 < n2) {
			while (n1 <= n2) {
				if (n1 % 2 != 0) {
					sum += n1;
				}
				n1 += 1;
			}
		}

	return sum;
	}

}
