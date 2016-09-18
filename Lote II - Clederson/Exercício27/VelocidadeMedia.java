import javax.swing.JOptionPane;

/**
 * Autor: Clederson Cruz
 * Data: 28/08/2016
 * Função: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
 */


public class VelocidadeMedia {
		static int voltas, tempo;
		static float metros, vm;
	public static void main(String[] args) {

		//Entrada de dados
		voltas = Integer.parseInt(JOptionPane.showInputDialog(null, "nº de voltas: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		metros = Float.parseFloat(JOptionPane.showInputDialog(null, "Extensão do circuito [m]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Duração [min]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Verificando se houve corrida
		verificaCorrida();

		//Exibe a velocidade média (caso houve corrida)
		JOptionPane.showMessageDialog(null, String.format("Velocidade média: %.1f km/h", vm), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}

	//Módulo que verifica a existência de corrida
	static void verificaCorrida() {
		if (tempo <= 0 || metros <= 0 || voltas <= 0) {
			JOptionPane.showMessageDialog(null, "Não houve corrida.", "Mensagem", JOptionPane.WARNING_MESSAGE);
			System.exit(0); //Encerra o programa
		} else {
			//Caso contrário calcula a velocidade média
			vm = ((voltas * metros)/1000F) / (tempo/60F);
		}
	}
}
