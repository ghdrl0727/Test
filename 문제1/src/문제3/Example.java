package 문제3;

public class Example {

	public static void main(String[] args) {

		System.out.println("2~10000까지 친화수 구하기");
		int a;
		int b;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 2; i <= 10000; i++) {
			a = i;
			for (int j = 2; j <= i; j++) {
				if ((sum1 - i) == i && a % j == 0) {
					sum1 = sum1 + j;
				}
			}
			for (int k = 2; k <= 10000; k++) {
				b = k;
				for (int v = 2; v <= k; v++) {
					if ((sum2 - k) == k && b % k == 0) {
						sum2 = sum2 + k;
					}
					if (sum1 == sum2) {
						System.out.println("(" + sum1 + ", " + sum2 + ")");
					}
				}
			}
		}
	}
}