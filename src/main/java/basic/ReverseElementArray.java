package basic;

public class ReverseElementArray {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6};
        int[] z= reverseEle(arr);
        for(int b:z) {
            System.out.print(b);
        }
    }
    public static int[] reverseEle(int[] arr) {
        int[] a= new int[arr.length];
        for(int i = 0; i< arr.length; i+=2) {
            a[i+1] = arr[i];
            a[i] = arr[i+1];
        }
        return a;
    }
}
