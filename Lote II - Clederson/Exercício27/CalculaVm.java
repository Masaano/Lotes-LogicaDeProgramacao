import java.util.Scanner;

public class CalculaVm {
	public static void main(String[] args) {
		int voltas, t;
		double s;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe o número de voltas: ");
		voltas = leia.nextInt();

		System.out.print("Informe a extensão da pista[m]: ");
		s = leia.nextDouble();

		System.out.print("Informe o tempo do circuito[min]: ");
		t = leia.nextInt();

		leia.close();
		vmedia(voltas, s, t);
	}

	public static void vmedia(int voltas, double s, int t) {
		double vm = ((s * voltas)/1000)/(t/60);

		System.out.printf("A velocidade média foi de: %.1f km/h\n", vm);
	}
}
