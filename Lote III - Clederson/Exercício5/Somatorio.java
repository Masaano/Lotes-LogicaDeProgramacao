/**
* Função: Criar e coletar valores em um vetor[20] inteiro. Calcule e exiba, segundo: somatório de i = 1 até 10 (A_[1] - A_[21-1])
* Autor: Clederson Cruz
* Data: 07/09/2016
*/
import java.util.Scanner;

public class Somatorio {
	public static void main(String[] args) {
		int vetor[] = new int[20];
		int sum;

		//Carregando o vetor
		vetor = carregaVetor(vetor);

		//Calculando o somatório
		sum = somatorio(vetor);

		//Exibindo o resultado
		System.out.println("O somatório é: " + sum);
	}

	//Módulo para carregar o vetor
	static int[] carregaVetor(int vet[]) {
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("%d/20 informe um valor: ", i+1);
			vet[i] = leia.nextInt();
		}

		return vet;
	}

	//Módulo para calcular o somatório
	static int somatorio(int vet[]) {
		int sum = 0;

		for (int i = 0; i < vet.length; i++) {
			sum += vet[i] - vet[19 - i];
		}

		return sum;
	}
}
