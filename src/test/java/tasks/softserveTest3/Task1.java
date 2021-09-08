package tasks.softserveTest3;

import org.junit.jupiter.api.Test;

import java.io.Writer;
import java.time.Duration;
import java.time.LocalDate;
import java.util.*;

public class Task1 {
    Integer ss;
    public static void main(String[] args) {

        System.out.println(new Task1().ss);

        for (short i = 32766; i < 032767; i++) {
            System.out.print(i);
        }
    }

    @Test
    void StrindP () {
            String s = "Java" + 1 + 3;

        System.out.println(s);
    }

    @Test
    void StrindCopy () {
        String s = new String("abc");
        String s2 = new String("ABC");
        System.out.println(s = s2);
    }

    @Test
    void enumTEst() {
        Month m = Month.April;

        System.out.println(m);
    }

    @Test
    void printFig() {
        short i = 32766;
        do{
            System.out.print(i);
            i++;
        } while (i < 32767);
    }

    @Test
    void forTst() {
//        for (int i = 0; i < 5 ; i++) {
//            int j;
//            for (int j = 0; j < 0; j++) {
//
//            }
//        }

        int s = 1;
        int i = 1;

        while (i-- > 0) {
            s += i;
        }

        System.out.println("s = " +  ++s);  //2
    }

    @Test
    void forr() {
        for (short i = 32766; i < 032767; i++) {
            System.out.print(i);
        }
    }


}



class Examp {
    public static void main(String[] args) {
        Parent p = new Parent();

        System.out.println(((Child1) p).method());   // 30
    }

    static class Parent {
        int method() {
            return 10;
        }
    }

    static class Child extends Parent {
        int method() {
            return 20;
        }
    }

    class Child1 extends Child {
        int method() {
            return 30;
        }
    }
}

class ParentClass {
    private int x;
    public ParentClass(int x) {
        this.x = x;
    }
}

class CgildClass extends ParentClass {
    private int x;
    private int y;
    public CgildClass(int x, int y) {
        super(x);
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        ParentClass cc = new CgildClass(20, 10);
        //System.out.println(cc.x );
    }
}

class TestClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.err.println("Div");
        }
        System.out.println("End");
    }

    @Test
    void errr() {
        for (int i = 0; i < 100; i++) {
            TestClass.main(null);


        }
    }

    @Test
    void lists() {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(9);
        set.add(1);
        Collection set2 = new TreeSet<>();

        set2.addAll(set);
        System.out.println(set2);

        List<Integer> list = new ArrayList<>();


    }

    @Test
    void list2 () {
        List<Integer> s1 = new ArrayList<>();
        s1.add(5);
        s1.add(8);
        s1.add(1, 2);
        List<Integer> s2 = new ArrayList<Integer>(s1.subList(1,1));
        System.out.println(s2);

        LocalDate localDate = LocalDate.of(2020, java.time.Month.JUNE, 22);
        LocalDate localDate2 = LocalDate.of(2020, java.time.Month.JUNE, 23);
        //System.out.println(Duration.between(localDate, localDate2));
    }
}