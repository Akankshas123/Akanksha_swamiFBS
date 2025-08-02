package p1;

public class Prime {

	public static void main(String[] args) {
		int[] arr = {10, 33, 11, 7, 13};
		int size = arr.length;

		System.out.println("Prime numbers in array:");

		for (int i = 0; i < size; i++) {
			int flag = 0;

				for (int j = 2; j <= arr[i] / 2; j++) {
					if (arr[i] % j == 0) {
						flag = 1;
						break;
					}
				}
			

			if (flag == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
