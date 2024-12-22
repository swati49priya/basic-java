package string;

public class CountLetters {
    public static void main(String[] args) {
        String s = "aabbbbeeeeffggg";
        System.out.println(letterCount(s));
    }
    public static String letterCount(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                count+=1;
            }
            else {
                sb.append(s.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
