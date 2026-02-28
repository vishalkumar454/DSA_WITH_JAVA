package Array;

class LargestValue {

    // public static int largestVal(int number[]) {
    //     int largest = Integer.MIN_VALUE; // -infinity(smallest int value);
    //     // int smallest = Integer.MAX_VALUE; // +infinity(largest int value);

    //     for (int index = 0; index < number.length; index++) {
    //         if (number[index] > largest) {
    //             largest = number[index];
    //         }
    //     }
    //     return largest;
    // }


    // public static void main(String[] args) {
    //     int number[] = {1,2,3,4,2,6,8,4};
        
    //     System.out.println("Largest no is : "+ largestVal(number));
    // }

    public static int largestVal(int[] number){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // code for largest value

        for (int index = 0; index < number.length; index++) {
            if (largest < number[index]) {
                largest = number[index];
            }
        }

        // code for smallest value

        for (int index = 0; index < number.length; index++) {
            if (smallest > number[index]) {
                smallest = number[index];
            }
        }

        // return largest;
        return smallest;
    }

    public static void main(String[] args) {
        int[] number = {1,2,3,4,3,2,5,16,4,6};

        System.out.println("Largest no is : "+ largestVal(number));
    }   
}
