package codigos;

import java.util.Scanner;

public class Davi8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Informe a quantidade n�meros: ");
		int n = read.nextInt();

		double sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum - (1.0 / i);
			} else {
				sum = sum + (1.0 / i);
			}
		}

		System.out.println("A soma é: " + sum);
	}

}
