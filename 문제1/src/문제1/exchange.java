package ����1;

import java.util.Scanner;

public class exchange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----ȯ��-----");
		
		System.out.println("ȯ���� �ݾ��� �Է��Ͻÿ�.");
		int KRW = scanner.nextInt();
		
		System.out.println("-------------------");
		
		System.out.println("ȯ���� �����Ͻÿ�.");
		System.out.println("1. �޷�ȯ��(USD) " + "2. �� ȯ��(JPY)");
		int exchange = scanner.nextInt();
		
		System.out.println("-------------------");
		
		if (exchange == 1) {
			System.out.println("�޷�ȯ��(USD)");
			System.out.println("ȯ�� �� �ݾ���: " + KRW);
			double USD = (double) KRW / 1113.0;
			System.out.println("�޷� ȯ�� �ݾ���: " + USD + '$');
		} else {
			System.out.println("�� ȯ��(JPY)");
			System.out.println("ȯ�� �� �ݾ���: " + KRW);
			double JPY = (double) KRW / 10.0624;
			System.out.println("�� ȯ�� �ݾ���: " + JPY + '��');
		}

	}

}
