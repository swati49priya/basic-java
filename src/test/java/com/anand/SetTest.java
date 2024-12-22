package com.anand;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SetTest {

    @Test
    public void test() {
        List<String> names = Arrays.asList("anand","aman","anup","nigam","sonu");

        System.out.println(names);

        names = names
                .stream()
                .filter(name -> !name.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
