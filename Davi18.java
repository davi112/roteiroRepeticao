import java.util.Scanner;

public class Davi18 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner read = new Scanner(System.in);
				int opcao = 0;
				

				while (opcao != 5) {
					System.out.println("Informe qual op��o voc� deseja");
					opcao = read.nextInt();			

					Double resultado = realizaOperacoes(opcao, read);
					
					if (resultado != null) {
						System.out.println("O resultado �: " + resultado);
					}

				}

			}

			public static Double realizaOperacoes(int opcao, Scanner read) {
				Double n1, n2;
				switch (opcao) {
				case 1:
					System.out.println("Informe o primeiro n�mero");
					n1 = read.nextDouble();

					System.out.println("Informe o segundo n�mero");
					n2 = read.nextDouble();
					return n1 + n2;
				case 2:
					System.out.println("Informe o primeiro n�mero");
					n1 = read.nextDouble();

					System.out.println("Informe o segundo n�mero");
					n2 = read.nextDouble();
					return n1 - n2;
				case 3:
					System.out.println("Informe o primeiro n�mero");
					n1 = read.nextDouble();

					System.out.println("Informe o segundo n�mero");
					n2 = read.nextDouble();
					return n1 * n2;
				case 4:
					System.out.println("Informe o primeiro n�mero");
					n1 = read.nextDouble();

					System.out.println("Informe o segundo n�mero");
					n2 = read.nextDouble();
					if (n2 != 0) {
						return n1 / n2;
					} else {
						System.out.println("Divis�o por 0");
						return null;
					}
				case 5:
					System.out.println("Saiu !");
					System.exit(0);
					return null;
				default:
					System.out.println("Opera��o inv�lida");
					return null;
				}
	}

}
