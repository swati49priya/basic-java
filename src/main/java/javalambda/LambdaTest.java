package javalambda;

import java.util.function.IntBinaryOperator;

public class LambdaTest {

    public static void main(String[] args) {

        Calculator calculator = (int a, int b) -> a + b;

        System.out.println(calculator.add(2,3));

    }
}
