package generics;

public class MyArrayTest {

    public static void main(String[] args) {

        MyArray<Integer> myArray = new MyArray<>();

        myArray.append(3);
        myArray.append(2);
        myArray.append(1);

        myArray.print();
    }
}
