package basic.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 3, 6, 5, 2, 1};
        reomoveDup(arr);
    }

    public static void reomoveDup(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int num : arr) {
            s.add(num);
        }
        System.out.println(s);
    }
}
