/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */

public class OutraSerie {
	public static void main(String[] args) {
		int j = 3;
		double soma = 1;

		System.out.print("1");

		for (int i = 2; i <= 50; i++) {
			System.out.printf(" + (%d/%d)", i, j);
			j += 2;
			soma += (double) (i/j);
		}
		System.out.printf(" = %.3f\n\n", soma);
	}
}
