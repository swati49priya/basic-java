package basic;

public class PrimeNo2 {
    public static void main(String[] args) {
        int n = 2;
        checkPrime(n);
    }
    public static void checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if (count > 2) {
                System.out.println(n + " is not Prime number.");
            } else {
                System.out.println(n + " is a prime number.");
            }
        }
    }
