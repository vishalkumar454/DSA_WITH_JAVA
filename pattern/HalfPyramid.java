package pattern;

public class HalfPyramid {
	
	public static void main(String[] args) {
		
		int n = 4;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int line = n; line > 0; line--) {
			for(int num = 1; num <= n-line+1; num++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
