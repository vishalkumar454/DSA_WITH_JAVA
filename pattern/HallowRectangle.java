package pattern;

public class HallowRectangle {
	
	public static void Hallow_Rectangle(int totRows,int totColmn) {
		
		for(int i = 1; i <= totRows; i++) {
			
			for(int j = 1; j <= totColmn; j++) {
				
				if(i == 1 || i == totRows || j == 1 || j == totColmn) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
//		int n = 4;
//		for(int i = 1; i <= n; i++) {
//			for(int j = 1; j <= n+1; j++) {
//				
//				if(i == 1 || i == n) {
//					System.out.print("*");
//				}else if(j == 1 || j == n+1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		Hallow_Rectangle(4, 5);
		Hallow_Rectangle(7, 8);
	}
}	
