
public class Davi30 {

	/*
	 * A companhia de teatro do IFMG Sabará deseja realizar uma série de
	 * espetáculos. A direção calcula que a despesa fixa do espetáculo é de
	 * R$200,00. Além disso, sabe-se que com os ingressos ao preço de R$5,00 serão
	 * vendidos 120 entradas. Em uma pesquisa de público estimou-se que a cada
	 * R$0,50 de diminuição no valor do ingresso espera-se um aumento de 26
	 * ingressos nas vendas. Diante dessas informações, implemente um programa que
	 * calcule e imprima uma tabela contendo os valores dos lucros esperados em
	 * função do valor dos ingressos, fazendo uma variação nos ingressos de R$5,00 à
	 * R$1,00 de R$0,50 em R$0,50. Escreva ainda o lucro máximo esperado, o preço do
	 * ingresso e quantidade de ingressos vendidos para obtenção desse lucro máximo
	 * estimado.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double custoFixo = 200.0;
		int qtdIngressos = 120;
		double maiorLucro = 0, precoMaiorLucro = 0, qtdMaiorLucro = 0;

		for (double i = 5.0; i >= 1.0; i -= 0.5) {
			double lucro = (i * qtdIngressos) - custoFixo;
			System.out.println("Preço Ingresso: R$" + i + "_ _ _ _ _ _ _  Quantidade Entradas: " + qtdIngressos 
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
		
		System.out.println("Lucro máximo esperado: R$ " + maiorLucro + " com " 
				+ qtdMaiorLucro + " ingressos Vendidos à R$ "
				+ precoMaiorLucro + " cada");

	}

}
