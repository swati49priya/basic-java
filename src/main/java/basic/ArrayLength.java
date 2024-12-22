package basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayLength {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println(list.size());

        System.out.println(arr.length);
    }
}
