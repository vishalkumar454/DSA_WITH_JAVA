package number_programming;

import java.util.Scanner;


public class PrintAllDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number = ");
		
		int num = sc.nextInt();
		sc.close();
		
		printDigits(num);

	}

	public static void printDigits(int num) {

		while (num != 0) {
			System.out.println("last digit = " + num % 10);
			num /= 10;
		}
	}
}
