package number_programming;

import java.util.Scanner;
import number_programming.FindFactorial;


public class FindStrongNumber {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		int num = sc.nextInt();
		boolean strong = isStrong(num);
		System.out.println(strong);
		
	}
	
	public static boolean isStrong(int num) {
		
		int num1 = num;
		int result = 0;
		
		while(num != 0) {
			int digit = num % 10;
			result += FindFactorial.factorial(digit);
			num/= 10;
		}
		
		return result == num1;
	}
	
	
	
}
