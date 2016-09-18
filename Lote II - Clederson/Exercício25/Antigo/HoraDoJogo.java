import java.util.Scanner;

public class HoraDoJogo {
	public static void main(String[] args) {
		int minIni, minFin, hoIni, hoFin;
		Scanner leia = new Scanner(System.in);

		System.out.print("Hora inicial do jogo[h]: ");
		hoIni = leia.nextInt();

		System.out.print("Minuto inicial do jogo[min]: ");
		minIni = leia.nextInt();

		System.out.print("Hora final do jogo[h]: ");
		hoFin = leia.nextInt();

		System.out.print("Minuto final do jogo[min]: ");
		minFin = leia.nextInt();

		validaTempo(minIni, minFin, hoIni, hoFin);
	}

	public static void validaTempo(int minI, int minF, int hI, int hF) {
		int controle = 1;

		if ((minI < 0) || (minI >= 60) || (minF < 0) || (minF >= 60)) {
			controle = 0;
		}

		if ((hI < 0) || (hI >= 24) || (hF < 0) || (hF >= 24)) {
			controle = 0;
		}

		if (controle == 0) {
			System.out.println("DATA INVÁLIDA!");
		} else {
			calculaDuracao(minI, minF, hI, hF);
		}
	}

	public static void calculaDuracao(int minIni, int minFin, int hoIni, int hoFin) {
		int duMin = 0, duHo = 0;

		if (hoIni > hoFin) {
			duHo = 24 - (hoIni - hoFin);
			if (minIni > minFin) {
				duHo -= 1;
			}
		} else if (hoIni <= hoFin) {
			if (minIni > minFin) {
				duHo = 24 - (hoIni - hoFin);
				if (hoIni == hoFin) {
					duHo -= 1;
				}
		 	} else {
				duHo = hoFin - hoIni;
			}
		}

		if (minIni > minFin) {
			duMin = 60 + (minFin - minIni);
		} else {
			duMin = minFin - minIni;
		}

		System.out.printf("O jogo durou: %d[h]:%d[min].\n", duHo, duMin);
	}
}
