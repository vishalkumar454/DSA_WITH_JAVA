package Array;

class ArrayCC2 {

    public static void update(int[] marks , int nonChangale){
    	nonChangale = 10; 
    	System.err.println( " ----  "+nonChangale + "   non changable");
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    } 
    
    public static void update1(int[] marks) {
    	
    	for (int i = 0; i < marks.length; i++) {
			marks[i] += 1;
		}
    }

    public static void main(String[] args) 
    {
        int[] marks = {1,2,3};
        int nonChangale = 5; // not changing
        
        for (int index = 0; index < marks.length; index++) {
            System.out.print(marks[index] + " ");
        }
        
        System.out.println();
        
        update(marks , nonChangale);
        
        System.err.println( " ----  "+nonChangale + "   non changable");
        
        for (int index = 0; index < marks.length; index++) {
            System.out.print(marks[index] + " ");
        }
        
        System.out.println();
        
        update1(marks);

        for (int index = 0; index < marks.length; index++) {
            System.out.print(marks[index] + " ");
        }
    }
}
