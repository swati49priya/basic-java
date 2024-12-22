package basic.array;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {4,9,1,8,3,4,7};
        System.out.println(secSmallestEle(arr));
    }
    public static int secSmallestEle(int[] arr)
    {
        int min = arr[0];
        int secMin = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]< min)
            {
                secMin = min;
                min = arr[i];
            }
            else if(arr[i] < secMin && arr[i] != min){
                secMin = arr[i];
            }
        }
        return secMin;
    }
}
