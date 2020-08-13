package Stream_활용;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));

		int total = bookList.stream().mapToInt(t -> t.getPrice()).sum();
		System.out.println("모든 책의 가격의 합은: " + total + "입니다.");

		System.out.println("-책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력-");
		bookList.stream().filter(f -> f.getPrice() >= 20000).map(f -> f.getName()).sorted()
				.forEach(f -> System.out.println(f));
	}
}