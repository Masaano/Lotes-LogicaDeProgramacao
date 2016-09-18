/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
*/

public class IdadeAnaMaria {
	public static void main(String[] args) {
		anaMaria();
	}

	static void anaMaria() {
		double ana = 1.10, maria = 1.50;
		int anos = 0;

		while (ana < maria) {
			maria += 0.02;
			ana += 0.03;
			anos += 1;
		}

		System.out.println(anos + " anos para que Ana seja maior que Maria.");
	}
}
