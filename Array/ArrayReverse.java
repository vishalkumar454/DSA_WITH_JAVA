package Array;

public class ArrayReverse {
    
    public static void reverse(int[] arr){
        
        int start = 0, last = arr.length - 1;

        while (start < last) {
            
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;

            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,9};
        reverse(arr);

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }
}
