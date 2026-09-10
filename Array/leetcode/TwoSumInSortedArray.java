package array.leetcode;

public class TwoSumInSortedArray {

	public static int[] twoSumSortedArray(int arr[], int target) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			int sum = arr[i] + arr[j];

			if (sum == target) {
				return new int[] { i + 1, j + 1 };
			} else if (sum < target) {
				i++;
			} else {
				j--;
			}
		}
		return new int[] { -1, -1 };

	}

	public static int[] twoSubArray(int arr[], int target) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			int sum = arr[i] - arr[j];

			if (sum == target) {
				return new int[] { i + 1, j + 1 };
			} else if (sum > target) {
				i++;
			} else {
				j--;
			}
		}
		return new int[] { -1, -1 };

	}

}
