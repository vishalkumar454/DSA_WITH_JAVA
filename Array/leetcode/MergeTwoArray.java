package array.leetcode;

public class MergeTwoArray {
	
	public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
		
		int[] arr = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr[k++] = arr1[k++];
				
			}else {
				arr[k++] = arr2[j++];
			}
		}
		
		// stores remaining elements
		
		while(i < arr1.length) {
			arr[k++] = arr1[k++];
		}
		
		while(j < arr2.length) {
			arr[k++] = arr2[j++];
		}
		
		return arr;
	}
}

