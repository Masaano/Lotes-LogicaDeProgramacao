/**
* Data: 28/08/2016
* Autor: Clederson Cruz
* Função: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/
import javax.swing.JOptionPane;

public class ConsumoGasolina {
	static double qtdLitro; //Variáveis Globais

	public static void main(String[] args) {
		int temp, vm;

		//Entrada: tempo, velocidade média
		temp = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tempo[h]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		vm = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a velocidade média[km]: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Chamando módulo que calcula o consumo
		calcConsumo(temp, vm);

		//Exibindo o consumo
		JOptionPane.showMessageDialog(null, String.format("O consumo em litros foi de: %.2f\n\n", qtdLitro), "Saída", JOptionPane.PLAIN_MESSAGE);
	}

	//Módulo que calcula o consumo
	public static void calcConsumo(int tmp, int vm) {
		double s = tmp * vm;
		qtdLitro = s/12;
	}
}
