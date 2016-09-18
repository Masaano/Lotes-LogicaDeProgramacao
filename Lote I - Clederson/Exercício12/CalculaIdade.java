/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
*/

import javax.swing.JOptionPane;

public class CalculaIdade {
	public static void main(String[] args) {
		short anoAtual, anoNasc, idade;

		//Recebendo o ano de nascimento e atual
		anoNasc = Short.parseShort(JOptionPane.showInputDialog(null, "Ano de Nascimento: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		anoAtual = Short.parseShort(JOptionPane.showInputDialog(null, "Ano atual: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Cálculo da idade (operação entre shorts gera int)
		idade = (short) (anoAtual - anoNasc);

		//Saída
		JOptionPane.showMessageDialog(null, String.format("Sua idade: %d\nE daqui a 17 anos terá: %d", idade, idade + 17), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
