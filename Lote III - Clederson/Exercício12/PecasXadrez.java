/**
* Função: Carregar códigos das peças em um tabuleiro de xadrez, onde:
* Código: | 1 |   2   |    3   |    4   |    5   |  6  |  7  |
* Peça:	 Peão | Torre |  Bispo | Cavalo | Rainha | Rei | Vazio
* Calcular e mostrar a soma das peças do tabuleiro. Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças
* Autor: Clederson Cruz
* Data: 07/09/2016
*/

import java.util.Scanner;

public class PecasXadrez {
	public static void main(String[] args) {
		int pecas;

		//Carregando as peças
		pecas = preencheTabuleiro();

		//Exibindo a quantidade de peças
		System.out.println("A quantidade de peças é: " + pecas);
	}

	//Módulo para preencher o tabuleiro
	static int preencheTabuleiro() {
		int pecas, i = 0, j = 0;
		int tabu[][] = new int[8][8];
		Scanner leia = new Scanner(System.in);

		//Preenchendo o tabuleiro
		while(i < 8) {
			System.out.printf("\n\n%d ciclo de 8\n", i+1);
			while(j < 8) {
				System.out.print("\n1 Peão\n2 Torre\n3 Bispo\n4 Cavalo\n5 Rainha\n6 Rei\n7 Vazio\n");
				tabu[i][j] = leia.nextInt();

				if (tabu[i][j] < 1 || tabu[i][j] > 7) {
					System.out.println("\nVALOR INVÁLIDO!\n");
				} else {
					j++;
				}
			}
			j = 0;
			i++;
		}

		//Calculando a qtd de peças e retornando peças para o progrmama principal
		pecas = calculaPecas(tabu);
		return pecas;
	}

	//Módulo para contabilizar a quantidade de peças
	static int calculaPecas(int tabu[][]) {
		int qtdpecas = 0;
		int casas[] = new int[8];

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				casas[tabu[i][j]]++; //Sacada para armazenar as peças em um vetor
			}
		}

		//Contabilizando-as
		for (int i = 0; i <= 6; i++) {
			qtdpecas += casas[i];
		}

		return qtdpecas;
	}
}
