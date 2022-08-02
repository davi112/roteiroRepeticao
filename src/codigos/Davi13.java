import java.util.Scanner;

public class Davi13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		System.out.println("Informe o n�mero: ");
		int n = read.nextInt();
		int cont = 0;

		/*
		 * o maior divisor de um n�mero, com a exce��o dele mesmo, � a sua metade. Ou
		 * seja, n�o h� a necessidade de iterar o c�digo at� o pr�prio n�mero, mas sim
		 * at� metade do n�mero (n/2). Logo, se houver mais de um divisor para o n�mero 
		 * no intervalo de [1, (n/2)], o n�mero N�O � primo, caso contr�rio, � primo.
		 * 
		 * A repeti��o poderia ser feita at� N e o c�digo tamb�m funcionaria, com a condi��o
		 * de que se h� mais de 2 divisores no intervalo [1, N], o n�mero n�o � primo, caso
		 * contr�rio, � primo. A principal diferen�a, nesse caso, � a quantidade de repeti��es
		 * que seriam feitas, isto �, utilizando a repeti��o at� N/2, menos repeti��es ser�o
		 * feitas para atingir o mesmo resultado, ou seja, o custo do algoritmo � menor.
		 */
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				cont++;
			}
		}

		if (cont > 1) {
			System.out.println("N�o � primo");
		} else {
			System.out.println("� primo");
		}

	}

}
