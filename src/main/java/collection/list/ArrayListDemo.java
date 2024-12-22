package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {


        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ArrayList<Integer> al = new ArrayList<>(integers);

        for(int i = 0; i < integers.size(); i++) {
            int temp = al.get(i);

        }
    }
}
