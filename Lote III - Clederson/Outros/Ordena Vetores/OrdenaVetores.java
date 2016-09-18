import javax.swing.JOptionPane;

/**
* Função: carregar, exibir e ordenar um vetor de tamanho 4, através de um menu.
* Autor: Clederson Cruz
* Data: 01/09/2016
*/

public class OrdenaVetores {
	public static void main(String[] args) {
		int vetor[] = new int[4];
		int opc;

		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Carrega\n2 - Mostra\n3 - Ordena\n9 - Sair", "Menu", JOptionPane.PLAIN_MESSAGE));

			switch(opc) {
				case 1:
					vetor = carregaVet(vetor);
					break;
				case 2:
					exibeVet(vetor);
					break;
				case 3:
					vetor = ordenaVet(vetor);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Finalizando...", "Menu", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		} while(opc != 9);
	}

	//Módulo para carregar o vetor
	static int[] carregaVet(int vet[]) {
		for (int i = 0; i < 4; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Informe o valor do %d elemento: ", i+1), "Carrega Vetor", JOptionPane.PLAIN_MESSAGE));
		}

		return vet;
	}

	//Módulo para exibir o vetor
	static void exibeVet(int vet[]) {
		String msg = "";

		for (int i = 0; i < 4; i++) {
			msg += "vetor[" + i + "] = " + vet[i] + "\n";
		}

		JOptionPane.showMessageDialog(null, msg, "Exibe Vetor", JOptionPane.PLAIN_MESSAGE);
	}

	//Módulo para ordenar o vetor (Bubble Sort) em ordem ascendente
	static int[] ordenaVet(int vet[]) {
		int aux;

		//Esse for vai desde a posição inicial (0) até a penúltima posição (2). Posições: [0, 1, 2, 3] (total 4)
		for (int i = 0; i < (4 - 1); i++) {
		//Esse for vai desde a posição i + 1 até a última posição (3), J deve ser > I
			for (int j = i + 1; j <= (4 - 1); j++) {
				//Aqui é onde é realizado a troca dos valores
				if (vet[i] > vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}

			/*Obs.: i ou j não pode ser <= 4. Porque em vet[tam], tam vai de 0 a 3. Por isso vet.tamanho (que é 4) - 1
			* (4 - 1) pode ser substituído por (vet.length - 1), que pega o tamanho do vetor (4) e subtrai 1. */
		}

		return vet;
	}
}
