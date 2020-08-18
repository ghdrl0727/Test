package 문제3;

public class Example2 {

	public static void main(String[] args) {

		System.out.println("2~10000까지 친화수 구하기");

		int[] nums = new int[10000];
		int sum = 0;
		int[] intArr = new int[10000];

		for (int a = 2; a < nums.length; a++) {
			nums[a] = a + 2;
		}

		int total = 0;
		for (int b = 2; b < nums.length; b++) {
			sum = 0;
			for (int i = 1; i < nums[b]; i++) {
				if (nums[b] % i == 0) {
					sum += i;
				}
			}
			intArr[b] = sum;
		}

		int count = 0;
		for (int j = 0; j < intArr.length; j++) {
			for (int k = 0; k < nums.length; k++) {
				if (intArr[j] == nums[k] && intArr[k] == nums[j] && nums[k] != intArr[k]) {
					count++;
					System.out.println((j + 2) + " : " + nums[k]);
					total += nums[k];
				}
			}
		}
	}
}
