package codigos;

import java.util.Scanner;

public class Davi15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		System.out.println("Informe o númetro de elementos da sequência que deseja saber");
		int n = read.nextInt();
		
		int f1 = 0, f2 = 1;
		StringBuilder mensagem = new StringBuilder();
	

		for(int i = 0; i < n; i++) {
			mensagem.append(f1 + " ");
			int auxNext = f1 + f2;
			f1 = f2;
			f2 = auxNext;
		}

		System.out.println(mensagem);
	}

}
