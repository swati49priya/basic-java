package basic.tcsNqt;

public class BalanceOfStarHash {
    public static void main(String[] args) {
        String s = "#**#*##**###";
        System.out.println(getCount(s));
    }
    public static int getCount(String s)
    {
        int countStar = 0;
        int countHash = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '*')
            {
                countStar++;
            }
            else if(s.charAt(i) == '#')
            {
                countHash++;
            }
        }
        int result = countStar - countHash;
        return result;
    }
}
