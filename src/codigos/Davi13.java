import java.util.Scanner;

public class Davi13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		System.out.println("Informe o número: ");
		int n = read.nextInt();
		int cont = 0;

		/*
		 * o maior divisor de um número, com a exceção dele mesmo, é a sua metade. Ou
		 * seja, não há a necessidade de iterar o código até o próprio número, mas sim
		 * até metade do número (n/2). Logo, se houver mais de um divisor para o número 
		 * no intervalo de [1, (n/2)], o número NÃO é primo, caso contrário, é primo.
		 * 
		 * A repetição poderia ser feita até N e o código também funcionaria, com a condição
		 * de que se há mais de 2 divisores no intervalo [1, N], o número não é primo, caso
		 * contrário, é primo. A principal diferença, nesse caso, é a quantidade de repetições
		 * que seriam feitas, isto é, utilizando a repetição até N/2, menos repetições serão
		 * feitas para atingir o mesmo resultado, ou seja, o custo do algoritmo é menor.
		 */
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				cont++;
			}
		}

		if (cont > 1) {
			System.out.println("Não é primo");
		} else {
			System.out.println("É primo");
		}

	}

}
