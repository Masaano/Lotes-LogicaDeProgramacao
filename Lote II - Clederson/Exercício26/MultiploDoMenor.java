import javax.swing.JOptionPane;
/**
 * Autor: Clederson Cruz
 * Data: 28/08/2016
 * Função: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 */

public class MultiploDoMenor {
	static int a, b;

	public static void main(String[] args) {

		//Entrada de dados
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro valor: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando o módulo de exibição
		ExibeMultiplo();
	}

	//Módulo que exibe resultados
	static void ExibeMultiplo() {
		
		if ((a >= b) && (b != 0) && (a % b == 0)) {
			JOptionPane.showMessageDialog(null, String.format("%d é múltiplo de %d", a, b), "Mensagem", JOptionPane.PLAIN_MESSAGE);
		} else if ((b >= a) && (a != 0) && (b % a == 0)){
			JOptionPane.showMessageDialog(null, String.format("%d é múltiplo de %d", b, a), "Mensagen", JOptionPane.PLAIN_MESSAGE);
		} else if (a == 0 && b == 0) {
			JOptionPane.showMessageDialog(null, "0 é múltiplo de 0", "Mensagem", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, String.format("%d não é múltiplo de  %d!", a > b ? a : b, a < b ? a : b), "Mensagem", JOptionPane.WARNING_MESSAGE);
		}
	}

}
