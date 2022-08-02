import java.util.Scanner;

public class Davi31 {

	/*
	 * Em uma eleição presidencial existem quatro candidatos. Os votos são
	 * informados através de códigos. Os dados utilizados para a contagem dos votos
	 * obedecem à seguinte codificação: - 1, 2, 3, 4: voto para os respectivos
	 * candidatos; - 5: voto em branco; - Outros valores: voto nulo. Elabore um
	 * algoritmo que leia o código do candidato em um voto. Calcule e escreva: -
	 * total de votos para cada candidato; - total de votos nulos; - total de votos
	 * em branco; Como finalizador do conjunto de votos, tem-se o valor de código
	 * igual à 0.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println(
				"Informe os votos conforme os seguintes códigos: " + "\n1 - Eddard Stark" + "\n2 - Cersei Lannister"
						+ "\n3 - Daenerys Targaryen" + "\n4 - Stannis Baratheon" + "\n5 - Voto em branco");

		int voto, count1 = 0, count2 = 0, count3 = 0, count4 = 0, countEmBranco = 0, countNulo = 0;

		do {
			voto = read.nextInt();

			switch (voto) {
			case 0:
				System.out.println("Saiu!");
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			case 5:
				countEmBranco++;
				break;
			default:
				countNulo++;
				break;
			}

		} while (voto != 0);
		
		System.out.println("A quantidade de votos para Eddard Stark foi : " + count1);
		System.out.println("A quantidade de votos para Cersei Lannister foi : " + count2);
		System.out.println("A quantidade de votos para Daenerys Targaryen foi : " + count3);
		System.out.println("A quantidade de votos para Stannis Baratheon foi : " + count4);
		System.out.println("A quantidade de votos em branco : " + countEmBranco);
		System.out.println("A quantidade de votos nulos foi: " + countNulo);
		

	}

}
