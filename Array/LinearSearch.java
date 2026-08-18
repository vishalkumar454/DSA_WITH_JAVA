gpackage Array;

class LinearSearch {

	public static int linearSearch(int arr[], int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int linearSearch(String menuList[], String key) {

		for (int i = 0; i < menuList.length; i++) {
			if (menuList[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int number[] = { 2, 4, 6, 8, 10, 12, 14, 15, 16, 18, 20 };
		int key = 30;

		int index = linearSearch(number, key);

		if (index == -1) {
			System.out.println("NOT FOUND");
		} else {
			System.out.println("key is at index " + index);
		}

		// for 2nd method

		String menuList[] = { "dosa", "samosa", "chocolate", "bhel puri", "aalu paratha" };
		String key1 = "chocolate";

		int result = linearSearch(menuList, key1);

		if (result == -1) {
			System.out.println("NOT FOUND");

		} else {
			System.out.println("KEY FOUND at index : " + result);
		}
	}
}
