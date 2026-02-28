package Array;

class LinearSearch {

    public static int Linear(int[] number,int key) {

        for (int index = 0; index < number.length; index++) {
            if (number[index] == key) {
                return index;
            }
        }
        return -1;
    }

    public static void Linear2(String[] list,String key2) {
        boolean key = false;
        
        for (int index = 0; index < list.length; index++) {
            if (list[index] == key2) {
                key = !false;
            }
        }

        if (key == true) {
            System.out.println("item present in this list");
        }else{
            System.out.println("item not present in the list");
        }
    }

    public static void main(String[] args)
    {
        int[] number = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;

        int index = Linear(number, key);

        if (index == -1) {
            System.out.println("key Not found");
        }else{
            System.out.println("key is at index : " + index);
        }

        String list[] = {"dosa","samosa","pani puri","sattu"};
        String key2 = "samosa";

        Linear2(list,key2);

    }
}
