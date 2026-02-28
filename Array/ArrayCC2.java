package Array;

class ArrayCC2 {

    public static void update(int[] marks){
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    } 

    public static void main(String[] args) 
    {
        int[] marks = {1,2,3};
        update(marks);

        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }
    }
}
