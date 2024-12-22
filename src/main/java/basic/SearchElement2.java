package basic;

public class SearchElement2{
    public static void main(String[] args) {
        int[] arr = {2,4,3,9,1,6};
        int target = 9;
        giveIndex(arr,target);
    }
    public static void giveIndex(int[] arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                System.out.println("Element is present at index: "+ i);
            } else {
                System.out.println("Element is not present in the given array.");
            }
        }
    }
}
