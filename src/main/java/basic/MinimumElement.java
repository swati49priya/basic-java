package basic;

public class MinimumElement {
    public static void main(String[] args) {
        int arr[]= {12, 34, 44, 55, 11, 45};
        int min= arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}
