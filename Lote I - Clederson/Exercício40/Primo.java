/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 */

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		int a, b;
		boolean primo = true;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe o valor de A: ");
		a = leia.nextInt();

		System.out.print("Informe o valor de B: ");
		b = leia.nextInt();

		leia.close();
		if (b < a) {
			a += b;
			b = a - b;
			a -= b;
		}

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
				System.out.print(" " + i);
			}
		}
		System.out.println("\n");
	}
}
