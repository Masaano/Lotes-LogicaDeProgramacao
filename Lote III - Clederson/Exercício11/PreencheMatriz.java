public class PreencheMatriz {
	public static void main(String[] args) {
		int matriz[][] = new int[8][8];

		//Preenchendo
		matriz = preencheMatriz(matriz);

		//Exibindo
		exibeMatriz(matriz);
	}

	//Módulo para preencher a matriz
	static int[][] preencheMatriz(int m[][]) {

		for (int x = 1; x <= 4; x++) {
			for (int y = (x-1); y < (9 - x); y++) {
				for (int z = (x-1); z < (9 - x); z++) {
					m[y][z] = x;
				}
			}
		}

		return m;
	}

	//módulo para exibir a matriz
	static void exibeMatriz(int m[][]) {
		for(int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.printf("%d ", m[i][j]);
			}
			System.out.println("");
		}
	}
}
