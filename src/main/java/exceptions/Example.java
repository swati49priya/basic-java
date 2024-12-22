package exceptions;

public class Example {


    public static void main(String[] args) {
        int a=10;

        System.out.println("Triple of a number is: " + tripler(a));


    }

    //    System.out.println("Tripple of a number is:"+ 3*a);
    public static int doubler(int a) {
        return 2 * a;
    }

    public static int tripler(int a) {
     return doubler(a)+a;
    }
}