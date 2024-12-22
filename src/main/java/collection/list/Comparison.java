package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparison {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,5,18,6,4);
        System.out.println(list);
        comparingElements(list);
    }

    private static void comparingElements(List<Integer> list) {
        System.out.println("Minimum element is: " + Collections.min(list));
        System.out.println("Maximum element is: " + Collections.max(list));

    }
}
