package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("Anand", "Kumar");
        m.put("Swati", "Priya");
        m.put("Swati", "Jha");
        m.put(null, null);
        m.put(null, null);

        System.out.println(m);

        System.out.println(m.get(null));
        System.out.println(m.get("Swati"));
        System.out.println(m.get("anand"));
    }
}
