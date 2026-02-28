package Array;

class Binary {

    public static int BinarySearch(int BinaryNum[], int key) {

        int initalIndex = 0;
        int lastIndex = BinaryNum.length -1;
        

        while (initalIndex <= lastIndex) {
            int mid = (initalIndex + lastIndex)/2;

            if (BinaryNum[mid] == key) {
                return mid;
            }else if(BinaryNum[mid] > key){
                lastIndex = mid - 1;
            }else if(BinaryNum[mid] < key){
                initalIndex = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int BinaryNum[] = {1,2,3,4,5,6,7,8,9,10,11,23};
        int key = 0;

        System.out.println("the key present at index " + BinarySearch(BinaryNum, key));
    }
    
}
