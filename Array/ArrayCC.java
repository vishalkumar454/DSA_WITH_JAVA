// creating , input, output and updating an Array

package Array;
import java.util.Scanner;

public class ArrayCC {
    public static void main(String[] args) {
        
        int marks[] = new int[50];
        try (Scanner sc = new Scanner(System.in)) {
            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();

            System.out.println("phy "+ marks[0]);
            System.out.println("math "+ marks[1]);
            System.out.println("bio "+ marks[2]);
            System.out.println("length of Array" + marks.length);
        }
    }
}
