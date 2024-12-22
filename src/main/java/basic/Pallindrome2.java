package basic;

public class Pallindrome2 {
    public static void main(String[] args) {
        String s= "aabaa";
        System.out.println("String " + s +" is Pallindrome: "+ isPallindrome(s));
    }
   private static boolean isPallindrome(String s) {
        char[]arr = s.toCharArray();
        for(int i=0; i<=arr.length/2;i++) {
            if(arr[i]!=arr[arr.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
