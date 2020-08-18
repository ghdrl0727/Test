package 문제1;

public class for_If {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;

		for (i = 0; i < 101; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("1~100의 홀수합: " + sum);
	}
}
