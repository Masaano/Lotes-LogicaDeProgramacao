/**
* Função: A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
* Autor: Clederson Cruz
* Data: 07/09/2016
**/

import java.util.Scanner;

public class PesquisaBinaria {
	public static void main(String[] args) {
		int vetor[] = new int[20];

		//Carregando o vetor
		vetor = carregaVetor(vetor);

		//Ordenando vetor
		vetor = ordenaVetor(vetor);

		//Exibindo o vetor ordenado
		exibeVetor(vetor);

		//Pesquisa Binária
		pesquisaVetor(vetor);
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

	//Módulo para pesquisar um valor (binariamente) e exibir o resultado
	static void pesquisaVetor(int vet[]) {
		Scanner leia = new Scanner(System.in);
		int valor, inicio, meio, fim; //Valor, inicio do vetor, meio e fim
		boolean achou = false; //Dado lógico se encontrou o valor ou não

		System.out.print("Informe um valor a ser buscado no vetor: ");
		valor = leia.nextInt();

		inicio = 0;
		meio = 0;
		fim = vet.length;

		//Realizando a busca
		while (achou == false && inicio != fim) {
			meio = (inicio + fim)/2;

			//Se o valor procurado estiver no vetor na posição meio, então encontrou
			if (valor == vet[meio]) {
				achou = true;
			}
			//Caso o valor seja > vet[meio]
			else if (valor > vet[meio]) {
				inicio = meio;
			}
			//Caso o valor seja < vet[meio]
			else {
				fim = meio;
			}
		}

		//Exibindo o resultado
		if (achou == true) {
			System.out.printf("O valor %d foi encontrado na posição %d do vetor.\n", valor, meio);
		} else {
			System.out.printf("O valor %d não foi encontrado no vetor.\n", valor);
		}
	}
}
