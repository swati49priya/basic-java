package basic.array;

public class TableSum {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(getSum(n));
    }
    public static int getSum(int n)
    {
        return n * (10 * (10+1))/2;
    }
}
