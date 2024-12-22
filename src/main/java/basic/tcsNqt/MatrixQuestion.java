package basic.tcsNqt;

public class MatrixQuestion {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,1},
                {1,0,1,0},
                {1,0,0,1}};
        System.out.println(getElement(arr));
    }
    public static int getElement(int[][] arr)
    {
        int previousCount = 0;
        int countOfOne = 0;
        int ans = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j< arr[i].length; j++)
            {
                if(arr[i][j]==1)
                {
                    countOfOne++;
                }
            }
            if(countOfOne>=previousCount)
            {
                previousCount = countOfOne;
                ans = i+1;
            }
            countOfOne = 0;

        }
        return ans;
    }
}
