package pattern;

public class InvertedStar {
	public static void main(String[] args) {
		int n = 4;
		
		for(int i = n; i >= 1; i--) {
			
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		for(int line = 1; line <= n; line++) {
			for(int star = 1; star <= n-line+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
