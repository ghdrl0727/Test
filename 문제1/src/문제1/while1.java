package ¹®Á¦1;

public class while1 {

	public static void main(String[] args) {

		int loopCount = 0;
		while (true) {
			int i = (int) ((Math.random() * 10) + 1);
			int j = (int) ((Math.random() * 10) + 1);
			int k = (int) ((Math.random() * 10) + 1);
			if ((i != j) && (i != k) && (j != k)) {
				System.out.println("(" + i + ' ' + j + ' ' + k + ") ");
				break;
			}
		}
	}
}
