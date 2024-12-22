package basic.array;

import java.util.ArrayList;
import java.util.List;

public class MaxAmongSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 1;
        System.out.println(getMax(arr, k));
    }
    public static List<Integer> getMax(int[] arr, int k) {
        List<Integer> l = new ArrayList<>();
        for(int i= 0; i<= arr.length-k; i++)
        {
            int max = arr[i];
            for(int j = i+1; j<=(i+k-1); j++)
            {
                if(arr[j]> max)
                {
                    max = arr[j];
                }
            }
            l.add(max);
        }
        return l;
    }
}
