package codigos;

import java.util.ArrayList;
import java.util.Scanner;

public class Davi16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Informe o número binário: ");
		int bin = read.nextInt();

		int aux = 0, exp = 0;
		int decimal = 0, octal = 0;
		String hexaDecimal = "";
		boolean isBinario = true;

		while (bin > 0) { // enquanto bin > 0, iremos fazer sucessivas divisões inteiras por 10 para
							// extrair os dígitos do númeor
			aux = bin % 10;
			if (aux != 0 && aux != 1) {
				isBinario = false;
				System.out.println("O número digitado não é binário");
				break;
			}
			bin /= 10;
			decimal += aux * Math.pow(2, exp);
			exp++;
		}

		if (isBinario) {
			System.out.println("Decimal " + decimal);
			int auxDecimal = decimal;
			int multiplier = 1;
			while (decimal > 0) {
				aux = decimal % 8;
				decimal = decimal / 8;
				octal += (aux * multiplier);
				multiplier *= 10;
			}
			System.out.println("Octal: " + octal);

			while (auxDecimal > 0) {
				aux = auxDecimal % 16;
				auxDecimal = auxDecimal / 16;

				switch (aux) {
				case 10:
					hexaDecimal = "A" + hexaDecimal;
				case 11:
					hexaDecimal = "B" + hexaDecimal;
				case 12: 
					hexaDecimal = "C" + hexaDecimal;
				case 13:
					hexaDecimal = "D" + hexaDecimal;
				case 14:
					hexaDecimal = "E" + hexaDecimal;
				case 15:
					hexaDecimal = "F" + hexaDecimal;
				default:
					hexaDecimal = aux + hexaDecimal;
				}
			}
			System.out.println("Hexadecimal " + hexaDecimal);

		}
	}
}
