/**
* Função: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:
* [01] [  ] [  ] [  ]
* [  ] [04] [  ] [  ]
* [  ] [  ] [16] [  ]
* [  ] [  ] [  ] [64]
* Autor: Clederson Cruz
* Data: 07/09/2016
*/

import java.util.Scanner;

public class MatrizDiagonal {
	public static void main(String[] args) {
		int matriz[][] = new int[4][4];

		//Carrega a matriz
		matriz = carrega(matriz);

		//Exibindo a matriz
		exibe(matriz);
	}

	//Módulo para carregar a matriz
	static int[][] carrega(int mat[][]) {
		int x = 1;
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					mat[i][j] = x;
				} else {
					System.out.print("Informe um valor: ");
					mat[i][j] = leia.nextInt();
				}
			}
			x *= 4;
		}
		return mat;
	}

	//Módulo para exibir
	static void exibe(int m[][]) {
		System.out.print("Exibindo a matriz:\n\n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%d\t", m[i][j]);
			}
			System.out.print("\n");
		}

	}
}
