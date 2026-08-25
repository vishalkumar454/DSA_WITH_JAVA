package array;

public class MaxSubArraySum {
	
	public static void maxSubArraySum(int[] arr) {
		
		int max = arr[0];
		int currSum = 0;
		
		int[] prefixArr = new int[arr.length];
		
		prefixArr[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			prefixArr[i] = prefixArr[i-1] + arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				
				currSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
				
				if (max < currSum) {
					max = currSum;
				} 
			}
		}
		
		System.out.println("max sum = " + max);
		
	}
	
	public static void kadanes(int arr[]) {
		int currSum = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			
			if (currSum < 0) {
				currSum = 0;
			}else if(max < currSum) {
				max = currSum;
			}
			
//			max = Math.max(currSum, max);
		}
		
		System.out.println("maximum sum = " + max);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,-2,6,-1,3};
		int arr1[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		kadanes(arr);
		
	}
}
