/**
 * Autor Clederson Cruz
 * Data: 21/08/2016
 * Função: Calcule e mostre o quadrado dos números entre 10 e 150.
 */

public class CalcQuad {
	public static void main(String[] args) {
		for (int i = 10; i <= 150; i++) {
			System.out.printf("%d² = %.0f\n", i, Math.pow(i, 2));
		}
	}
}
