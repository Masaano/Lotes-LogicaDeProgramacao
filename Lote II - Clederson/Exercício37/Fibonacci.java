/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
*/

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n, f;
		Scanner leia = new Scanner(System.in);

		//Entrada
		System.out.print("Informe um valor: ");
		n = leia.nextInt();

		leia.close();

		//Chamando a função
		f = fibo(n);

		//Exibindo o resultado
		System.out.println("\nO resultado do Fibonacci é: " + f);
	}

	//Módulo que calcula e exibe a série
	static int fibo(int n) {
		int f = 1, temp = 0;

		for (int i = 1; i <= n; i++) {
			f += temp;
			temp = f - temp;
			System.out.print(" " + f);
		}

		return f;
	}
}
