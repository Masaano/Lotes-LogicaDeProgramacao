/**
* Função: Criar e coletar em um vetor [30] real e calcular e exibir:
* a. A média do grupo;
* b. A quantidade de notas acima do grupo;
* c. As posições dos valores abaixo da média do grupo.
* Autor: Clederson Cruz
* Data: 04/09/2016
*/

import java.util.Scanner;

public class VetorReal {
	static int qtdAcimaMedia = 0;

	public static void main(String[] args) {
		float vetor[]  = new float[30];
		float media;

		//Carrega Vetor
		vetor = carregaVetor(vetor);

		//Calculando a média do grupo
		media = calculaMedia(vetor);

		//Exibindo os dados
		exibeResultado(vetor, media);
	}

	//Carregando o vetor
	static float[] carregaVetor(float vet[]) {
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("\nInforme a %d média: ", i+1);
			vet[i] = leia.nextFloat();
		}

		return vet;
	}

	//Calculando a média do grupo e quantidade acima da média
	static float calculaMedia(float vet[]) {
		float media = 0.0F;

		for (int i = 0; i < vet.length; i++) {
			media += vet[i];
		}

		media /= vet.length;

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > media) {
				qtdAcimaMedia++;
			}
		}

		return media;
	}

	static void exibeResultado(float vet[], float media) {
		System.out.printf("Média do grupo: %.1f\n", media);
		System.out.println("Quantidade de notas acima da média do grupo: " + qtdAcimaMedia);
		System.out.println("Posições das notas abaixo da média do grupo: ");
		for (int i = 0; i < vet.length; i++) {

			if (vet[i] < media)
				System.out.printf("Posição[%d]\t Nota: %.1f\n", i, vet[i]);
		}
	}
}
