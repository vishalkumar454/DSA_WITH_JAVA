package array.leetcode;

public class MoveZero {

	public static void moveZeroes(int[] nums) {

		int i = 0;
		int j = 0;

		while (i < nums.length && j < nums.length) {
			
			// find zero

			while (i < nums.length && nums[i] != 0) {
				i++;
			}
			
			// j must start from i
	        if (j < i) {
	            j = i;
	        }
	        
			while (j < nums.length && nums[j] == 0) {
				j++;
			}

			System.out.println("i " + i);
			System.out.println("j " + j);

			if (i < nums.length && j < nums.length) {

				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j++;

			}
		}

	}

	public static void main(String[] args) {

		int[] nums = { 1, 0 };
		moveZeroes(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
