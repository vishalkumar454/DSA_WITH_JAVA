package array.leetcode;

public class ContainerWithMaxWater {
	
	public static int maxArea(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		
		int max = 0;
		
		while(i<j) {
			int min = Math.min(arr[i], arr[j]);
			int width = j - i;
			int area = min * width;
			
			max = Math.max(max, area);
			if (arr[i] < arr[j]) {
				i++;
			}else
				j--;
		}
		
		return max;
	}
}
p