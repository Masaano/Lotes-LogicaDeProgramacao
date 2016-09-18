/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 */

import java.util.Scanner;

public class SerieFatorial {
	public static void main(String[] args) {
		int temp2, temp, fat, n;
		double serie = 1;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe um valor qualquer: ");
		n = leia.nextInt();

		temp2 = 1;
		leia.close();
		System.out.print(temp2);

		while (temp2 < n) {
			temp2 += 1;
			temp = temp2;
			fat = temp2;

			while (temp > 1) {
				temp -= 1;
				fat *= temp;
			}
			System.out.printf(" + (1/%d)", fat);
			serie += (double) 1/fat;
		}
		System.out.printf(" = %.3f\n", serie);
	}
}
