package org.example.java.lang.String.tasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringTasks {

    @Test
    void printLnTask() {
        int mass[] = {1,2};

        List<String> list = new ArrayList<>();
        list.add("03");
        list.add("04");

        System.out.println(mass.length + list.size() + ".");    //  4.
        System.out.println("." + mass.length + list.size());    //  .22
    }

    @Test
    void printLnTask2() {
        String s1 = "str";
        String s2 = "str2";
        System.out.println("Result: " + s1 != s2);  //true
        //Пояснение: Операции сравнения имеют более низкий приоритет, чем операция конкатенации.

        boolean isFalse = s2 + s1 == s2 + s1;
        assertFalse(isFalse);

        System.out.println("Result: " + (s1 != s2));  //Result: true

        System.out.println("Result: " + (s1 = s2));   //Result: str2

    }

    @Test
    public void isFirsLetterInUpperCase_thenFalse() {
        String word = "abcde";
        boolean isUpperCase = Character.isUpperCase(word.charAt(0));
        assertFalse(isUpperCase);
    }

    @Test
    public void isFirsLetterInUpperCase_thenTrue() {
        String word = "Abcde";
        boolean isUpperCase = Character.isUpperCase(word.charAt(0));
        assertTrue(isUpperCase);
    }


    /**
     * Task1
     *
     * If
     * @param word doesn't start from uppercase or contains not only letters and symbols "-" and " "
     * @return true
     */
    public static boolean task1 (String word) {
        if(! Character.isUpperCase(word.charAt(0))) return false;
        for (char c : word.toCharArray()) {
            if ((! Character.isAlphabetic(c)) && (c != '-') && (c != ' ')) return false;
        }
        return true;
    }

    @Test
    public void task1_whenWordCorrect_thenTrue() {
        assertTrue(task1("Abcde"));
        assertTrue(task1("Ab cde"));
        assertTrue(task1("Ab-cde"));
    }

    @Test
    public void task1_whenWordIllegal_thenFalse() {
        assertFalse(task1("abcde"));
        assertFalse(task1("Abcd2e"));
    }

    //https://ru.stackoverflow.com/questions/417405/%d0%9a%d0%b0%d0%ba-%d1%81%d1%80%d0%b0%d0%b2%d0%bd%d0%b8%d0%b2%d0%b0%d1%82%d1%8c-%d1%81%d1%82%d1%80%d0%be%d0%ba%d0%b8-%d0%b2-java
    @Test
    public void whenDoubleEquals2() {
        String s1 = "// эти строки указывают на один и тот же объект,\n" +
                "// потому что компилятор добавляет все литералы в пул.\n" +
                "\"test\" == \"test\" // --> true ";

        String s2 = "// эти строки указывают на один и тот же объект,\n" +
                "// потому что компилятор добавляет все литералы в пул.\n" +
                "\"test\" == \"test\" // --> true ";

        assertTrue(s2 == s1);


        // Эти строки имеют одно и тоже же значение
        boolean equals1 = new String("test").equals("test");// --> true
        assertTrue(equals1);
// ...но это разные объекты
        boolean equals2 = new String("test") == "test";// --> false
        assertFalse(equals2);
// ...эти строки тоже разные объекты
        boolean equals3 = new String("test") == new String("test"); // --> false
        assertFalse(equals3);
// ...но эти строки указывают на один и тот же объект,
// потому что компилятор добавляет все литералы в пул.
        boolean equals4 = "test" == "test"; // --> true
        assertTrue(equals4);
// Конкатенация литералов тоже происходит на стадии компиляции,
// поэтому они указывают на один объект
        boolean equals5 = "test" == "te" + "st"; // --> true
        assertTrue(equals5);
// но вызов substring() происходит во время выполнения,
// в результате получаются разные объекты.
        boolean equals6 = "test" == "!test".substring(1); // --> false
        assertFalse(equals6);
// Строки из пула могут быть получены с помощью вызова intern().
        boolean equals7 = "test" == "!test".substring(1).intern(); // --> true
        assertTrue(equals7);
    }

    @Test
    public void whenDoubleEquals() {
        String s1 = "str";
        String s2 = "str";

        //так как (s1 == s2) то операция происходит, а потом присоединяется
        System.out.println("text = "  + (s1 == s2)); //text =  true
        System.out.println((s1 == s2) + " = text");  //true = text
        boolean b1 = (s1 == s2);    //true
        assertTrue(b1);

        //так как s1 == s2 то происходит преобразование "text = " к boolean
        System.out.println("text = "    +   s1 == s2); //false
        System.out.println(s1 == s2 + " = text"); //false
        boolean b2 = s1 == s2;  //true
        assertTrue(b2);

        // компилируется ведь вначале, идет String
        boolean b3 = s1 == true + s2;
        assertFalse(b3);
        boolean b4 = s2 + false == s2;
        assertFalse(b4);

        String s3 = b3 + "text = "; //тут boolean преобразуется к String
        String s4 = b3 + s2; //тут boolean преобразуется к String

        // не компилируется ведь вначале boolean, а потом String
//        System.out.println(b3 == b2 + "text = "); //text =  true
//        String s5 = b3 == b2 + "text = ";
//
//        boolean b5 = b3 + s2;
//        boolean b6 = b3 == s1 + s2;
//        boolean b7 = b3 == b2 + b2;
    }


    @Test
    public void whenIntern() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("(s1 == s2) = " + (s1 == s2)); //true
        System.out.println("(s1 == s2.intern()) = " + (s1 == s2.intern())); //true
    }

    @Test
    public void concatTest() {
        String s1 = "abc";
        s1.concat(s1);
    }

    @Test
    public void whenFormat() {
        String type = "Rare";
        String color = "Red";
        String name = "MyPlant";

        assertEquals("{type: Rare, color: Red, name: MyPlant}",
                String.format("{type: %s, color: %s, name: %s}", type, color, name));
    }

}
