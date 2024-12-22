package basic;

public class DigitAndHash {

    public static void main(String[] args) {

        for(int i =0 ; i< 9; i++) {
            System.out.print("#");

            if(i > 6)
                continue;

            System.out.print(i);
        }
    }
}
