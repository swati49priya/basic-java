package basic;

public class Fibonacci2 {
    public static void main(String[] args) {
        int num=5;
        System.out.println(fibo(num));
    }
    private static int fibo(int num){
        int a= 0;
        int b= 1;

        if(num==0){
            return a;
        }
        if(num==1){
            return b;
        }
        for (int i=2; i<= num; i++) {
            int temp= b;
            b=a+b;
            a= temp;
        }
        return b;
    }
}
