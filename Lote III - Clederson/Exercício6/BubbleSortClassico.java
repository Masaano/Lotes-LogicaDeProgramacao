public class BubbleSortClassico {
	public static void main(String[] args) {
		int vetor[] = {95, 47, 38, 26, 11};
		int aux = 0;

		for (int i = 0; i < 5; i++) {
			System.out.printf("Vetor[%d] = %d\n", i, vetor[i]);
		}

		System.out.println("\n\n");

		for (int h = 0; h < (vetor.length - 1); h++) {
			for (int i = 0; i < (vetor.length - 1); i++) {
				if (vetor[i] > vetor[i+1]) {
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.printf("Vetor[%d] = %d\n", i, vetor[i]);
		}
	}
}
