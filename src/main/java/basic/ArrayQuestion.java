package basic;

public class ArrayQuestion {
    public static void main(String[] args) {
        int arr[] = {2,4,3};
        for(int a: countAbs(arr))
        {
            System.out.println(a);
        }
    }
    public static int[]  countAbs(int[] arr)
    {
        int[] output = new int[arr.length];

       for(int i = 0; i < arr.length; i++)
       {
           int count = 0;
           for(int j = 0; j < i; j++)
           {
               if(arr[j] > arr[i]){
                   count -= Math.abs(arr[j] - arr[i]);
               } else{
                   count += Math.abs(arr[j] - arr[i]);
               }
           }
           output[i]= count;
       }
       return output;
    }
}
