package codigos;

import java.util.Scanner;

public class Davi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Soma :" + sum);
		System.out.println("Média: " + (double) sum / n);
	}
}
