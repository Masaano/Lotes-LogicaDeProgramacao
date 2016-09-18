/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos.
 */

import java.util.Scanner;

public class UmACem {
	public static void main(String[] args) {
		int n, ma = 0, me = 0, i = 1;
		Scanner leia = new Scanner(System.in);

		while (i <= 5) {
			do {
				System.out.print("Informe um valor inteiro positivo: ");
				n = leia.nextInt();

				if (n <= 0) {
					System.out.println("SOMENTE VALORES POSITIVOS");
				}

			} while(n <= 0);

			if (i == 1) {
				ma = n;
				me = n;
			}

			if (n >= ma) {
				ma = n;
			} else if (n < me) {
				me = n;
			}

			i++;
		}
		leia.close();
		System.out.println("O menor valor é " + me + "\nO maior valor é " + ma);
	}

}
