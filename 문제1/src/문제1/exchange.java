package 문제1;

import java.util.Scanner;

public class exchange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----환전-----");
		
		System.out.println("환전할 금액을 입력하시요.");
		int KRW = scanner.nextInt();
		
		System.out.println("-------------------");
		
		System.out.println("환전을 선택하시오.");
		System.out.println("1. 달러환전(USD) " + "2. 엔 환전(JPY)");
		int exchange = scanner.nextInt();
		
		System.out.println("-------------------");
		
		if (exchange == 1) {
			System.out.println("달러환전(USD)");
			System.out.println("환전 할 금액은: " + KRW);
			double USD = (double) KRW / 1113.0;
			System.out.println("달러 환전 금액은: " + USD + '$');
		} else {
			System.out.println("엔 환전(JPY)");
			System.out.println("환전 할 금액은: " + KRW);
			double JPY = (double) KRW / 10.0624;
			System.out.println("엔 환전 금액은: " + JPY + '￥');
		}

	}

}
