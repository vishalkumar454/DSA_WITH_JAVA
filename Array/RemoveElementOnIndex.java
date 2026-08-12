package Array;

public class RemoveElementOnIndex {
	public static int[] removeElement(int element, int[] arr) {

		int[] newArr = new int[arr.length - 1];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				newArr[j] = arr[i];
				j++;
			}
		}
		return newArr;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 6, 7, 8, 9, 11, 2, 21, 34, 53, 664 };
		int[] newArr = removeElement(664, arr);

		System.out.println("old array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		System.out.println("old array length " + arr.length);

		System.out.println("---------------------------");

		System.out.println("new array");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		System.out.println("new array length " + newArr.length);
		System.out.println("---------------------------");

		System.out.println("--------------------------->");

		int[] newArr1 = removeElement(53, newArr);

		System.out.println("old array");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}

		System.out.println();
		System.out.println("old array length " + newArr.length);

		System.out.println("---------------------------");

		System.out.println("new array");
		for (int i = 0; i < newArr1.length; i++) {
			System.out.print(newArr1[i] + " ");
		}
		System.out.println();
		System.out.println("new array length " + newArr1.length);
		System.out.println("---------------------------");

	}

}
