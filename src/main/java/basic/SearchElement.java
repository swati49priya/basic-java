package basic;

public class SearchElement {
    public static void main(String[] args) {
        int arr[]= { 18, 12, 9, 17, 77, 50};
        for (int i=0; i< arr.length; i++) {
            if ( arr[i]==12) {
                System.out.println("Element exist at index "+ i);
            }

        }
        System.out.println("element not available");
    }
}
