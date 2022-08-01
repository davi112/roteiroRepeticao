import java.util.Scanner;

public class Davi23 {

	/*
	 * Considere uma linha ferrovi�ria entre S�o Paulo e Curitiba. Suponha que uma locomotiva (trem) A parte
de S�o Paulo para Curitiba com velocidade de 30 m/s enquanto que uma outra locomotiva B parte de
Curitiba para S�o Paulo no mesmo instante com velocidade de 40 m/s. Considere a dist�ncia entre S�o
Paulo e Curitiba de 400 Km. Considere tamb�m que as linhas f�rreas s�o paralelas. Implemente um
algoritmo que calcule iterativamente o tempo em que as locomotivas se cruzar�o no caminho. O
algoritmo deve calcular tamb�m a dist�ncia que as locomotivas devem percorrer at� o momento do
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
		System.out.println("A percorrer� " + dA + " metros " + " at� o cruzamento com B "
		+ ", que por sua vez, percorerr� " + (400000 - dB) + " metros at� o cruzamento");
	}
}
