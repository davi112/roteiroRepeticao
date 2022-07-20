package codigos;

import java.util.Scanner;

public class Davi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Informe a quantidade números: ");
		int n = read.nextInt();
		
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + (1.0/i);
		}
		
		System.out.println("A soma é: "+sum);
	}

}
