package array.leetcode;

public class SegratePositiveNegative {
	
	public static void segratePositiveNegative(int[] arr) {
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j) {
			
			while(arr[i] >= 0 && i < j)
				i++;
			while(arr[j] < 0 && i < j)
				j--;
		}
	}
}

// move the all even no to right and odd no to left
// movezero 283
