package basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        int num=1;
        for(int i=1; i<=n; i++) {
       // int num=5;
        //for (int i = (n-1); i >0; i--) {
            num= num*i;
        }
        System.out.println("Factorial of " + n + "= " + num);
    }
}
