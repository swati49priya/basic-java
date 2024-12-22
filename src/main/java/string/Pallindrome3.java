package string;

public class Pallindrome3 {
    public static void main(String[] args) {
        String str = "kamini";
        char[]arr = str.toCharArray();
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] == arr[arr.length - i - 1]) {
                System.out.println("pallindrome");
            } else {
                System.out.println("not pallindrome");

            }

        }
}
    }

