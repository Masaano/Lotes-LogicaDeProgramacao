/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/

import javax.swing.JOptionPane;

public class QuantidadeAlimentos {
	public static void main(String[] args) {
		float qtd, dias;

		//Recebendo a quantidade de Alimento
		qtd = Float.parseFloat(JOptionPane.showInputDialog(null, "Quantidade de alimentos [kg]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando a duração
		dias = ((qtd * 1000F)/50F);

		//Saída
		JOptionPane.showMessageDialog(null, String.format("Esse alimento irá durar %.1f dias.", dias), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}

}

