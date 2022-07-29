package codigos;

import java.util.Scanner;

public class Davi21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o número");
		int num = read.nextInt();
		int multiplier = 1;
		int invertido = 0, auxInvertido = num;
		
		while(num > 0) {
			int dig = num % 10;
			num/=10;
			
			invertido = (invertido * 10) + dig;  

		}
		
		if(invertido == auxInvertido) {
			System.out.println("É palíndromo");
		}
		else {
			System.out.println("Não é palíndromo");
		}
	}

}
