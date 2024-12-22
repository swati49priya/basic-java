package threading;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultithreadedTask {

    public static void main(String[] args) {
        Thread.currentThread();

        List<Integer> numbers = IntStream.range(1, 10000000).boxed().collect(Collectors.toList());

        long startTime = System.currentTimeMillis();

        Lists.partition(numbers, 2000000).parallelStream().forEach(numList -> {
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> { printNumbers(numList);});
        });

        System.out.println("Total time taken is "+ (System.currentTimeMillis() - startTime) + " ms");
    }

    private static void printNumbers(List<Integer> numbers) {
        for(Integer i: numbers) {
            System.out.println(i);
        }
    }
}
