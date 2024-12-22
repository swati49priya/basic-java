package basic;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[]={5,8,0,6,9,2,3};
        for(int i:arr) {
            System.out.println(i);
        }
        int temp=arr[0];
        for(int i=1;i<arr.length;i++) {
            arr[i-1]=arr[i];
            System.out.println(arr[i]);
        }

        arr[arr.length]=temp;

    }
}
