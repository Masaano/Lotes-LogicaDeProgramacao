import javax.swing.JOptionPane;

public class CaixaEletronico {
		static final int VALOR_NOTAS[] = {2, 5, 10, 20, 50, 100}; //Valor constante das notas
		static int caixa[][] = new int[4][7]; //Qtd de notas em cada caixa de cada banco
		static int saldoCaixa[] = new int[4], //Saldo dos caixas
		qtdSaques[] = new int[4], //Saques dos bancos
		maiorSaque[] = new int[4], //Maior saque dos caixas
		menorSaque[] = new int[4]; //Menor saque dos caixas
		static float valSaques[] = new float[4], //Valor dos saques
		mediaSaque[] = new float[4]; //Média de saques dos caixas

	public static void main(String[] args) {
		int opc; //Opção

		//Menu do caixa
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null,
				"1 - Carregar Notas\n2 - Retirar Notas\n3 - Estatística\n9 - Sair",
				"Menu", JOptionPane.PLAIN_MESSAGE));

			switch (opc) {
				case 1:
					carregaNotas();
					break;
				case 2:
					retiraNotas();
					break;
				case 3:
					exibeEstatistica();
					break;
				case 9:
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		} while(opc != 9);
	}

	//Módulo para carregar as notas no caixa
	static void carregaNotas() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				caixa[i][j] = 6; //6 ocorrências de cada nota
				saldoCaixa[i] += caixa[i][j];
			}
		}

		JOptionPane.showMessageDialog(null, "Notas carregadas.", "Menu", JOptionPane.INFORMATION_MESSAGE);
	}

	//Módulo para realizar o saque
	static void retiraNotas() {
		//Yes = 0, No = 1, 2 = Cancel
		int opc = 0, banco = 0, i = 5; //Opção das notas, banco a se efetuar o saque, contador
		int qtd = 0, saque = 0; //quantidade de notas do valor X, saque

		//Validando e recebendo o número do banco
		do {
			banco = Integer.parseInt(JOptionPane.showInputDialog(null,
				"<html>Informe o Banco<br />1 - Banco do Brasil<br /> 2 - Satander<br /> 3 - Itaú<br /> 4 - Caixa</html>"
				, "Menu", JOptionPane.INFORMATION_MESSAGE));

			if (!(banco >= 1 && banco <= 4))
				JOptionPane.showMessageDialog(null, "Esse banco não está registrado no sistema.",
				"Alerta", JOptionPane.WARNING_MESSAGE);
		} while (!(banco >= 1 && banco <= 4));

		//Nevagação do menu para o saque
		do {
			opc = JOptionPane.showConfirmDialog(null, "Deseja retirar notas de "+VALOR_NOTAS[i]+"?",
			"Menu", JOptionPane.YES_NO_CANCEL_OPTION);

			switch (opc) {
				case 0:
					qtd = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe a quantidade de notas no valor de "+VALOR_NOTAS[i]+": ",
					"Menu", JOptionPane.INFORMATION_MESSAGE));

					if ((qtd * VALOR_NOTAS[i]) > (caixa[banco-1][i] * VALOR_NOTAS[i])) {
						JOptionPane.showMessageDialog(null, "EXCEDEU O LIMITE DO CAIXA",
						"Alerta", JOptionPane.WARNING_MESSAGE);
					} else{
						saque += (VALOR_NOTAS[i] * qtd); //Saque
						calculaEstatistica(banco-1, qtd, VALOR_NOTAS[i], i); //Módulo para calcular a estatística
					}
					i--;
					break;
				case 1:
					i--;
					if (i != -1)
						JOptionPane.showMessageDialog(null, "Disponibilizando próxima nota...",
						"Mensagem", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Saindo...", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
					i = -1;
					break;
			}
		} while(i != -1);

		if (saque > 0) {
			JOptionPane.showMessageDialog(null, "Saque efetuado: R$ " + saque,
			"Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	//Módulo para calcular a estatística dos bancos e seus respectivos caixas
	static void calculaEstatistica(int banco, int qtd, int valor, int notas) {
		int saque = qtd * valor; //Saque do banco X

		if (saque > 0) {
			if (saque > maiorSaque[banco]) {
				maiorSaque[banco] = saque;
			}
			if ((saque < menorSaque[banco]) | (menorSaque[banco] == 0)) {
				menorSaque[banco] = saque;
			}

			valSaques[banco] += saque; //Contabilizando o total de saques do banco X
			qtdSaques[banco]++; //Contabilizando saques do banco X
			caixa[banco][notas] -= qtd; //Retirando as notas do caixa do banco X
			saldoCaixa[banco] -= saque; //Atualizando saldo do caixa do banco X
		} else {
			JOptionPane.showMessageDialog(null, "TIPO DE SAQUE NÃO PERMITIDO" + saque,
		"Alerta", JOptionPane.WARNING_MESSAGE);
		}
	}

	//Módulo para exibir a estatística dos bancos
	static void exibeEstatistica() {
		String estatsBancos = "Banco do Brasil | Santander | Itaú | Caixa\n\n";

		estatsBancos += "\nMaior Saque[R$] ";
		for (int i = 0; i < 4; i++) {
			estatsBancos += maiorSaque[i]+" | ";
		}
		
		estatsBancos += "\nMenor Saque[R$] ";
		for (int i = 0; i < 4; i++) {
			estatsBancos += menorSaque[i]+" | ";
		}
		
		estatsBancos += "\nMédia dos Saques[R$] ";
		for (int i = 0; i < 4; i++) {
			mediaSaque[i] = valSaques[i]/(float)qtdSaques[i]; //Calculando a média de saques de cada banco
			estatsBancos += (Float.isNaN(mediaSaque[i]) ? "0" : String.format("%.2f", mediaSaque[i]))+" | ";
		}

		estatsBancos += "\nTotal dos Saques[R$] ";
		for (int i = 0; i < 4; i++) {
			estatsBancos += String.format("%.2f",valSaques[i])+" | ";
		}

		estatsBancos += "\nSobras dos Caixas[notas] ";
		for (int i = 0; i < 4; i++) {
			caixa[i][6] = 0;

			for (int j = 0; j < 6; j++) {
				caixa[i][6] += caixa[i][j];
			}

			estatsBancos += caixa[i][6] + " | ";
		}
		JOptionPane.showMessageDialog(null, estatsBancos, "Estatística", JOptionPane.INFORMATION_MESSAGE);
	}
}
