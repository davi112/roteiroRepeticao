package codigos;

import java.util.Scanner;

public class Davi19 {

	/*
	 * Faça um programa que deve solicitar números para o usuário até que seja
	 * digitado -1. Quando o usuário digitar -1, o programa termina e imprime a
	 * média de todos os números positivos digitados.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		double num = 0, sum = 0, counter = 0, avg = 0;
		while (num != -1) {
			System.out.println("Informe os números");
			num = read.nextInt();

			if (num >= 0) {
				sum += num;
				counter++;
			}
		}
		avg = sum / counter;
		System.out.println("Média dos números positivos: " + avg);
	}

}
