import javax.swing.JOptionPane;

/**
 * Autor: Clederson Cruz
 * Data: 13/08/2016
 * Função: Calcular o tempo de um jogo sabendo que a partida
 * pode começar em um dia e terminar no outro.
 * Coletar hora e minuto (inicial e final) e exibir a duração
 * Venda Mensal	Preço Atual	Preço	Novo
 * < 500		< 30 		+	10%
 * >= 500 e < 1000 >= 30 e < 80	+	15%
 * >= 1000		>= 80		-	5%
*/

public class CalculaPrecoProduto {
	public static void main(String[] args) {
		float preco, novoPreco = 0.0F, vendaMensal;

		//Recebendo salário e venda mensal
		preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Preço R$ : ", "Entrada", JOptionPane.PLAIN_MESSAGE));
		vendaMensal = Float.parseFloat(JOptionPane.showInputDialog(null, "Venda Mensal: ", "Entrada", JOptionPane.PLAIN_MESSAGE));

		//Verificando a tribuindo novo preço
		if (vendaMensal < 500F && preco < 30F) {
			novoPreco = preco * 1.1F;
		}
		else if ((vendaMensal >= 500F && vendaMensal < 1000F) && (preco >= 30F && preco < 80F)) {
			novoPreco = preco * 1.15F;
		}
		else if (vendaMensal >= 1000F && preco >= 80F) {
			novoPreco = preco * 0.95F;
		} else {
			novoPreco = preco;
		}

		//Exibindo o novo preço
		JOptionPane.showMessageDialog(null, String.format("Novo Preço: R$ %.2f", novoPreco), "Mensagem", JOptionPane.PLAIN_MESSAGE);
	}
}
