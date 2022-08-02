import java.util.Scanner;

public class Davi28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe um número inteiro positivo");
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();

		if (num >= 0) {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
				System.out.println();
			}
		}else {
			System.out.println("Número inválido !");
		}

	}

}
