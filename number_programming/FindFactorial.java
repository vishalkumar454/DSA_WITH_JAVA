package number_programming;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Factorial");
		int num = sc.nextInt();
		System.out.println();
		
		int result = factorial(num);
		System.out.println("result = " + result);
		
	}
	
	public static int factorial(int num) {
		
		int res = 1;
		for (int i = num; i >= 1; i--) {
			res *= i;
		}
		
		return res;
	}
	
}
