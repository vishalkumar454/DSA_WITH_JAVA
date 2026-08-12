package Array;

public class AddElementOnIndex {
	
	public static int[] addElement(int position, int element, int[] arr) {
		int[] newArr = new int[arr.length + 1];
		int j = 0;
		
		for (int i = 0; i < newArr.length; i++) {
			if(i == position) {
				newArr[i] = element;
			}else {
				newArr[i] = arr[j];
				j++;
			}
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,8,9,55,4,3,2,23};
		int[] newArr = addElement(1, 20, arr);
		
		System.out.println("old array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("old array length " + arr.length);
		System.out.println("---------------------------");
		
		System.out.println("new array");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		System.out.println("new array length " + newArr.length);
		System.out.println("---------------------------");
		
	}
}
