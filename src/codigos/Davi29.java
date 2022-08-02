import java.util.Scanner;

public class Davi29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Digite dois n�meros positivos: ");

		int a = read.nextInt();
		int b = read.nextInt();

		/*
		 * Divis�o pode ser entendida como quantas vezes B est� contido em A
		 * Ex.: 4 / 2 = 2, pois 2 est� contido duas vezes em 4
		 * 
		 * Logo, para obtermos o quociente, isto �, o resultado da divis�o de A por B,
		 * basta fazer a subtra��o A - B de forma acumulativa e contar quantas vezes essa opera��o 
		 * � feita at� que o resultado seja menor do que B, ou seja, at� quando o m�ximo de vezes
		 * que B cabe dentro de A for atingido. O quociente � justamente a quantidade de vezes que
		 * a opera��o � feita, e o resto � o �ltimo resultado da subtra��o.
		 * Ex. : 5 / 2 
		 * a = 5; b = 2;
		 * 
		 * a - b = 5 - 2 = 3  (1� vez)
		 * 
		 * Como 3 > 2, realizamos outra subtra��o , agora com 3 no lugar de 5, pois � o que
		 * sobrou da primeira subtra��o:
		 * 
		 * 3 - 2 = 1  (2� vez) 
		 * 
		 * Repare que o resultado da segunda subtra��o � 1, ou seja, menor do que B, pois 1 < 2.
		 * isso significa que o m�ximo de vezes que 2 cabe dentro de 5 foi atingido (2 vezes)
		 * e o resto, portanto, � igual a 1.
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
		
		System.out.println("O quociente da divis�o de A por B �: " + quociente);
		System.out.println("O resto da divis�o de A por B � : " + resto);
	}
}
