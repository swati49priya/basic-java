package javalambda;

import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        System.out.println(numbers);

//        List<Integer> numbersDoubled = new ArrayList<>();
//        for(int n : numbers) {
//            numbersDoubled.add(n*2);
//        }
//        System.out.println(numbersDoubled);

        List<Integer> numMultiplied = numbers.stream().map(n -> n*2).collect(Collectors.toList());
        System.out.println(numMultiplied);
    }
}
