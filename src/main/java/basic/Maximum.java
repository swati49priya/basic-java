package basic;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Largest no. is: "+ findMaximum(a,b,c));
    }

    private static int findMaximum(int a, int b, int c) {
        int  max = a;
        if(b>max) {
            max = b;
        }
        if(c>max) {
            max = c;
        }
//        if (a > b && a > c) {
//            return a;
//        } else if (b > c) {
//            return b;
//        } else {
//            return c;
        return max;
    }
}
