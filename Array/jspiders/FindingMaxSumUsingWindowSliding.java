package array.jspiders;

public class FindingMaxSumUsingWindowSliding {
	
	public static int maxSum(int[] arr, int k) {
		
		int left = 0;
		int max = 0;
		int currentSum = 0;
		
		for (int right = 0; right < arr.length; right++) {
			currentSum += arr[right];
			
			if(right - left + 1 == k) {
				max = Math.max(max, currentSum);
				currentSum -= arr[left];
				left++;
			}
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,4,6,4,3,6,7,8};
		int maxSum = maxSum(arr, 3);
		System.out.println(maxSum);
		}
	}

