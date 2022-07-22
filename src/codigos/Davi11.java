package codigos;

import java.util.Scanner;

public class Davi11 {

	/*
	 * Faça um programa que leia a nota e o nome de N alunos na prova de algoritmos
	 * e imprima a maior e a menor nota computada e qual aluno tirou tais notas.
	 * Além disso, calcule e imprima também a soma e a média de todas as notas.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Informe a quantidade de alunos");
		int n = read.nextInt();
		read.nextLine();

		double maior = 0, menor = 0, sum = 0, avg = 0;
		String alunoComMaiorNota = null, alunoComMenorNota = null;

		
		System.out.println("Informe os nomes e as notas dos alunos: ");
		for (int i = 0; i < n; i++) {
			String name = read.nextLine();
			double grade = read.nextDouble();
			read.nextLine();
			
			if (i == 0) {
				maior = grade;
				alunoComMaiorNota = name;
				menor = grade;
				alunoComMenorNota = name;
			} else {
				if (grade > maior) {
					maior = grade;
					alunoComMaiorNota = name;
				}
				if (grade < menor) {
					menor = grade;
					alunoComMenorNota = name;
				}
			}
			sum += grade;

		}
		avg = sum / n;
		System.out.println("O aluno com a maior nota foi " + alunoComMaiorNota + " e sua nota foi: " + maior);
		System.out.println("O aluno com a menor nota foi " + alunoComMenorNota + " e sua nota foi: " + menor);
		System.out.println("A soma das notas é : " + sum);
		System.out.println("A média da notas é  :" + avg);
	}

}
