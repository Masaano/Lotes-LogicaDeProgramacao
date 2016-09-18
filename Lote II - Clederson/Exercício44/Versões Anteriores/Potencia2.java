import java.util.Scanner;

public class Potencia2 {
	public static void main(String[] args) {
		int base, expo;
		double pote;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe a base: ");
		base = leia.nextInt();

		System.out.print("Informe o expoente: ");
		expo = leia.nextInt();

		if (base == 0) {
			potZero(expo);
		} else {
			pote = potNum(base, expo);
			System.out.printf("Resultado: %.4f\n", pote);
		}
	}

	static void potZero(int exp) {
		if (exp >= 1) {
			System.out.println("Resultado: 0");
		} else {
			System.out.println("INDEFINIDO!");
		}
	}

	static double potNum(int bas, int exp) {
		double pot = 1;
		int exp2 = exp; //exp2 é uma cópia de exp para comparação

		if (exp < 0) {
			exp2 *= -1;
		}

		for (int i = 1; i <= exp2; i++) {
			pot *= bas;
		}

		if (exp < 0) {
			pot = 1/pot;
		}

		return pot;
	}
}
