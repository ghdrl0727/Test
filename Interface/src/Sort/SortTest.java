package Sort;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬");

		int st = System.in.read();
		Sort sort = null;

		if (st == 'Q' || st == 'q') {
			sort = new QuickSort();
		} else if (st == 'H' || st == 'h') {
			sort = new HeapSort();
		} else if (st == 'B' || st == 'B') {
			sort = new BubbleSort();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}

		int[] arr = { 1, 2, 3, 4, 5 };
		sort.ascending(arr);
		sort.descending(null);
		sort.description();
	}
}
