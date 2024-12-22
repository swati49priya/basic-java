package basic;

public class ArrayMidElement {
    public static void main(String[] args) {
        int [] arr = {3, 4, -1, 9, -8, 2, 5, 90};
        System.out.println(getMidElement(arr));
    }
    public static int getMidElement(int [] arr) {
        // arr = [3, 4, -1, 9, -8, 2, 5]
        // temp = []  // size = 7
        int[] temp = new int[arr.length];
        int count = 0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] >= 0) {
                temp[count] = arr[i];
                count++;
            }
        }

        // temp = [3,4,9,2,5,90,0,0]
        // count = 6

        int index = 0;
        if(count % 2 == 0)
            index = count/2-1;
        else
            index = count/2;

        return temp[index];
    }
}
