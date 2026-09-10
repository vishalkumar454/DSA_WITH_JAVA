package array.leetcode;

public class NonZeroElement {

	public static void nonZero(int arr[]) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			while (arr[i] != 0) {
				i++;
			}
			while (arr[j] == 0) {
				j--;
			}

			if(i < j) {
				int swap = arr[i];
				arr[i] = arr[j];
				arr[j] = swap;

				i++;
				j--;
			}

		}
	}

	public static void main(String[] args) {

//		int arr[] = {4,2,0,7,0,9,5};

		int arr[] = { 4, 2, 0, 7, 0, 9, 0 };

		nonZero(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
