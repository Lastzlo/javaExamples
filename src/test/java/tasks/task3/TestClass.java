package tasks.task3;

import org.junit.jupiter.api.Test;

public class TestClass {
    @Test
    void whatResult() {
        int x = 6;
        int n1 = 5 < x-- ? 5 : 7;   //так как x-- не успеет отнять, то будет 5 < 6

        switch (n1) {   // n1 = 5
            default:
                System.out.println("nan");
            case 1:
                System.out.println(1);
            case 3:
                System.out.println(3);
            case 7:
                System.out.println(7);
                break;
        }

        //result:
        //nan
        //1
        //3
        //7
    }
}
