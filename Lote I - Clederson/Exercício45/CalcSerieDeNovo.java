/**
 * Data: 21/08/2016
 * Autor: Clederson Cruz
 * Função: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */

public class CalcSerieDeNovo {
	public static void main(String[] args) {
		int j = 2;
		double resul = 1;

		System.out.print("1");
		for (int i = 2; i <= 15; i++) {
			if (i % 2 == 0) {
				resul -= (double) (i/(j*j));
				System.out.printf(" - (%d/%d)", i, (j*j));
			} else {
				resul += (double) (i/(j*j));
				System.out.printf(" + (%d/%d)", i, (j*j));
			}
			j += 1;
		}
		System.out.printf(" = %.3f\n", resul);
	}
}
