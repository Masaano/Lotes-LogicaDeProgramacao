/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
*/

public class CalcSerieDeNovo {
	public static void main(String[] args) {
		serie();
	}

	static void serie() {
		int j = 2;
		double serie = 1;

		System.out.print(1);
		for (int i = 2; i <= 15; i++) {
			if (i % 2 == 0) {
				System.out.printf(" - (%d/%d)", i, (j*j));
				serie -= i/Math.pow(j, 2);
			} else {
				System.out.printf(" + (%d/%d)", i, (j*j));
				serie += i/Math.pow(j, 2);
			}

			j += 1;
		}

		System.out.printf(" = %.3f\n", serie);
	}
}
