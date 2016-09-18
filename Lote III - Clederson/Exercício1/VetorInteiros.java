/**
* Função: Criar e coletar um vetor [50] inteiro. Calcular e exibir:
* a. A média dos valores entre 10 e 200;
* b. A soma dos números ímpares.
* Autor: Clederson Cruz
* Data: 04/09/2016
*/
import javax.swing.JOptionPane;

public class VetorInteiros {
	public static void main(String[] args) {
		int vetor[] = new int[50];
		float media10e200 = 0.0F;
		int somaImpares = 0;

		//Carregando o vetor
		vetor = carregaVetor(vetor);
		
		//Calcula a média no intervalo
		media10e200 = calculaMedia(vetor);

		//Soma dos ímpares
		somaImpares = calculaSomaImpares(vetor);

		//Exibe resultado
		JOptionPane.showMessageDialog(null, String.format("Média [10, 200]: %.2f\nSoma dos Ímpares: %d", media10e200, somaImpares), "Saída", JOptionPane.PLAIN_MESSAGE);

	}

	//Recebendo os valores e armazenando no vetor
	static int[] carregaVetor(int vet[]) {
			
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Informe o %d valor inteiro: ", i+1), "Entrada", JOptionPane.PLAIN_MESSAGE));
		}

		return vet;
	}

	//Calculando a média
	static float calculaMedia(int vet[]) {
		int qtd10e200 = 0;
		float media10e200 = 0.0F;

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] >= 10 && vet[i] <= 200) {
				media10e200 += vet[i]; //Somando valores no intervalo
				qtd10e200++; //Contabilizando quantidade no intervalo
			}
		}

		media10e200 /= qtd10e200;

		return media10e200;
	}

	//Calcula a soma dos ímpares
	static int calculaSomaImpares(int vet[]) {
		int soma = 0;

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 != 0) {
				soma += vet[i];
			}
		}

		return soma;
	}
}
