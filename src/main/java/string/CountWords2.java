package string;

public class CountWords2 {
    public static void main(String[] args) {
        String a = "I have to go today.";
        String[] arr = a.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
