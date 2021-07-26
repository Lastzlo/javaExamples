package tasks.task7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class IncrementTask {
    @Test
    void whatResult() {
        int i = 5;
        i = i++ + ++i;
        System.out.println(i);
    }
}
