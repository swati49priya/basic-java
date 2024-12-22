package basic;

import java.util.ArrayList;
import java.util.List;

public class AvgArray {
    public static void main(String[] args) {
        int[] arr = {2,4,9,7,5,8,6};
        getElement(arr);
    }
    public static void getElement(int[] arr)
    {
        int sum = 0;
        int count = 0;
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i]%2==0 || arr[i]%3==0)
            {
               sum+=1;
            }
        }

        {

        }
    }
}
