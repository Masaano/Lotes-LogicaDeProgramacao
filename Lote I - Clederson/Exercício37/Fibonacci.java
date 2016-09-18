/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 */

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n, f, temp;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe um valor qualquer: ");
		n = leia.nextInt();
		leia.close();
		f = 1;
		temp = 0;

		if (n >= 1) {
			System.out.print(temp);
			for (int i = 1; i <= n; i++) {
				f += temp;
				temp = f - temp;
				System.out.print(" " + f);
			}
			System.out.print("\n");
		} else {
			System.out.println("ERRO!");
		}
	}
}
