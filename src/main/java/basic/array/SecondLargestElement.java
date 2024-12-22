package basic.array;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {9,7,6,8,1,4,5};
        System.out.println(secLargeElement(arr));

    }
    public static List<Integer> secLargeElement(int[] arr)
    {
        List<Integer> l = new ArrayList<>();
        int max = arr[0];
        int secMax = -1;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]> max)
            {
                secMax = max;
                max = arr[i];

            }
            else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }

        }
        l.add(max);
        l.add(secMax);
        return l;

    }
}
