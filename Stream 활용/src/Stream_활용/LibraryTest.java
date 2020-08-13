package Stream_Ȱ��;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));

		int total = bookList.stream().mapToInt(t -> t.getPrice()).sum();
		System.out.println("��� å�� ������ ����: " + total + "�Դϴ�.");

		System.out.println("-å�� ������ 20000�� �̻��� å�� �̸��� �����Ͽ� ���-");
		bookList.stream().filter(f -> f.getPrice() >= 20000).map(f -> f.getName()).sorted()
				.forEach(f -> System.out.println(f));
	}
}