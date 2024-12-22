package string;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "swati";


        System.out.println("Reverse String is: "+ reverseString(str));

    }
    private static String reverseString(String s) {
        int len= s.length();
        String rev="";
        for (int i= len- 1; i >= 0; i--)
        {
            rev= rev+ s.charAt(i);
        }
        return rev;
    }
}
