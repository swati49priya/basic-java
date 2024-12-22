package basic;

import java.util.ArrayList;
import java.util.List;

public class FirstNPrimeNumbers {

    public static void main(String[] args) {

        int n = 10;
        List<Integer> nPrimeNumbers = getNprimeNumbers(n);
        System.out.println(nPrimeNumbers);
    }

    private static List<Integer> getNprimeNumbers(int n) {

        List<Integer> result = new ArrayList<>();
        int num = 2;
        while(true) {
            if(primeCheck(num)) {
                result.add(num);
            }
            if(result.size() == n) {
                break;
            }
            num++;
        }
        return result;
    }

    public static boolean primeCheck(int n)
    {
        int count = 0;
        for(int i = 1; i<=n; i++)
        {
            if(n % i == 0)
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
