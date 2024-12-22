package basic;

public class Swap1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swapNum(a,b);
        System.out.println(a +" " + b);
    }
    static void swapNum(int a, int b) {
        int temp= a;
        a=b;
        b=temp;

    }

}
