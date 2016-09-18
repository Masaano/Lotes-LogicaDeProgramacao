/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos.
*/

import java.util.Scanner;

public class DeUmACem {
	public static void main(String[] args) {
		calculaMaiorMenor();
	}

	static void calculaMaiorMenor() {
		int maior = 0, menor = 0, n, i = 1;
		Scanner leia = new Scanner(System.in);

		while (i <= 100) {
			System.out.printf("Informe o %dº valor: ", i);
			n = leia.nextInt();

			if (n > 0) {
				if (i == 1) {
					maior = n;
					menor = n;
				}
	
				if (n > maior) {
					maior = n;
				}
	
				if (n < menor) {
					menor = n;
				}
				i++;
			} else {
				System.out.println("Informe apenas valores positivos!");
			} 
			
		}

		leia.close();
		System.out.println("O maior é: " + maior);
		System.out.println("O menor é: " + menor);
	}
}
