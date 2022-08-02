import java.util.Scanner;

public class Davi26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe o valor do ângulo em graus: ");
		Scanner read = new Scanner(System.in);
		int x = read.nextInt();
		double sinX = 0;
		boolean switchOperador = false;

		double xRad = (x * Math.PI)/ 180; //Convertendo para radianos
		
		for (int i = 1; i <= 15 * 2; i += 2) {
			if (!switchOperador) {
			//	String aux = xRad + " ^ " + i;
				sinX += ( (Math.pow(xRad, i) / calculaFatorial(i)) );
				switchOperador = true;
			} else {
			//	String aux = x + " ^ " + i;
				sinX -= ( (Math.pow(xRad, i) / calculaFatorial(i)) );
				switchOperador = false;
			}
		}
		
		System.out.printf("sen(%d) : %.2f",x, sinX);
	}

	public static int calculaFatorial(int num) {
		int fatorial = 1;
		for (int i = num; i >= 1; i--) {
			fatorial *= i;
		}
		return fatorial;
	}

}
