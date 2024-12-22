package basic;

public class ReverseString {
    public static void main(String[] args) {
        String s= "Donkey";
        System.out.println("reversed String is:" + reverseString(s));
    }
     private static String reverseString(String s) {

        char[] arr= s.toCharArray();
        char[] reversedarr= new char[arr.length];
         for (int i = 0; i < arr.length; i++) {
           reversedarr[i]= arr[arr.length-1-i];
        }
         return new String(reversedarr);
    }
}
