package org.example.java.util.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StreamAPIExamples {
    @Test
    void whenSortedArray() {
        List<Integer> list = Arrays.asList(5,4,3,2,1);
        list.stream().filter((n) -> n > 3).sorted().forEach(System.out::print);
    }

    @Test
    void whenGetMin() {
        List<Integer> list = Arrays.asList(10, 5, 1, 3, 7);
        Optional<Integer> min = list.stream()
                .filter(x -> x >= 5)
                .min(Comparator.comparing(Integer::valueOf));

        Assertions.assertEquals(5, min.get());
    }
}
