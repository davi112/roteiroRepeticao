package codigos;

import java.util.Scanner;

public class Davi13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		int n = read.nextInt();
		int cont = 0;
		
		for(int i = 1; i <= n; i++ ){
			if(n % i == 0) {
				cont++;
			}
		}
		
		if(cont > 2) {
			System.out.println("Não é primo");
		}else {
			System.out.println("É primo");
		}
		
		
	}

}
