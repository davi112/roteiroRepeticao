import java.util.Scanner;

public class Davi24 {

	/*
	 * Uma Empresa de fornecimento de energia el�trica faz a leitura mensal dos
	 * medidores de consumo. Para cada consumidor, s�o digitados os seguintes dados:
	 * - N�mero do consumidor; - Quantidade de kWh consumidos durante o m�s; - Tipo
	 * (c�digo) do consumidor. 1 � residencial, pre�o em reais por kWh = 0,3 2 �
	 * comercial, pre�o em reais por kWh = 0,5 3 � industrial, pre�o em reais por
	 * kWh = 0,7
	 * 
	 * Os dados devem ser lidos at� que seja encontrado um consumidor com N�mero 0
	 * (zero). Escreva um programa que calcule e imprima: - O custo total para cada
	 * consumidor; - O total de consumo para os tr�s tipos de consumidor; - A m�dia
	 * de consumo dos tipos 1 e 2.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		int numConsumidor = 1, kwh, codConsumidor, totalConsumo = 0, i = 0, count2 = 0, countAux = 0;
		double precoKwh = 0, soma2 = 0, mediaConsumo = 0, custoConsumidor[][] = new double[1000][2];

		while (numConsumidor != 0) {

			System.out.println("\nN�mero do consumidor: ");
			numConsumidor = read.nextInt();
			if (numConsumidor == 0) {
				System.out.println("\nSaiu!");
				break;
			} else {
				System.out.println("\nKwh por m�s: ");
				kwh = read.nextInt();

				System.out.println(
						"\nC�digo do consumidor " + "\n1 - residencial" + "\n2 - comercial" + "\n3 - industrial");
				codConsumidor = read.nextInt();

				switch (codConsumidor) {
				case 1:
					precoKwh = 0.3;
					soma2 += kwh;
					count2++;
					break;
				case 2:
					precoKwh = 0.5;
					soma2 += kwh;
					count2++;
					break;
				case 3:
					precoKwh = 0.7;
					break;
				default:
					System.out.println("\nOp��o inv�lida!");
					System.exit(0);
				}

				custoConsumidor[i][0] = numConsumidor;
				custoConsumidor[i][1] = kwh * precoKwh;
				i++;

				totalConsumo += kwh;
				countAux++;
			}
		}

		mediaConsumo = soma2 / count2;
		System.out.println("\nA m�dia de consumo de 1 e 2 �: " + mediaConsumo + " kwh");
		System.out.println("\nO total de consumo � : " + totalConsumo + " kwh ");

		System.out.println("\nC�DIGO CONSUMIDOR --- CUSTO CONSUMIDOR (R$)");
		for (int j = 0; j < countAux; j++) {
			for (int k = 0; k < 2; k++) {
				if(k==0) {
					System.out.printf("          "+ (int) custoConsumidor[j][k]);
					System.out.print("      |    ");
				}
				else {
					System.out.printf("      R$ %.2f",custoConsumidor[j][k]);
				}
				
			}
			System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		}

	}

}
