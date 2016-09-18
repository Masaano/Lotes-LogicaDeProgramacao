/**
* Função: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
* a. A quantidade de cada produto vendido no mês;
* b. A quantidade de produtos vendidos por semana;
* c. O total de produtos vendidos no mês.
* Autor: Clederson Cruz
* Data: 07/09/2016
*/

import java.util.Scanner;

public class ProdutosVendidos {
	public static void main(String[] args) {
		int matriz[][] = new int[4][3];
		Scanner leia = new Scanner(System.in);

		//Recebendo os produtos
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Informe a quantidade de produtos: ");
				matriz[i][j] = leia.nextInt();
			}
		}
		leia.close();

		//Calculando
		calcula(matriz);
	}

	//Módulo para calcular q quantidade
	static void calcula(int mat[][]) {
		int qtdse[] = {0, 0, 0, 0};
		int total = 0;

		System.out.println("Quantidade de cada produto vendido no mês: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(mat[i][j]);

				qtdse[i] += mat[i][j];
				total += mat[i][j];
			}
		}

		//Exibindo
		exibeQtd(qtdse, total);
	}

	//Módulo para exibir
	static void exibeQtd(int qtdse[], int total) {
		System.out.println("Quantidade de produtos vendidos por semana: ");
		for (int i = 0; i < 4; i++) {
			System.out.println(qtdse[i]);
		}

		System.out.println("Total de produtos vendidos no mês: " + total);
	}
}
