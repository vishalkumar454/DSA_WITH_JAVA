package array.program;

public class FindSumOfAllElement {
	
	public static int findSum(int arr[]) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		
		int sum = findSum(arr);
		System.out.println(sum);
	}
}
