/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
 * mostre o resultado da somatória dos números ímpares entre esses valores.
 */

import java.util.Scanner;

public class Impares{
	public static void main(String[] args) {
		int n1, n2, sum = 0;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe um valor numérico qualquer: ");
		n1 = leia.nextInt();

		System.out.print("Agora informe outro: ");
		n2 = leia.nextInt();

		leia.close();
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

		System.out.println("O somatório dos números ímpares é: " + sum);
	}

}
