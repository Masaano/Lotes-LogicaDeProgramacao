import java.util.Scanner;

public class Multiplo {
	public static void main(String[] args) {
		int n1, n2;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe um valor inteiro: ");
		n1 = leia.nextInt();
		System.out.print("Informe outro valor inteiro: ");
		n2 = leia.nextInt();

		leia.close();
		verificaMul(n1, n2);
	}

	public static void verificaMul(int n1, int n2) {
		if ((n1 > n2) && (n1 % n2 == 0)) {
			System.out.printf("O valor %d é múltiplo de %d\n", n1, n2);
		} else if((n2 > n1) && (n2 % n1 == 0)) {
			System.out.printf("O valor %d é múltiplo de %d\n", n2, n1);
		}
	}
}
