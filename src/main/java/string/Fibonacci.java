package string;

import java.util.Scanner;

public class Fibonacci {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the term: ");
            int a = sc.nextInt();

            int n = 0;
            int n2 = 1;
            int sum = 0;
            System.out.print(n + " ");
            System.out.print(n2 + " ");
            for (int i = 2; i < a; i++) {
                sum = n + n2;
                n = n2;
                n2 = sum;
                System.out.print(sum + " ");
            }


        }
    }

