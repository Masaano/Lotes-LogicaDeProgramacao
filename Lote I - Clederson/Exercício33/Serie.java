/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 */

import java.util.Scanner;

public class Serie {
	public static void main(String[] args) {
		int n;
		double v;

		Scanner leia = new Scanner(System.in);

		do {
		System.out.print("Informe um valor inteiro positivo: ");
		n = leia.nextInt();

			if (n <= 0)
				System.out.println("Valor inválido!");
		} while(n <= 0);

		leia.close();

		v = 1;
		System.out.printf("%.0f", v);

		for (int i = 2; i <= n; i++) {
			System.out.printf(" + (1/%d)", i);
			v += (double) 1/i;
		}
		System.out.printf(" = %.3f\n", v);
	}
}
