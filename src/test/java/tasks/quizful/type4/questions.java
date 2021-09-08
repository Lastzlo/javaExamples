package tasks.quizful.type4;

import org.junit.jupiter.api.Test;

public class questions {

    @Test
    void whatResult() {
        String s1 = "str";
        String s2 = "str";
        System.out.println("Result: " + s1 == s2);
        //Пояснение: Операции сравнения имеют более низкий приоритет, чем операция конкатенации.
    }
}
