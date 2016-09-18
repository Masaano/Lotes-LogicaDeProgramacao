/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */

public class Probabilidade {
	public static void main(String[] args) {
		int a = 6, b = 1;

		for (int i = 1; i <= 6; i++) {
			System.out.printf("%d + %d = %d\n", a, b, (a + b));
			a -= 1;
			b += 1;
		}
	}
}
