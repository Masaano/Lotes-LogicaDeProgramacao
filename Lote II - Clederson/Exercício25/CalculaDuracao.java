import javax.swing.JOptionPane;

/**
 * Autor: Clederson Cruz
 * Data: 12/08/2016
 * Função: Calcular o tempo de um jogo sabendo que a partida
 * pode começar em um dia e terminar no outro.
 * Coletar hora e minuto (inicial e final) e exibir a duração
 */

public class CalculaDuracao {
	static int hI, hF, mI, mF, dH = 0, dM = 0;

	public static void main(String[] args) {

		//Recebendo horas e minutos
		hI = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora Inicial [h]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		mI = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto Inicial [min]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		hF = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora Final [h]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		mF = Integer.parseInt(JOptionPane.showInputDialog(null, "Minuto Final [min]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando módulo que verifica a validade do horário
		verificaHorario();

		//Exibindo o resultado
		JOptionPane.showMessageDialog(null, String.format((hI == 12 ? "Do" : "Das") + " %dh%d às %dh%d\nDuração: %dh%d", hI, mI, hF, mF, dH, dM), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}

	//Módulo que Verifica se o horário é válido
	static void verificaHorario() {
		if ((hI < 0 || hI >= 24) || (hF < 0 || hF >= 24) || (mI < 0 || mI >= 60) || (mF < 0 || mF >= 60)) {
			JOptionPane.showMessageDialog(null, "HORÁRIO INVÁLIDO!", "ERRO", JOptionPane.ERROR_MESSAGE);
			System.exit(0); //Finaliza o programa
		} else {
			//Calcula a duração em minutos e horas
			calculaDuMins();
			calculaDuHoras();
		}
	}

	//Calculando duração em minutos
	static void calculaDuMins() {
		//Caso o minuto em que o jogo começou seja menor que o minuto em que o jogo terminou	
		if (mI < mF) {
			dM = mF - mI;
		}
		//Caso o minuto em que o jogo começou seja maior que o minuto em que o jogo terminou		
		else if (mI > mF) {
			dM = 60 + (mF - mI);
		}
	}

	static void calculaDuHoras() {
		/* Calculando duração em horas normalmente com a hora de início menor que a hora de término Ex.:
		* início 13:10 fim 14:30 */
		if (hI < hF) {
			dH = hF - hI;

			//Caso tenha começado em um dia e terminado no outro. Ex.: início 13:10 fim 14:05
			if (mI > mF) { 
				dH -= 1;
			}
		}
		/* Calculando duração em horas caso tenha começado e terminado no mesmo dia, com a hora inicial e a final iguais ex.:
		* início 13:00 fim 13:50 */
		else if (hI == hF && mI > mF) {
			dH = 23 + (hF - hI);
		}

		/*Calculando duração em horas caso tenha começado em um dia e terminado no outro. Ex.: início 14:15 fim 13:10*/
		else if (hI > hF) {
			dH = 24 + (hF - hI);

			//Excessãozinha caso o minuto inicial seja maior que o final
			if (mI > mF) {
				dH -= 1;
			}
		}
	}
}
