package basic;

import java.util.Scanner;


    import java.util.Scanner;
public class Factorial2{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n= sc.nextInt();
            int num=1;
            while(n>0){
                num= num*n;
            }
            System.out.println("Factorial of " + n + "= " + num);
        }
    }


