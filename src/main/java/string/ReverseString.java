package string;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "meenakshi";
        char[] arrayS = s.toCharArray();
        for(int i= arrayS.length-1; i>=0; i--) {
            char rev = arrayS[i];
            System.out.print(rev);
//        for (int i = 0; i <= arrayS.length/2; i++) {
//            char temp = arrayS[i];
//            arrayS[i] = arrayS[arrayS.length-(i+1)];
//            arrayS[arrayS.length-(i+1)] = temp;

//        }
//        System.out.println("Reverse string is " + new String(arrayS));
//        System.out.println(String.valueOf(arrayS));
        }
    }
}
