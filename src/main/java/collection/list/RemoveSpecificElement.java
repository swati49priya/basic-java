package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 1 ,2));
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 1 ,2));
        list.remove(2);
        System.out.println(list);
    }
}
