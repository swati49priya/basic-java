package string;

public class ValidIPV4 {

    public static void main(String[] args) {

        String s1 = "127.0.0.1";
        String s2 = "290.156.127.11";
        String s3 = "-1.0.0.17";
        String s4 = "001.122.014.222";
        String s5 = "0001.122.014.222";

        System.out.println(isValidIPV4(s1));
        System.out.println(isValidIPV4(s2));
        System.out.println(isValidIPV4(s3));
        System.out.println(isValidIPV4(s4));
        System.out.println(isValidIPV4(s5));
    }

    private static int isValidIPV4(String s) {

        String [] arr = s.split("\\.");

        if(arr.length!=4) {
            return 0;
        }

        int count = 0;

        for(int i =0; i< arr.length; i++) {

                char[] chArr = arr[i].toCharArray();
                for(int j =0 ; j < chArr.length ; j++) {
                    if(chArr[j] == '0' && j < chArr.length-1 && chArr.length >1) {
                        return 0;
                    }
                }

            try {
                int num = Integer.parseInt(arr[i]);
                if(num >= 0 && num <= 255) {
                    count++;
                }
            } catch(NumberFormatException e) {
                return 0;
            }
        }

        if(count == 4) {
            return 1;
        }

        return 0;
    }
}
