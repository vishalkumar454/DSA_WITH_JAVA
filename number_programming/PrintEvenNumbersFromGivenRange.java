package number_programming;

import java.util.Scanner;

public class PrintEvenNumbersFromGivenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter started number = ");
		int start = sc.nextInt();

		System.out.println();

		System.out.print("Enter end number = ");
		int end = sc.nextInt();

		printEvenNumbers(start, end);
	}

	public static void printEvenNumbers(int start, int end) {

		if (start > 0 && end > 0) {
			for (int i = start; i <= end; i++) {
				if(i % 2 == 0) {
					System.out.println("number "+ i);
				}
			}
		} else {
			System.out.println("number should be greater or equal than 0");
		}

	}
}
