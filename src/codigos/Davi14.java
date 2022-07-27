package codigos;

import java.util.Scanner;

public class Davi14 {

	/*
	 * Fa�a um programa que calcule e imprima o fatorial do valor N. O valor de N ser� fornecido de entrada
	pelo usu�rio. O fatorial de um n�mero positivo N qualquer (representado por N!) � o produto de todos os
	inteiros positivos menores ou iguais � N, ou seja, Fatorial (N) = 1 * 2 * 3 * ... * N. Por exemplo, o
	fatorial de 5 = 1*2*3*4*5 = 120.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Informe o n�mero: ");
		int num = read.nextInt();
		
		int fatorial = 1;
		for(int i = num; i >= 1; i--) {
			fatorial *= i;
		}
		System.out.println("O fatorial do n�mero "+ num + " �: "+fatorial);
	}

}
