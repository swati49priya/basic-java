package collection.map;

public class StringComparision {

    public static void main(String[] args) {

        String s1 = "Anand";
        String s2 = "Anand";
        String s3 = new String("Anand");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
