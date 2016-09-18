/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
resultado 7.
*/
import javax.swing.JOptionPane;

public class Probabilidade {
	public static void main(String[] args) {
		int a = 6, b;
		String msg = ""; //Mensagem a ser exibida

		//Calculando
		for(b = 1; b <= 6; b++) {
			//Concatenando mensagem a ser exibida
			msg += a + " + " + b + " = " + (a + b) + "\n";

			//Decremento de A
			a -= 1;
		}

		//Chamando módulo de saída
		exibe(msg);
	}

	//Exibindo
	static void exibe(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Probabilidade", JOptionPane.PLAIN_MESSAGE);
	}
}
