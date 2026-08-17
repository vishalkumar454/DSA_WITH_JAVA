package Array;

public class MaxAndMin {

	public static void max(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println("max = " + max);

		System.out.println("--------------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println();
	}

	public static void min(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("min = " + min);

		System.out.println("--------------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 7, 4, 2, 7, 95, 0, 65 };
		min(arr);
		max(arr);

	}
}
