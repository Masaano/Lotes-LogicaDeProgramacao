/**
* Função: Criar e coletar um vetor [100] inteiro e exibir:
* a. O maior e o menor valor;
* b. A média dos valores.
* Data: 04/09/2016
*/

import javax.swing.JOptionPane;

public class Vetor100 {
	static int maior = 0, menor = 0;
	static float media = 0.0F;

	public static void main(String[] args) {
		int vetor[] = new int[100];

		//Carregando o vetor
		vetor = carregaVetor(vetor);

		//Calculando a média e achando o maior e menor valor
		calculaMediaMaiorMenor(vetor);

		//Exibindo o resultado
		JOptionPane.showMessageDialog(null, String.format("Média dos valores: %.1f\nMaior valor: %d\nMenor valor: %d", media, maior, menor), "Saída", JOptionPane.PLAIN_MESSAGE);
	}

	//Carregando o vetor
	static int[] carregaVetor(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Informe o %d valor: ", i+1), "Entrada", JOptionPane.PLAIN_MESSAGE));
		}

		return vet;
	}

	//Cálculo da média de valores, maior e menor valor
	static void calculaMediaMaiorMenor(int vet[]) {
		for (int i = 0; i < vet.length; i++) {

			if (i == 0) {
				maior = vet[i];
				menor = vet[i];
			}

			if (vet[i] > maior) {
				maior = vet[i];
			}
			if (vet[i] < menor) {
				menor = vet[i];
			}

			media += vet[i];
		}
		media /= vet.length;
	}
}
