import java.util.Scanner;

public class CalculaPreco {
	public static void main(String[] args) {
		double media, preco;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe o preço: ");
		preco = leia.nextDouble();

		System.out.print("Informe a média: ");
		media = leia.nextDouble();

		leia.close();
		novoPreco(preco, media);
	}

	public static void novoPreco(double p, double m) {
		double np = 0.0;

		if (m < 500 && p < 30) {
			np = p * 1.10;

		} else if ((m >= 500) && (m < 1000) && (p >= 30) && (p < 80)) {
			np = p * 1.15;

		} else if (m >= 1000 && p >= 80) {
			np = p * 0.95;

		} else {
			np = p;
		}

		System.out.printf("O novo preço será: R$ %.2f\n", np);
	}
}

