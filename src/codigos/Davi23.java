import java.util.Scanner;

public class Davi23 {

	/*
	 * Considere uma linha ferroviária entre São Paulo e Curitiba. Suponha que uma locomotiva (trem) A parte
de São Paulo para Curitiba com velocidade de 30 m/s enquanto que uma outra locomotiva B parte de
Curitiba para São Paulo no mesmo instante com velocidade de 40 m/s. Considere a distância entre São
Paulo e Curitiba de 400 Km. Considere também que as linhas férreas são paralelas. Implemente um
algoritmo que calcule iterativamente o tempo em que as locomotivas se cruzarão no caminho. O
algoritmo deve calcular também a distância que as locomotivas devem percorrer até o momento do
cruzamento.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		final int VA = 30, VB = 40;
		int dA = 0, dB = 400000, tempo = 0;
		
		while(dA < dB) {
			dA += VA;
			dB -= VB;
			tempo++;
		}
		
		System.out.println("As locomotivas se cruzaram no tempo de " + tempo + " segundos");
		System.out.println("A percorrerá " + dA + " metros " + " até o cruzamento com B "
		+ ", que por sua vez, percorerrá " + (400000 - dB) + " metros até o cruzamento");
	}
}
