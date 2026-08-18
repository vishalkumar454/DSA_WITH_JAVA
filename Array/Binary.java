package Array;

class Binary {

	public static int binarySearch(int[] arr, int element) {

		int initalIndex = 0;
		int lastIndex = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			int mid = (initalIndex + lastIndex) / 2;

			if (arr[mid] > element) {
				lastIndex = mid - 1;
			} else if (arr[mid] < element) {
				initalIndex = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int BinaryNum[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23 };
		
		int key = 1;

		System.out.println("the key present at index " + binarySearch(BinaryNum, key));
	}

}
