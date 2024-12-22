package basic;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(primeCheck(n));
    }
    public static boolean primeCheck(int n)
    {
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count > 2)
        {
            return false;
        } else {
            return true;
        }
    }
}
