package Array;

public class ArrayReverse {
    
	// 1st way
	
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
    
    // 2nd way
    public static int[] reverseArray(int[] arr) {
    	int lastIndex = arr.length-1;

    	for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[lastIndex];
			arr[lastIndex] = temp;
			lastIndex--;
		}
    	
    	return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,9,10,11,12,1,2,3,4,5,6,7};
//        reverse(arr);
        
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
        
        System.out.println();
        
        System.out.println("---------------------------");
        
        int[] newArr = reverseArray(arr);
        
        for (int index = 0; index < newArr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();
        
        System.out.println("---------------------------");
        
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        
    }
}
