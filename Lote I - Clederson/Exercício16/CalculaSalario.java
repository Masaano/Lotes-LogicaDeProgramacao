/**
* Autor: Clederson Cruz
* Data: 07/08/2016
* Função: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= SalárioBruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
*/

import javax.swing.JOptionPane;

public class CalculaSalario {
	public static void main(String[] args) {
		short qtdHoras, nDepen;
		float valHora, desc, salLiqui, salBru;

		//Recebendo quantidade de horas trabalhadas, valor por hora, desconto e dependentes respectivamente
		qtdHoras = Short.parseShort(JOptionPane.showInputDialog(null, "Horas Trabalhadas: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		valHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Valor por hora [R$]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		desc = Float.parseFloat(JOptionPane.showInputDialog(null, "Desconto [%]:", "Entrada", JOptionPane.PLAIN_MESSAGE));
		nDepen = Short.parseShort(JOptionPane.showInputDialog(null, "Dependentes: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando Salário Bruto
		salBru = (float) qtdHoras * valHora;
		//Calculando o Salário Líquido
		salLiqui = (float) salBru - (desc * salBru/100) + (nDepen * 100);

		//Exibindo o salário
		JOptionPane.showMessageDialog(null, String.format("Salário Bruto: R$ %.2f\nSalário a Receber: R$ %.2f", salBru, salLiqui), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
