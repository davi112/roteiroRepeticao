package codigos;

import java.util.Scanner;

public class Davi17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um núimero: ");
		int num1 = read.nextInt();
		
		System.out.println("Digite um número: ");
		int num2 = read.nextInt();
		
		int aux = 0;
		if(num2 > num1) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		while(num2 != 0) {
			aux = num1 % num2;
			num1 = num2;
			num2 = aux;
		}
		System.out.println("MDC: " + num1);
		
	}

}
