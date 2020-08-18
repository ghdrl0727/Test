package 문제4;

public class Example {

	public static void main(String[] args) {

		double a = 800000;
		double r = 1.5 / 100 / 12;
		double d = 36;
		double total = 0;

		for (int i = 0; i < d; i++) {
			a = (a * (1 + r));
			total += a;
		}
		System.out.println("입금된 총액: " + (int) total + "원");
	}
}
