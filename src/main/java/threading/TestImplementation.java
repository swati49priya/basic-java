package threading;

public class TestImplementation extends Test{
    @Override
    void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestImplementation te = new TestImplementation();
        te.print();
//        System.out.println(Test.NAME);
    }
}
