package basic;

public class ArrayNextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5,7,1,7,6,0};
       int[] result  = findNextGreaterElement(arr);
       for(int i: result) {
           System.out.print(" "+i);
       }
    }
    public static int[] findNextGreaterElement(int[] arr){
        int[] output = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            output[i] = -1;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j] > arr[i]) {
                    output[i]= arr[j];
                    break;
                }
            }

        }
        return output;
    }
}
