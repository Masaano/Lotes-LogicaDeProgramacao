/**
* Autor: Clederson Cruz
* Data: 07/08/2016
* Função: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
*   a. Se a média for >= 6,0 exibir “APROVADO”;
*   b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
*   c. Se a média for < 3,0 exibir “RETIDO”.
*/

import javax.swing.JOptionPane;

public class NotasAluno {
	public static void main(String[] args) {
		float n1, n2, n3, n4, media; //notas

		//Recebendo as notas
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe 1ª nota: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe 2ª nota: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe 3ª nota: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		n4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe 4ª nota: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando a média
		media = (n1 + n2 + n3 + n4)/4F;

		//Exibindo o resultado
		if (media >= 6.0F) {
			JOptionPane.showMessageDialog(null, "APROVADO", "Mensagem", JOptionPane.PLAIN_MESSAGE);
		} else if (media >= 3.0F && media < 6.0F) {
			JOptionPane.showMessageDialog(null, "EXAME", "Mensagem", JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "RETIDO", "Mensagem", JOptionPane.WARNING_MESSAGE);
		}
	}
}
