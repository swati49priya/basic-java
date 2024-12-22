package basic.array;

import java.util.Arrays;

public class FindSubarrays {
    public static void main(String[] args) {

        int[] arr = {2,9,1,3,6};
        getAllSubArray(arr);
    }
    public static void getAllSubArray(int[] arr)
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                int[] subarr = Arrays.copyOfRange(arr, i,j+1);
                count++;

                System.out.println(Arrays.toString(subarr));
            }
        }
        System.out.println(count);
    }
}
