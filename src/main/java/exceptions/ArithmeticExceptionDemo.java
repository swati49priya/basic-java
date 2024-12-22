package exceptions;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int result = div(a, b);

        System.out.println(result);
    }

    static int div(int a, int b) {
        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return c;
    }
}
