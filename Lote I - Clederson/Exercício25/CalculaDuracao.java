import javax.swing.JOptionPane;

/**
 * Autor: Clederson Cruz
 * Data: 12/08/2016
 * Função: Calcular o tempo de um jogo sabendo que a partida
 * pode começar em um dia e terminar no outro.
 * Coletar hora e minuto (inicial e final) e exibir a duração
 */

public class CalculaDuracao {
	public static void main(String[] args) {
		int hI, hF, mI, mF, dH = 0, dM = 0;

		//Recebendo horas e minutos
		hI = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora Inicial [h]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		mI = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto Inicial [min]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		hF = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora Final [h]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		mF = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto Final [min]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Verificando se o horário é válido
		if ((hI < 0 || hI >= 24) || (hF < 0 || hF >= 24) || (mI < 0 || mI >= 60) || (mF < 0 || mF >= 60)) {
			JOptionPane.showMessageDialog(null, "HORÁRIO INVÁLIDO!", "ERRO", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		/*Calculando a duração do jogo*/
		//Minutos
		if (mI < mF) {
			dM = mF - mI;
		} else if (mI > mF) {
			dM = 60 + (mF - mI);
		}

		//Horas
		if (hI < hF) {
			dH = hF - hI;

			if (mI > mF) { //Começou em um dia e terminou no outro
				dH -= 1;
			}
		}
		else if (hI == hF && mI > mF) {
			dH = 23 + (hF - hI);
		}
		else if (hI > hF) {
			dH = 24 + (hF - hI);

			if (mI > mF) {
				dH -= 1;
			}
		}

		//Exibindo o resultado
		JOptionPane.showMessageDialog(null, String.format((hI == 12 ? "Do" : "Das") + " %dh%d às %dh%d\nDuração: %dh%d", hI, mI, hF, mF, dH, dM), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
