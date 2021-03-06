/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
*	Casa: 1 2 3 4 ... 64
*	Qte: 1 2 4 8 ... N
*/

public class Xadrez {
	public static void main(String[] args) {
		calcGraos();
	}

	static void calcGraos() {
		double qtd = 0;

		for (int i = 1; i <= 64; i++) {
			System.out.printf("%.0f\n", Math.pow(2, (i-1)));
			qtd += Math.pow(2, (i-1));
		}

		System.out.printf("Quantidade total: %.0f\n", qtd);
	}
}
