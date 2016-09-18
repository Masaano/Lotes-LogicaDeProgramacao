import java.util.Scanner;

public class Somatorio{
	public static void main(String[] args) {
		int n1, n2, resul;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		n1 = leia.nextInt();
		System.out.print("Ingorme outro valor: ");
		n2 = leia.nextInt();

		leia.close();
		if (n1 > n2) {
			resul = calcSum(n1, n2);
		} else {
			resul = calcSum(n2, n1);
		}

		System.out.println("O resultado é: "+ resul);
	}

	static int calcSum(int n1, int n2) {
		int sum = 0;

		for (int i = n2; i <= n1; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}

		return sum;
	}
}
