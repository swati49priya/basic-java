package string;

import java.util.Scanner;

//input=  b4d4r5t5y6
// output= bbbbddddrrrrrtttttyyyyyy
public class StringCoversion2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string: ");
        String s = sc.nextLine();

//        String s = "b4d4r5t5y6";
        System.out.println(stringConv(s));
    }
    public static String stringConv(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i+=2)
        {
            char letter = s.charAt(i);
            int count= Character.getNumericValue(s.charAt(i+1));
            for (int j=0; j<count; j++) {
                sb.append(letter);
            }
        }
        return sb.toString();
    }
}
