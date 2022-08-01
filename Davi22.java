import java.util.Scanner;

public class Davi22 {

	/*
	 * Sabe-se que um pa�s A possui 500000 habitantes e uma taxa de natalidade de 3%
	 * ao ano, j� o pa�s B possui 700000 habitantes e uma taxa de natalidade de 2%
	 * ao ano. Escreva um algoritmo, sabendo que estamos no ano de 2015, que calcule
	 * em que ano a popula��o do pa�s A ultrapassar� a popula��o de B.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double taxaA = 0.03, popA = 500000;
      double taxaB = 0.02, popB = 700000;
      int ano = 2015;
      
      while(popA <= popB) {
    	  popA += popA * taxaA;
    	  popB += popB * taxaB;
    	  ano++;
      }
      
      System.out.println("A popula��o de A ser� maior em: " + ano);
      
	}

}
