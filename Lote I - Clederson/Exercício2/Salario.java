/**
* Autor: Clederson Cruz
* Data: 06/08/2016
* Função: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
*/

import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {
		float sal, novoSal;

		//Entrada
		sal = Float.parseFloat(JOptionPane.showInputDialog(null, "Salário atual: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Reajuste
		novoSal = (sal * 15)/100 + sal;

		//Saída
		JOptionPane.showMessageDialog(null, "Novo Salário a receber: R$ " + String.format("%.2f", novoSal), "Reajuste", JOptionPane.PLAIN_MESSAGE);
	}
}
