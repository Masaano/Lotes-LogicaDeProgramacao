/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
*/

import javax.swing.JOptionPane;

public class DepositoPoupanca {
	public static void main(String[] args) {
		float valor, poupanca;

		//Recebendo o valor do depósito
		valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor do Depósito R$", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando rendimento após 1 mês
		poupanca = (valor * 1.3F)/100F + valor;

		//Exibindo rendimento
		JOptionPane.showMessageDialog(null, String.format("Rendimento após 1 mês\nR$ %.2f", poupanca), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}

