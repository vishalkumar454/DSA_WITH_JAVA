package pattern;

public class HallowRhombus {
	
	public static void hallow_Rhombus(int n) {
		
		
		for(int i = 1; i <= n; i++) {
			
			// spaces
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// stars
			for(int j = 1; j <= n; j++) {
				
				if(i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		hallow_Rhombus(5);
	}
}
