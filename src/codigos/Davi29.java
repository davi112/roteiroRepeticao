import java.util.Scanner;

public class Davi29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Digite dois números positivos: ");

		int a = read.nextInt();
		int b = read.nextInt();

		/*
		 * Divisão pode ser entendida como quantas vezes B está contido em A
		 * Ex.: 4 / 2 = 2, pois 2 está contido duas vezes em 4
		 * 
		 * Logo, para obtermos o quociente, isto é, o resultado da divisão de A por B,
		 * basta fazer a subtração A - B de forma acumulativa e contar quantas vezes essa operação 
		 * é feita até que o resultado seja menor do que B, ou seja, até quando o máximo de vezes
		 * que B cabe dentro de A for atingido. O quociente é justamente a quantidade de vezes que
		 * a operação é feita, e o resto é o último resultado da subtração.
		 * Ex. : 5 / 2 
		 * a = 5; b = 2;
		 * 
		 * a - b = 5 - 2 = 3  (1ª vez)
		 * 
		 * Como 3 > 2, realizamos outra subtração , agora com 3 no lugar de 5, pois é o que
		 * sobrou da primeira subtração:
		 * 
		 * 3 - 2 = 1  (2ª vez) 
		 * 
		 * Repare que o resultado da segunda subtração é 1, ou seja, menor do que B, pois 1 < 2.
		 * isso significa que o máximo de vezes que 2 cabe dentro de 5 foi atingido (2 vezes)
		 * e o resto, portanto, é igual a 1.
		 *
		 * 
		 */
		
		int resto = a; 
		int quociente = 0;

		if (a > 0 && b > 0) {
			do {
				resto -= b;
				quociente++;
			} while (resto > b);
		}
		
		System.out.println("O quociente da divisão de A por B é: " + quociente);
		System.out.println("O resto da divisão de A por B é : " + resto);
	}
}
