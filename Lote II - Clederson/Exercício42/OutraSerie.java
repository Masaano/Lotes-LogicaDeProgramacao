/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
*/


public class OutraSerie{
	public static void main(String[] args) {
		System.out.print(1);
		calcSerie();
	}

	static void calcSerie() {
		int j = 3;
		double serie = 1;

		for (int i = 2; i <= 50; i++) {
			System.out.printf(" + (%d/%d)", i, j);
			serie += (double) i/j;
			j += 2;
		}
		System.out.printf(" = %.3f\n", serie);
	}
}
