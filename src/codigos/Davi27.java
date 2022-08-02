import java.util.Scanner;

public class Davi27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe a altura do triângulo");
		Scanner read = new Scanner(System.in);
		int altura = read.nextInt();
		
		for(int i = 1; i <= altura; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
	}

}
