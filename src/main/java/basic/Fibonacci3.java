package basic;
import java.util.*;

public class Fibonacci3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the term: ");
        int term= sc.nextInt();
        getFibo(term);
    }
    public static void getFibo(int term)
    {
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for(int i=2;i<term;i++)
        {
            int next= a+b;
            System.out.print(" "+ next);
            a=b;
            b=next;
        }
        System.out.println();
    }
}
