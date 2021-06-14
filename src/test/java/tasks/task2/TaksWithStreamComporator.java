package tasks.task2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TaksWithStreamComporator {
    @Test
    void task1() {
        List<Integer> list = Arrays.asList(10,5,1,3,7);
        Optional<Integer> min = list.stream()
                .filter(a -> a >= 5)
                .min(Comparator.comparing(Integer::valueOf));
        System.out.println("min.get() = " + min.get()); //5
    }
    @Test
    void task2() {
        List<Integer> list = Arrays.asList(5,4,3,2,1);
        list.stream().filter(a -> a > 3).sorted().forEach(System.out::print);   //45
    }

    @Test
    void task3() {
        List<Integer> list = Arrays.asList(5,4,3,2,1);
        System.out.println("list.stream().filter(a -> a > 3).distinct().count() = " + list.stream().filter(a -> a > 3).distinct().count());
    }


}
