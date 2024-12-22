package string;

import java.util.ArrayList;
import java.util.List;

public class FindOddEvenNumbersInString {

    public static void main(String[] args) {

        String str = "test(222),test(321),test(50)";

        String[] tokens = str.replaceAll("test", "").replaceAll("\\(", "").replaceAll("\\)", "").split(",");

        for(String s: tokens) {
            int num = Integer.valueOf(s);
            if(num%2 == 0)
                System.out.println("Even : "+ num);
            else
                System.out.println("Odd : "+ num);
        }
    }
}
