/**
* Função: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3o vetor (VT3[6]) e mostrar os seus dados.
* Autor: Clederson Cruz
* Data: 04/09/2016
*/

import java.util.Scanner;

public class ConcatenaVetor {
	public static void main(String[] args) {
		int vt1[] = new int[3], vt2[] = new int[3];
		int vt3[] = new int[6];

		//Carregando vetores
		vt1 = carregaVetor(vt1);
		System.out.println("");
		vt2 = carregaVetor(vt2);

		//Concatenando o vetor
		vt3 = concatenaVetores(vt1, vt2);

		//Exibindo o vetor3 com os outros dois concatenados
		for (int i = 0; i < vt3.length; i++) {
			System.out.printf("vt3[%d] = %d\n", i, vt3[i]);
		}
	}

	//Carrega o Vetor
	static int[] carregaVetor(int vt[]) {
		Scanner leia = new Scanner(System.in); //Leitor

		for (int i = 0; i < vt.length; i++) {
			System.out.print("Informe um valor inteiro: ");
			vt[i] = leia.nextInt();
		}

		return vt;
	}

	//Concatena os vetores
	static int[] concatenaVetores(int vt1[], int vt2[]) {
		int vt3[] = new int[6];

		for (int i = 0; i < vt3.length; i++) {
			if (i < vt3.length/2) {
				vt3[i] = vt1[i];
			} else {
				vt3[i] = vt2[i - 3];
			}
		}

		return vt3;
	}
}
