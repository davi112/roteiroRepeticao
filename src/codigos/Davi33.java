package codigos;

import java.util.Scanner;

public class Davi33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		long cpf = read.nextLong();

		int digitoVerificador1, digitoVerificador2, aux = 0, sum1 = 0, sum2 = 0, multiplier = 2;

		digitoVerificador2 = (int) (cpf % 10);
		cpf/=10;
		
		digitoVerificador1 = (int) (cpf % 10);
		cpf/=10;
		
		while (cpf > 0) {
			aux = (int) cpf % 10;
			cpf /= 10;
			sum1 += (aux * multiplier);
			sum2 += (aux * (multiplier + 1));
			multiplier++;
		}

		int res = sum1 % 11;

		int aux1 = 0, aux2 = 0;
		if (res < 2) {
			aux1 = 0;
		} else {
			aux = 11 - res;
		}

		sum2 += ( digitoVerificador1 * 2 );
		res = sum2 % 11;
		
		if(res < 2) {
			aux2 = 0;
		}
		else {
			aux2 = 11 - res;
		}
		
		if(digitoVerificador1 == aux1 && digitoVerificador2 == aux2) {
			System.out.println("CPF válido !");
		}
		else {
			System.out.println("CPF inválido !");
		}
		
	}

}
