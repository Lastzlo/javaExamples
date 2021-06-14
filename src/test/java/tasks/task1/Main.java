package tasks.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {
    private int method1() {
        MyClass obj = new MyClass();
        obj.x = 1;
        method2(obj);
        System.out.println("obj.x = " + obj.x);
        return obj.x;
    }

    private void method2(MyClass param) {
        param.x = 2;    //тут param ссылался на obj
        param = new MyClass();  //в этом месте он ссылается на новый объект,
        //изменения на старый не влияют;
        param.x = 3;
    }

    class MyClass {
        int x;
    }

    @Test
    public void checkResult() {
        Assertions.assertEquals(2, new Main().method1(), "It should be 2");
    }
}
