package tasks.quizful.type2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class questions1 {

    @Test
    void whatResult() {
        try {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            List temp = ar; //1
            temp.add(new java.util.Date()); //2
            temp.add(new Float(1.66));
            Iterator it = ar.iterator();
            while (it.hasNext())
                System.out.println(it.next());
            System.out.println(ar.get(0));
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }

}
