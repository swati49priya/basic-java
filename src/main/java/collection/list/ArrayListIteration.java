package collection.list;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<>();
        l.add(8);
        l.add(90);
        l.add(4);
        l.add(1);
        System.out.println(l);
        for(int i=0; i<l.size();i++) {
            System.out.println(l.get(i));
        }
    }
}
