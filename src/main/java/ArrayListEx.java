import java.util.ArrayList;


public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList al= new ArrayList();
        Student s = new Student(10);
        al.add(s);
        al.add("a");
        al.add(12);
        al.add(null);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.remove(s);

    }
}
