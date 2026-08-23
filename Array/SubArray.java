package Array;

public class SubArray {

	public static void subArray(int arr[]) {
		
		int totalSubarray = 0;
		
		int max = arr[0];
		int sum = 0;
		int min = arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				
				sum = 0;

				for (int k = i; k <= j; k++) {

					System.out.print( arr[k] + " ");
					sum += arr[k];
					System.out.print(" sum = "+ sum + "   ");
				}
				
				if(sum > max) {
					max = sum;
				}else if(sum < min) {
					min = sum;
				}
				
				System.out.println("max = " + max + "  min = "+ min);
				
				totalSubarray++;
				
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("total subArray = " + totalSubarray);
		System.out.println("maximum sum of subArray = " + max);
		System.out.println("manimum sum of subArray = " + min);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,10};
		subArray(arr);
		
	}
}
