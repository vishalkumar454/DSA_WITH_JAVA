package number_programming;

import java.util.Scanner;

public class FindExponentialValue {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base value = ");
		int base = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Enter power value = ");
		int power = sc.nextInt();
		
		System.out.println();
		
		int result = exponential(base,power);
		System.out.println("result = " + result);
		
		sc.close();
	}
	
	public static int exponential(int base, int power) {
		int res = 1;
		
		for (int i = 1; i <= power; i++) {
			res *= base;
		}
		return res;
	}
}
