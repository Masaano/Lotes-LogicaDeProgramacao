/**
* Autor: Clederson Cruz
* Data: 07/08/2016
* Função: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/

import javax.swing.JOptionPane;

public class CalculaLitrosGastos {
	public static void main(String[] args) {
		float litrosG, temp, esp, vm;

		//Recebendo tempo de percurso e velocidade média
		temp = Float.parseFloat(JOptionPane.showInputDialog(null, "Duração [h]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		vm = Float.parseFloat(JOptionPane.showInputDialog(null, "Velocidade [km/h]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Calculando o tamanho do percurso
		esp = vm * temp;
		//Calculando a quantidade de litros gastos
		litrosG = (float) esp/12;

		//Saída
		JOptionPane.showMessageDialog(null, String.format("Gastos: %.1f km/l", litrosG), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}

