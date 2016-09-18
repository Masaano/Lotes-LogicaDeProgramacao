/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
*/

import java.util.Scanner;

public class SerieFatorial {
	public static void main(String[] args) {
		int n;
		double s;
		Scanner leia = new Scanner(System.in);

		//Entrada
		do {
			System.out.print("Informe um valor inteiro positivo: ");
			n = leia.nextInt();

			if (n <= 0)
				System.out.print("VALOR INVÁLIDO!\n");
		}while(n <= 0);

		leia.close();

		//Chamando a série
		s = calcSerie(n);

		//Saída
		System.out.printf("\nO resultado da série é: %.4f\n", s);
	}

	//Módulo que calcula a série
	static double calcSerie(int n) {
		double serie = 1;

		System.out.print(1);
		for (int i = 1; i <= n; i++) {
			System.out.printf(" + (1/%.0f)", fat(i));
			serie += (1/fat(i));
		}

		return serie;
	}

	//Módulo que calcula o fatorial
	static double fat(int n) {
		double f = n;

		if (n == 0) {
			f = 1;
		} else {
			for (int i = 1; i < n; i++) {
				f *= (n - i);
			}
		}

		return f;
	}
}
