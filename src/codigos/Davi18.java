package codigos;

import java.util.Scanner;

public class Davi18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 5) {
			
			Double num1, num2;
			System.out.println("Informe o primeiro número");
			num1 = read.nextDouble();

			System.out.println("Informe o segundo número");
			num2 = read.nextDouble();
			
			System.out.println("Informe qual opção você deseja");
			opcao = read.nextInt();			

			if (realizaOperacoes(opcao, opcao, opcao) != null) {
				System.out.println("O resultado é: " + realizaOperacoes(opcao, num1, num2));
			}

		}

	}

	public static Double realizaOperacoes(int opcao, double n1, double n2) {
		switch (opcao) {
		case 1:
			return n1 + n2;
		case 2:
			return n1 - n2;
		case 3:
			return n1 * n2;
		case 4:
			if (n2 != 0) {
				return n1 / n2;
			} else {
				System.out.println("Divisão por 0");
				return null;
			}
		case 5:
			System.out.println("Saiu !");
			System.exit(0);
			return null;
		default:
			System.out.println("Operação inválida");
			return null;
		}

	}

}
