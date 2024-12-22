package Framework;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1= new ArrayList<>();
        al1.add(10);
        al1.add(0,23);
        al1.remove(1);
        System.out.println(al1);
    }
}
