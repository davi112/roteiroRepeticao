package codigos;

import java.util.Scanner;

public class Davi20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		double num, sumOdd = 0, sumEven = 0, counterOdd = 0, counterEven = 0, avgOdd = 0, avgEven = 0, bigger = 0,
				lower = 0;
		System.out.println("Informe os números");

		do {
			num = read.nextInt();

			if (num % 2 == 0) {
				sumOdd += num;
				counterOdd++;

				if (counterOdd == 1) {
					bigger = num;
				} else if (num > bigger) {
					bigger = num;
				}
			} else {
				sumEven += num;
				counterEven++;

				if (counterEven == 1) {
					lower = num;
				} else if (num < lower && num > 0) {
					lower = num;
				}
			}

		} while (num >= 0);

		avgOdd = sumOdd / counterOdd;
		avgEven = sumEven / counterEven;
		if (avgOdd > 0 && avgEven > 0) {
			System.out.println("Média dos números pares positivos: " + avgOdd);
			System.out.println("Média dos números ímpares positivos: " + avgEven);
			System.out.println("Maior número par" + bigger);
			System.out.println("Menor número ímpar " + lower);
		}

	}

}
