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
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			
			if (currSum < min) {
				min = currSum;
			}else if(max < currSum) {
				max = currSum;
			}
			
//			max = Math.max(currSum, max);
		}
		
		System.out.println("maximum sum = " + max);
		System.out.println();
		System.out.println("manimum sum = " + min);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,-2,6,-1,3};
		int arr1[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int arr2[] = {-1,-3,-4*2,-5,-6-7};
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		kadanes(arr2);
		
	}
}
