package number_programming;

import java.util.Scanner;

public class CountNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number = ");
		int num = sc.nextInt();
		
		int count = countDigit(num);
		System.out.println(count);
	}
	
	public static int countDigit(int num) {
		
		int count = 0;
		
		if(num == 0) {
			return 1;
		}else {
			while(num != 0) {
				num/= 10;
				count++;
			}
		}
		
		return count;
	}
}
