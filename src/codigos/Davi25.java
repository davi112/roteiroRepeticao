
public class Davi25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int K = 3;
		double s = 0, pi;
		boolean switchOperador = false;

		for (int i = 1; i <= 51 * 2; i += 2) {
			if (!switchOperador) {
				s += (1 / (Math.pow(i, K)));
				switchOperador = true;
			} else {
				s -= (1 / (Math.pow(i, K)));
				switchOperador = false;
			}
		}

		pi = Math.pow((s * 32), (1.0 / 3));
		System.out.println(pi);

	}

}
