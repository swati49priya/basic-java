package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        int arr[]= {6,8,6,9,4,8};

        Map<Integer, Integer> countMap = new HashMap<>();

        for(int i=0; i<arr.length; i++) {

            if(countMap.containsKey(arr[i])) {
                int existingCount = countMap.get(arr[i]);
                existingCount++;
                countMap.put(arr[i], existingCount);
            } else {
                countMap.put(arr[i], 1);
            }
        }

        System.out.println(countMap);
    }
}
