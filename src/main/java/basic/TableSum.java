package basic;

import java.util.Scanner;

public class TableSum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 10;
        System.out.println(sumOfTable(n));
    }
    public static int sumOfTable(int n)
    {
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
           int num = n*i;
           sum += num;
        }
        return sum;
    }
}
