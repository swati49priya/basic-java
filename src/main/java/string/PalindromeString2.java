package string;

public class PalindromeString2 {
    public static void main(String[] args) {
        String s = "madam";
        char[] a = s.toCharArray();

        for (int i = 0; i <= a.length/2; i++) {
            if(a[i] != a[a.length-1-i]) {
                System.out.println("Not Palindrome");
                break;
            } else {

            }
        }
    }
}
