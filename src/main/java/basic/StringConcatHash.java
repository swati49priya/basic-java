package basic;
//input= ab#r#d#ffh#j#
//output= #####abrdffhj
public class StringConcatHash {
    public static void main(String[] args) {
        String str= "ab#r#d#ffh#j#";
        System.out.println(sortString(str));

    }
    public static String sortString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '#'){
                sb.insert(0,s.charAt(i));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
