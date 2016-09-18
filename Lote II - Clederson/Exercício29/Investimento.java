import javax.swing.JOptionPane;

/**
 * Autor: Clederson Cruz
 * Data: 28/08/2016
 * Função: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 */

public class Investimento {
	public static void main(String[] args) {
		float valorCorrigido = 0.0F; //op = operação
		int op;

		//Operação a se realizar
		op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Poupança\n2 - Renda Fixa", "Entrada", JOptionPane.INFORMATION_MESSAGE));

		//Calculando correção
		valorCorrigido = calculaCorecao(op);

		//Exibindo
		JOptionPane.showMessageDialog(null, String.format("Valor Corrigido: R$ %.2f", valorCorrigido), "Valor Corrigido", JOptionPane.PLAIN_MESSAGE);
	}

	//Módulo para calcular a correção
	static float calculaCorecao(int op) {
		float valor, valorCorrigido = 0.0F;
		//Realizando operação
		switch (op) {
			case 1:
				valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor R$: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
				valorCorrigido = valor * 1.03F;
				break;
			case 2:
				valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor R$: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
				valorCorrigido = valor * 1.05F;
				break;
			default:
				JOptionPane.showMessageDialog(null, "OPERAÇÃO INVÁLIDA!", "ERRO", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
		}

		return valorCorrigido;
	}
}
