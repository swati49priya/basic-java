package basic;

public class Pallindrom {

    public static void main(String[] args) {

//        String s = "aaabaaa";

        String s = "swati";
        System.out.println("Is pallindrom " + s + " ? : "+ isPalindrom(s));
    }

    private static boolean isPalindrom(String s) {

        char[] arr = s.toCharArray();

        int i = 0;

        for( ; i< arr.length/2 ; i++) {
            if(arr[i] != arr[arr.length -1 - i]) {
                break;
            }
        }

       return i == arr.length/2;
    }


}
