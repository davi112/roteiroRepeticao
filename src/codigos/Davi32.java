
public class Davi32 {

	/*
	 * Escrever um algoritmo que gera e escreve os 5 primeiros n�meros perfeitos. Um
	 * n�mero perfeito � aquele que � igual a soma dos seus divisores. (Ex.: 6 =
	 * 1+2+3; 28= 1+2+4+7+14 etc).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * O n�mero a ser testado come�a em 1 e � incrementado para ser testado
		 * novamente a cada repeti��o.
		 *
		 * sumDividers come�a em 1, pois 1 j� divide todos os n�meros, logo j� est�
		 * sendo considerado na soma dos divisores de num. Nesse caso, a repeti��o do for pode 
		 * come�ar em 2, pois o caso num % 1 == 0 n�o precisa ser testado.  
		 *
		 * A repeti��o acontece at� a quantidade de n�meros perfeitos ser 5, ou seja, a cada
		 * n�mero perfeito encontrado, a vari�vel contPerfectNumbers � incrementada em 1. 
		 * O uso do while � recomendado nesse caso, pois n�o se sabe quantas repeti��es ser�o feitas,
		 * j� que o programa ir� testar uma quantidade desconhecida de n�meros at� encontrar o 5� n�mero,
		 * e somente nesse momento dever� parar. 
		 * 
		 * Ao final do bloco dentro do while, antes da pr�xima itera��o come�ar, � necess�rio reiniciar
		 * os valores de sumDividers para 1, para que ela possa armazenar s� a soma dos divisores do pr�ximo
		 * n�mero na repeti��o seguinte. Caso n�o fosse feito isso, o programa acumularia a soma dos divisores de todos os n�meros.
		 * Al�m disso,� preciso incrementar o n�mero em 1, para que ele assuma o valor do pr�ximo n�meroa ser testado.
		 * 
		 * Assim como no exerc�cio dos n�meros, a repeti��o para encontrar os divisores exatos de um n�mero
		 * precisa ir s� at� metade do n�mero, afinal, � o maior divisor poss�vel do n�mero com exce��o dele mesmo.
		 * Dessa forma, a quantidade de repeti��es do programa � reduzida. Ainda assim, o programa demora 
		 * muito para encontrar o 5� n�mero perfeito, devido a quantidade de repeti��es que realiza at� encontr�-lo.
		 * Ainda assim, o c�digo funciona. 
		 */
		int num = 2, sumDividers = 1, countPerfectNumbers = 0;

		while (countPerfectNumbers < 5) {
			
			//pega a soma dos divisores do n�mero testado a cada repeti��o;
			for (int i = 2; i <= (num / 2); i++) {
				if (num % i == 0) {
					sumDividers+=i;
				}
			}
			
			//Testa se o n�mero � perfeito
			if(num == sumDividers) {
				countPerfectNumbers++;
				System.out.println(countPerfectNumbers+"� N�mero perfeito encontrado: " + num);
			}
			
			num++;
			sumDividers = 1;
		}
	}

}
