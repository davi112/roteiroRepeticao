import java.util.Scanner;

public class Davi22 {

	/*
	 * Sabe-se que um país A possui 500000 habitantes e uma taxa de natalidade de 3%
	 * ao ano, já o país B possui 700000 habitantes e uma taxa de natalidade de 2%
	 * ao ano. Escreva um algoritmo, sabendo que estamos no ano de 2015, que calcule
	 * em que ano a população do país A ultrapassará a população de B.
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
      
      System.out.println("A população de A será maior em: " + ano);
      
	}

}
