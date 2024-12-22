package basic;

public class ArraySumTarget {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 18;

        int[] res = giveIndex(arr,target);
        for(int n : res)
            System.out.println(n);

    }
    public static int[] giveIndex(int[] arr, int target)
    {
        int[] result = new int[2];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(target == arr[i] + arr[j])
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
