package basic;

public class FibonacciIterative {

    public static void main(String[] args) {

        int target = 6;
        System.out.println(target + "'th Fibonacci number is : "+ fibo(target));
    }

    private static int fibo(int target) {

        int a = 0;
        int b = 1;

        if(target == 0) {
            return  a;
        }

        if(target == 1) {
            return b;
        }

        int fib = -1;

        for(int i = 2; i <= target; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }
}
