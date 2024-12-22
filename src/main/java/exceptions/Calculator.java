package exceptions;

import java.util.Scanner;

public class Calculator {
    public static int add(int a,int b) {
        return a+b;
    }
    public static int substract(int a, int b) {
        return a-b;
    }
    public static int multiply(int a, int b) {
        return a*b;
    }
    public static int divide(int a, int b) {
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.print("1.Sum is: "+add(a,b) + "\n2.Substraction is: " + substract(a,b) + "\nMultiplication is: "+ multiply(a,b) + "\nDivision is: " + divide(a,b));
    }
}
