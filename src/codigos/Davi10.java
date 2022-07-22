package codigos;

import java.util.Scanner;

public class Davi10 {
	/*
	 * Implemente um algoritmo que receba de entrada N valores digitados pelo
	 * usuário. Dentre os valores digitados, seu programa deve encontrar o menor e o
	 * maior dos valores fornecidos.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Informe a quantidade números: ");
		int n = read.nextInt();

		double maior = 0, menor = 0;
		for (int i = 0; i < n; i++) {
			double num = read.nextDouble();
			if (i == 0) {
				maior = num;
				menor = num;
			} else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}

			}
		}
		System.out.println("Maior " + maior);
		System.out.println("Menor " + menor);
	}

}
