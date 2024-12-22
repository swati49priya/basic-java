package basic;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]= {23,98,90,66,88,99};
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
