package string;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        char[] a = s.toCharArray();
        int i = 0;
        for ( ;i <= (a.length)/2; ) {
           if(a[i] == a[a.length-i-1]) {
               i++;
            } else {
                break;
            }
        }
        if (i== a.length/2 + 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
