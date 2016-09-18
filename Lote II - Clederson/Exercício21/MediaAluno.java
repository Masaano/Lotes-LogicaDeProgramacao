/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
* Mostre a mensagem de acordo com a média:
* a. Se a média for >= 6,0 exibir “APROVADO”;
* b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
* c. Se a média for < 3,0 exibir “RETIDO”.
*/

import javax.swing.JOptionPane;

public class MediaAluno {
	public static void main(String[] args) {
		double n1, n2, n3, n4;

		//Entrada das notas
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a 1ª nota: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a 2ª nota: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a 3ª nota: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a 4ª nota: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando módulo que calcula média e exibe nota
		calculaMedia(n1, n2, n3, n4);
	}

	//Módulo que calcula média e exibe
	public static void calculaMedia(double n1, double n2, double n3, double n4) {
		double media = (n1 + n2 + n3 + n4)/4;

		//Exibindo situação
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "APROVADO", "Situação", JOptionPane.INFORMATION_MESSAGE);
		} else if (media >= 3 && media < 6) {
			JOptionPane.showMessageDialog(null, "EXAME", "Situação", JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "REPROVADO", "Situação", JOptionPane.WARNING_MESSAGE);
		}
	}
}
