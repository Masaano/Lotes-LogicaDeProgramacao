public class BubbleSort {
    public static void main(String[] args) {
        int vetor[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int tamanho = vetor.length;
        int aux;

        for (int i = 0; i < (tamanho - 1); i++) {
            for (int j = (i + 1); j <= (tamanho - 1); j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor[%d] = %d\n", i, vetor[i]);
        }
    }
    
}
