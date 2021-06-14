package org.example.java.lang.String.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTasks {
    @Test
    public void isFirsLetterInUpperCase_thenFalse() {
        String word = "abcde";
        boolean isUpperCase = Character.isUpperCase(word.charAt(0));
        Assertions.assertFalse(isUpperCase);
    }

    @Test
    public void isFirsLetterInUpperCase_thenTrue() {
        String word = "Abcde";
        boolean isUpperCase = Character.isUpperCase(word.charAt(0));
        Assertions.assertTrue(isUpperCase);
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
        Assertions.assertTrue(task1("Abcde"));
        Assertions.assertTrue(task1("Ab cde"));
        Assertions.assertTrue(task1("Ab-cde"));
    }

    @Test
    public void task1_whenWordIllegal_thenFalse() {
        Assertions.assertFalse(task1("abcde"));
        Assertions.assertFalse(task1("Abcd2e"));
    }

    @Test
    public void StringIntern() {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("(s1 == s2) = " + (s1 == s2)); //true

        System.out.println("(s1 == s2.intern()) = " + (s1 == s2.intern())); //true

        System.out.println("(\"123\" == \"123\") = " + ("123" == "123")); //true
    }

    @Test
    public void concatTest() {
        String s1 = "abc";
        s1.concat(s1);
    }

}
