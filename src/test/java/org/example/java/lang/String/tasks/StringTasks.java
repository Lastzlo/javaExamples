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
