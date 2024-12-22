package generics;

public class GenericMethodDemo {

    static <T extends  Number> void print(T [] arr) {
        for(T element : arr) {
            System.out.println(element);
        }
    }

    static <T> void println(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        print(new Integer[] {1,2,3,4});

        println(10);
        println("Hi");
        println(10.0);
    }
}
