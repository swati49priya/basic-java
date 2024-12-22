package basic.array;

public class GetNumberInSeries {

    public static void main(String[] args) {
        System.out.println(getNumberInSeries(15));
        System.out.println(getNumberInSeries(8));
    }

    public static int getNumberInSeries(int n) {
        int [] arr = new int[41];

        int twoPowerCounter = 0;
        int threePowerCounter = 0;

        for(int i = 1; i<= 40; i++) {

            if(isPrime(i)) {
                arr[i] = (int) Math.pow(2, twoPowerCounter);
                twoPowerCounter++;
            } else if (isPerfectSquare(i)) {
                arr[i] = (int) Math.pow(3, threePowerCounter);
                threePowerCounter++;
            } else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        return arr[n];
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }
}
