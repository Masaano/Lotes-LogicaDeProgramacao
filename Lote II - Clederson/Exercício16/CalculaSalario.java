/**
* Data: 28/08/2016
* Autor: Clederson
* Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
*/

import javax.swing.JOptionPane;

public class CalculaSalario {
	static double salBruto, salLiqui; //Variáveis globais

	public static void main(String[] args) {
		int qtdHoras, valHora, depen;
		double desc;

		//Entrada de dados: quantidade de horas trabalhadas, valor por hora, desconto e nº de dependência
		qtdHoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas trabalhadas: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		valHora = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor por hora: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		desc = Double.parseDouble(JOptionPane.showInputDialog(null, "Desconto: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		depen = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de dependentes: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando módulo que calcula o salário líquido
		calcSal(qtdHoras, valHora, desc, depen);

		//Saída
		JOptionPane.showMessageDialog(null, String.format("Salário a receber: R$ %.2f\n", salLiqui), "Saída", JOptionPane.PLAIN_MESSAGE);
	}

	//Módulo que calcula o salário líquido
	public static void calcSal(int qtdH, int valH, double desc, int depen) {
		salBruto = qtdH * valH;
		salLiqui = (salBruto - (salBruto * desc)/100) + (depen * 100);
	}


}
