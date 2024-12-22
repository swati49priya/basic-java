package threading;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequencialTask {

    public static void main(String[] args) {

        List<Integer> numbers = IntStream.range(1, 10000000).boxed().collect(Collectors.toList());

        long startTime = System.currentTimeMillis();

        for (Integer number: numbers) {
            System.out.println(number);
        }

        System.out.println("Total time taken is "+ (System.currentTimeMillis() - startTime) + " ms");
    }
}
