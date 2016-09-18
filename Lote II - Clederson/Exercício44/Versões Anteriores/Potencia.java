import java.util.Scanner;

public class Potencia {
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

		if (exp >= 1) {
			for (int i = 1; i <= exp; i++) {
				pot *= bas;
			}
		} else if (exp < 0) {
			exp *= -1;
			for (int i = 1; i <= exp; i++) {
				pot *= bas;
			}
			pot = 1/pot;
		}

		return pot;
	}
}
