package string;

public class CountWords {
    public static void main(String[] args) {
        String a = "I am on leave today.";
        String[] arr = a.split(" ");
        System.out.println("number of words is " + arr.length);
    }
}
