package string;

public class CountDigits {
    public static void main(String[] args) {
        int num= 12342;
        int count=0;
        int a;
        while(num>0)
        {
            a= num%10;
            count++;
            num= num/10;

        }
        System.out.println(count);
    }
}

