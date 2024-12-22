package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Anand", "Pune");
        map.put("Swati", "Pune");
        map.put("Ashish", "Bangalore");
        map.put("Aman", "Bangalore");
        map.put("Papa", "Hazaribagh");
        System.out.println(map);



        String name = "Aman";
        String loc = map.get(name);

        Map<String, String> m1 = Map.of("Anand", "Pune", "Swati", "Pune", "Ashish", "Bangalore");

        Collection<String> cities = map.values();

        Map<String, Integer> countMap = new HashMap<>();

        for(String city: cities) {
            if(countMap.containsKey(city)) {
                countMap.put(city, countMap.get(city) + 1);
            }
            else {
                countMap.put(city, 1);
            }
        }

        System.out.println(countMap);





        // using java 8 stream api
        Map<String, Long> elementCount = map.values().stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(elementCount);
    }
}
