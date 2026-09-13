package array.program;

public class FindMinMax {
	
	public static int findMax(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
	public static int findMin(int arr[]) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,7,5,4,34,56,7,3,};
		
		int max = findMax(arr);
		System.out.println(max);
		
		int min = findMin(arr);
		System.out.println(min);
	}
}
