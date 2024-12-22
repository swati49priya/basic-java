package basic;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum of two numbers is: "+ sumOfNumbers(a,b));
    }
    private static int sumOfNumbers(int a, int b) {
       int  c=a+b;
        return c;
    }
}
