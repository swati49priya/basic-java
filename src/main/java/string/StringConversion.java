package string;
// input= bbbbddddrrrrrtttttyyyyyy
//outout= b4d4r5t5y6
public class StringConversion {
    public static void main(String[] args) {
        String s = "bbbbddddrrrrrtttttyyyyyy";
        System.out.println(stringCount(s));
    }
    public static String stringCount(String s)
    {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0; i<s.length(); i++)
        {
            if((i+1)<s.length() && s.charAt(i) == s.charAt(i+1))
            {
                count++;
            }else {
                sb.append(s.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
