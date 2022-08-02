
public class Davi30 {

	/*
	 * A companhia de teatro do IFMG Sabar� deseja realizar uma s�rie de
	 * espet�culos. A dire��o calcula que a despesa fixa do espet�culo � de
	 * R$200,00. Al�m disso, sabe-se que com os ingressos ao pre�o de R$5,00 ser�o
	 * vendidos 120 entradas. Em uma pesquisa de p�blico estimou-se que a cada
	 * R$0,50 de diminui��o no valor do ingresso espera-se um aumento de 26
	 * ingressos nas vendas. Diante dessas informa��es, implemente um programa que
	 * calcule e imprima uma tabela contendo os valores dos lucros esperados em
	 * fun��o do valor dos ingressos, fazendo uma varia��o nos ingressos de R$5,00 �
	 * R$1,00 de R$0,50 em R$0,50. Escreva ainda o lucro m�ximo esperado, o pre�o do
	 * ingresso e quantidade de ingressos vendidos para obten��o desse lucro m�ximo
	 * estimado.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double custoFixo = 200.0;
		int qtdIngressos = 120;
		double maiorLucro = 0, precoMaiorLucro = 0, qtdMaiorLucro = 0;

		for (double i = 5.0; i >= 1.0; i -= 0.5) {
			double lucro = (i * qtdIngressos) - custoFixo;
			System.out.println("Pre�o Ingresso: R$" + i + "_ _ _ _ _ _ _  Quantidade Entradas: " + qtdIngressos 
					+ "_ _ _ _ _ _ _ Lucro esperado R$"+lucro);
			
			if(i == 5.0) {
				qtdMaiorLucro = qtdIngressos;
				precoMaiorLucro = i;
				maiorLucro = lucro;
			}else {
				if(lucro > maiorLucro) {
					qtdMaiorLucro = qtdIngressos;
					precoMaiorLucro = i;
					maiorLucro = lucro;
				}
			}
			qtdIngressos += 26;
			System.out.println();
			
		}
		
		System.out.println("Lucro m�ximo esperado: R$ " + maiorLucro + " com " 
				+ qtdMaiorLucro + " ingressos Vendidos � R$ "
				+ precoMaiorLucro + " cada");

	}

}
