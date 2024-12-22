package collection.map;

import java.util.*;

public class PersonInPune {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Anand", "Pune");
        map.put("Swati", "Pune");
        map.put("Ashish", "Bangalore");
        map.put("Aman", "Bangalore");
        map.put("Papa", "Hazaribagh");

        List<String> pplLivingInPune = new ArrayList<>();

        for(String name : map.keySet()) {
            if(map.get(name).equalsIgnoreCase("Pune")) {
                pplLivingInPune.add(name);
            }
        }

        System.out.println("ppl living in pune : " + pplLivingInPune);

    }
}
