package basic;

public class ReverseNum {
    public static void main(String[] args) {
        int num=35789;
        System.out.println(reversedNum(num));
    }
   private static int reversedNum(int num){
        int ans=0;
        while (num>0){
           int rem = num%10;
           num=num/10;
           ans=ans*10+rem;
        }
    return ans;
    }
}
