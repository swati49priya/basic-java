package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfDuplicatesMap {
    public static void main(String[] args) {
        int arr[] = {1,9,8,5,7,8,1,5,1,1,9};
        System.out.println(countDuplicateElements(arr));
    }

    private static int countDuplicateElements(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {

            if (map.containsKey(num)) {
                Integer value = map.get(num);
                map.put(num, ++value );
                

            } else {
                map.put(num, 1);
            }
        }
            return map.values().stream().filter(v -> v > 1).collect(Collectors.toList()).size();
    }
}
