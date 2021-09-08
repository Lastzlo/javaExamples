package tasks.quizful.type3;

import org.junit.jupiter.api.Test;

public class questions {
    @Test
    void whatResult2() {
        int limit = 10;
        int sum = 0;
        int i = 1;
        for (; i <= limit;) {
            sum += i++;
//            System.out.println("i = " + i);
//            System.out.println("sum = " + sum);
//
//            System.out.println("---");
        }

        System.out.println(sum);    //result : 55

    }

    @Test
    void stringToBooleanFalse() {
        Boolean f1 = true;
        //любое слово кроме true будет преобразовано в false
        Boolean f2 = new Boolean("/false"); //f2 = false
        String a = "" + 1 + '+' + 1 + '=' + (1 + 1) + " is ";
        String b = a + f1 + '/' + f2;
        System.out.println(b);
        //1+1=2 is true/false
    }
}
