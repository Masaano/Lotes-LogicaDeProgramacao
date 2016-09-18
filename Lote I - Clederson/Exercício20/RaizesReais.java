/**
* Autor: Clederson Cruz
* Data: 11/08/2016
* Função: Receba 3 coeficientes A, B, e C de uma equação do 2o grau da fórmula ax² + bx + c = 0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
*/

import javax.swing.JOptionPane;

public class RaizesReais {
        public static void main(String[] args) {
                int a, b, c;
                double x1, x2, delta;

                //Entrada de A, B e C
                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de A: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
                b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de B: ", "Entrada", JOptionPane.PLAIN_MESSAGE));
                c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de C: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

                //Calculando o Delta
                delta = Math.pow(b,2) - 4 * a * c;

		if (delta >= 0 && a != 0) {
                	//Calculando as raízes reais
                	x1 = (-b + Math.sqrt(delta))/(2 * a);
                	x2 = (-b - Math.sqrt(delta))/(2 * a);

                	//Saída
	                JOptionPane.showMessageDialog(null, String.format("x' = %.1f\nx'' = %.1f", x1, x2), "Resultado", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Essa equação não possui raízes reais!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
        }
}


