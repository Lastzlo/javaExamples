package tasks;

import org.junit.jupiter.api.Test;

public class task5 {
    
    @Test
    void whatRes() {

//        for (i = 0; i <10 ; i++) {    //variable undefined
//
//        }

        //double d = 08; //compl error integer too large
        double d = 08d;
        System.out.println("d = " + d);

        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        if(a) {
            if(b == true) {
                
            } else if (a && (b = c)) {
                System.out.println("3 = " + 3);
            }
        } else {
            System.out.println("4 = " + 4);
        }
    }
}
