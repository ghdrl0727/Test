package 문제2;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		System.out.println("--겹치는 수가 없는 로또 만들기--");

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j <= i - 1; j++) {
				if (lotto[i] == lotto[j]) {
					lotto[j] = (int) (Math.random() * 45) + 1;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			Arrays.sort(lotto);
			System.out.print("*" + lotto[i] + "* ");
		}
	}
}
