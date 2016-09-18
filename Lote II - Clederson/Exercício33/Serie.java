/**
 * Data: 28/08/2016
 * Autor: Clederson Cruz
 * Função: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 */

import java.util.Scanner;

public class Serie {
	public static void main(String[] args) {
		int n; //Número
		double s; //Série
		Scanner leia = new Scanner(System.in);

		//Recebendo um valor qualquer do tipo inteiro
		do {
		System.out.print("Informe um valor inteiro positivo: ");
		n = leia.nextInt();

			if (n <= 0)
				System.out.println("Valor inválido!");
		} while(n <= 0);

		leia.close();

		//Calculando a Série
		s = calcSerie(n);

		//Exibindo Série
		System.out.printf(" = %.3f\n", s);
	}

	static double calcSerie(int n) {
		double s = 1;
		System.out.printf("%.0f", s);

		for (int i = 2; i <= n; i++) {
			System.out.printf(" + (1/%d)", i);
			s += (double) 1/i;
		}

		return s;
	}
}
