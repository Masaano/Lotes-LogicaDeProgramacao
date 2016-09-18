/**
* Função: Criar uma matriz [8][8] onde o programa irá carregar segundo:
* Casa | 1 | 2 | 3 | 4 | ... | * Exibir a soma
* Valor| 1 | 2 | 4 | 8 | ... | 	dos valores (sim, esse algoritmo não faz sentido)
* Autor: Clederson Cruz
* Data: 07/09/2016
*/

public class CasaQuadrado {
	public static void main(String[] args) {
		long matriz[][] = new long[8][8];
		long valor = 0L;

		//Exibindo no programa principal
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				matriz[i][j] = potNum(valor);
				valor += 1L;

				System.out.printf("%d\t", matriz[i][j]);
			}
			System.out.print("\n");
		}
	}

	//Módulo para calcular a potência
	static long potNum(long exp) {
		long pot = 1L;
		if (exp >= 1) {
			for (int i = 1; i <= exp; i++) {
				pot *= 2L;
			}
		}

		return pot;
	}
}
