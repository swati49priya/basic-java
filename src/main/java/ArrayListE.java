import java.util.ArrayList;

class ArrayListTest {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList();
    al.add("swati");
    al.add("3");
    al.add(null);
    al.add("A");
    System.out.println(al);
    al.remove(2);
    System.out.println(al);
  }
}