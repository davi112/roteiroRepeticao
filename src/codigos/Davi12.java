package codigos;

import java.util.Scanner;

public class Davi12 {

	/*
	 * 
	 * No �ltimo ano foi realizada um estudo estat�stico sobre acidentes de tr�nsito
	 * em 5 cidades brasileiras. Para isso os seguintes dados foram coletados: a)
	 * Nome da cidade (String ou char). b) N�mero de ve�culos c) N�mero de acidentes
	 * de tr�nsito Com esses dados deseja-se saber: a) O maior e o menor �ndice de
	 * acidentes e o nome da cidade a que pertencem b) A raz�o entre quantidade de
	 * acidentes por quantidade de ve�culos nas 5 cidades analisadas c) A m�dia de
	 * ve�culos nas cinco cidades d) A m�dia de acidentes de tr�nsito nas cidades
	 * com menos de 200 ve�culos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		String nomeCid, nomeMaior = null, nomeMenor = null;
		int vei, aci, maior = 0, menor = 0, somaAci = 0, somaVei = 0, soma200 = 0, qtd200 = 0;
		double mediaVei = 0, media200 = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o nome da " + i + "� cidade");
			nomeCid = read.nextLine();

			System.out.println("Digite a quantidade de ve�culos de " + nomeCid);
			vei = read.nextInt();

			System.out.println("Digite a quantidade de acidentes em " + nomeCid);
			aci = read.nextInt();

			read.nextLine();

			somaAci += aci;
			somaVei += vei;

			if (vei < 200) {
				soma200 += aci;
				qtd200++;
			}

			if (i == 1) {
				maior = aci;
				nomeMaior = nomeCid;
				menor = aci;
				nomeMenor = nomeCid;
			} else {
				if (aci > maior) {
					maior = aci;
					nomeMaior = nomeCid;
				}
				if (aci < menor) {
					menor = aci;
					nomeMenor = nomeCid;
				}
			}

		}
		System.out.println("A cidade com mais acidentes �: "+ nomeMaior + " com "+ maior + " acidentes");
		System.out.println("A cidade com menos acidentes �: " + nomeMenor + " com " + menor + " acidentes");
		System.out.println("O �ndice de acidentes nas 5 cidades no total �: "+ (double) somaAci / somaVei);
		if(qtd200 != 0) {
			media200 = soma200 / qtd200;
		}
		mediaVei = somaVei / 5;
		System.out.println("A m�dia de ve�culos nas 5 cidades �: " + mediaVei);
		System.out.println("A m�dia de acidentes nas cidades com menos de 200 ve�culos �: " + media200);
	}

}
