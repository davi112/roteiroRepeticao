package codigos;

import java.util.Scanner;

public class Davi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		double num = read.nextDouble();

		while (num != -999) {
			System.out.println("Triplo de " + num + ": " + num * 3);
			num = read.nextDouble();
		}

	}

}
