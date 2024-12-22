package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        String s="hello";
        char[] arr= s.toCharArray();


        Map <String,Integer> count= new HashMap<>();
        String vowel="a";
        for(int i=0; i<arr.length;i++) {
            if(count.containsKey(String.valueOf(arr[i])))
            {
                int existingCount= count.get(String.valueOf(arr[i]));
                existingCount++;
                count.put(String.valueOf(arr[i]), existingCount);
            }
            else{
                count.put(String.valueOf(arr[i]),1);
            }
        }

        System.out.println(count);

    }
}
