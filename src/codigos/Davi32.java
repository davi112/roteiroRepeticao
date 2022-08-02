
public class Davi32 {

	/*
	 * Escrever um algoritmo que gera e escreve os 5 primeiros números perfeitos. Um
	 * número perfeito é aquele que é igual a soma dos seus divisores. (Ex.: 6 =
	 * 1+2+3; 28= 1+2+4+7+14 etc).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * O número a ser testado começa em 1 e é incrementado para ser testado
		 * novamente a cada repetição.
		 *
		 * sumDividers começa em 1, pois 1 já divide todos os números, logo já está
		 * sendo considerado na soma dos divisores de num. Nesse caso, a repetição do for pode 
		 * começar em 2, pois o caso num % 1 == 0 não precisa ser testado.  
		 *
		 * A repetição acontece até a quantidade de números perfeitos ser 5, ou seja, a cada
		 * número perfeito encontrado, a variável contPerfectNumbers é incrementada em 1. 
		 * O uso do while é recomendado nesse caso, pois não se sabe quantas repetições serão feitas,
		 * já que o programa irá testar uma quantidade desconhecida de números até encontrar o 5º número,
		 * e somente nesse momento deverá parar. 
		 * 
		 * Ao final do bloco dentro do while, antes da próxima iteração começar, é necessário reiniciar
		 * os valores de sumDividers para 1, para que ela possa armazenar só a soma dos divisores do próximo
		 * número na repetição seguinte. Caso não fosse feito isso, o programa acumularia a soma dos divisores de todos os números.
		 * Além disso,é preciso incrementar o número em 1, para que ele assuma o valor do próximo númeroa ser testado.
		 * 
		 * Assim como no exercício dos números, a repetição para encontrar os divisores exatos de um número
		 * precisa ir só até metade do número, afinal, é o maior divisor possível do número com exceção dele mesmo.
		 * Dessa forma, a quantidade de repetições do programa é reduzida. Ainda assim, o programa demora 
		 * muito para encontrar o 5º número perfeito, devido a quantidade de repetições que realiza até encontrá-lo.
		 * Ainda assim, o código funciona. 
		 */
		int num = 2, sumDividers = 1, countPerfectNumbers = 0;

		while (countPerfectNumbers < 5) {
			
			//pega a soma dos divisores do número testado a cada repetição;
			for (int i = 2; i <= (num / 2); i++) {
				if (num % i == 0) {
					sumDividers+=i;
				}
			}
			
			//Testa se o número é perfeito
			if(num == sumDividers) {
				countPerfectNumbers++;
				System.out.println(countPerfectNumbers+"º Número perfeito encontrado: " + num);
			}
			
			num++;
			sumDividers = 1;
		}
	}

}
