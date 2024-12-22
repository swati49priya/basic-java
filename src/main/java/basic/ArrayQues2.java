package basic;

public class ArrayQues2 {
    public static void main(String[] args) {
        int []arr= {2,6,7,8};
        int divisor=1;
        int quo = 2;
        int rem = 0;
        System.out.println(dividendPresence(arr,divisor,quo,rem));
    }
    public static int dividendPresence(int [] arr, int divisor, int quo, int rem){
        int dividend =  quo * divisor + rem;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == dividend){
                return i;
            }

        }
        return -1;
    }
}
