package codigos;

import java.util.Scanner;

public class Davi9 {

	//Faça um programa que calcule e imprima a soma e a média de N números digitados pelo usuário. O valor
	//de N deve ser fornecido pelo usuário.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Informe a quantidade n�meros: ");
		int n = read.nextInt();
		
		double sum = 0, avg = 0;
		for(int i = 0; i < n; i++) {
			double num = read.nextDouble();
			sum+=num;
		}
		avg = sum/n;
		
		System.out.println("A soma dos números é: "+sum);
		System.out.println("A média dos números é: "+avg);
	}

}
