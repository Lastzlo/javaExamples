package org.example.constructions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConditionalConstructs {

    @Test
    public void whenIfTrueAndElseIfTrue() {

        int a = 15;

        if(a > 10) {
            System.out.println("a больше 1о");
        } else if(a > 5) {
            System.out.println("a больше 5");
        } else {
            System.out.println("а <= 5");
        }

    }

    @Test
    public void whenIfTrueAndElseIfTrue2() {
        boolean a = true;
        boolean b = false;

        List<String> resultList = testCase(a, b);

        assertEquals(1, resultList.size());
        assertEquals("a", resultList.get(0));

    }

    @Test
    public void whenIfTrueAndElseIfTrue3() {
        boolean a = false;
        boolean b = true;

        List<String> resultList = testCase(a, b);

        assertEquals(1, resultList.size());
        assertEquals("else", resultList.get(0));

    }

    private List<String> testCase (boolean a, boolean b) {
        List<String> resultList = new ArrayList();

        //если выполнился if то else if не рассматривается
        if (a) {
            System.out.println("a");
            resultList.add("a");
        } else if (a && b) {
            System.out.println("a && b");
            resultList.add("a && b");
        } else {
            if (!b) {
                System.out.println("!b");
                resultList.add("!b");
            } else {
                System.out.println("else");
                resultList.add("else");
            }
        }

        return resultList;
    }


}
