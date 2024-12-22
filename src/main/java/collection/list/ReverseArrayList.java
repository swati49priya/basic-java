package collection.list;

import java.util.*;

public class ReverseArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        reverseList(list);
        System.out.println(list);
    }

    private static void reverseList(List<Integer> list) {
        Collections.reverse(list);
    }
}
