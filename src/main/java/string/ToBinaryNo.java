package string;

public class ToBinaryNo {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(convertToBinary(n));
        
    }
    public static String convertToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n!=0) {
            if(n%2==1)
               sb.append("1");
            else {
                sb.append("0");
            }
            n= n/2;
        }
        return sb.reverse().toString();
    }
}
