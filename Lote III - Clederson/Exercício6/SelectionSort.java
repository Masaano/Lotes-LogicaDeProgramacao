/**
* Função: Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
* Autor: Clederson Cruz
* Data: 07/09/2016
**/

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		int vetor[] = new int[20];

		//Carregando o vetor
		vetor = carregaVetor(vetor);

		//Ordenando vetor
		vetor = ordenaVetor(vetor);

		//Exibe o vetor
		exibeVetor(vetor);
	}

	//Módulo para carregar o vetor
	static int[] carregaVetor(int vet[]) {
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Informe o %d valor: ", i+1);
			vet[i] = leia.nextInt();
		}

		return vet;
	}

	//Módulo para ordenar o vetor
	static int[] ordenaVetor(int vet[]) {
		int aux;

		for (int i = 0; i < vet.length - 1; i++) {
			for (int j = i+1; j <= vet.length - 1; j++) {
				if (vet[i] > vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}

		return vet;
	}

	//Módulo para exibir o vetor
	static void exibeVetor(int vet[]) {
		for(int i = 0; i < vet.length; i++) {
			System.out.printf("vetor[%d] = %d\n", i, vet[i]);
		}
	}
}
