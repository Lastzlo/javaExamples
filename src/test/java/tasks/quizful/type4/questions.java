package tasks.quizful.type4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class questions {

    @Test
    void whatResult() {
        String s1 = "str";
        String s2 = "str";
        System.out.println("Result: " + s1 == s2);

        boolean isFalse = s2 + s1 == s2 + s1;
        assertFalse(isFalse);
        //Пояснение: Операции сравнения имеют более низкий приоритет, чем операция конкатенации.
    }
}
