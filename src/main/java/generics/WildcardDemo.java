package generics;

public class WildcardDemo {

    static void fun(MyArray<? extends Object> obj) {
        obj.print();
    }

    public static void main(String[] args) {
        MyArray<Integer> obj = new MyArray<>();
        fun(obj);
    }
}
