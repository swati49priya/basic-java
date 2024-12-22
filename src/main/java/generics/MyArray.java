package generics;

public class MyArray<T extends Number> {

    T [] arr = (T []) new Object[3];
    int index = 0;
    public void append(T t) {
        if(index<=2) {
            arr[index++] = t;
        }
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
}
