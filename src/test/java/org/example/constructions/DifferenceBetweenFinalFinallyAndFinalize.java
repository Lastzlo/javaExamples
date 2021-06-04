package org.example.constructions;

import org.junit.jupiter.api.Test;

public class DifferenceBetweenFinalFinallyAndFinalize {}

//Java final example
class FinalExample{
    @Test
    public void test(){
        final int x=100;
        //x=200;//Compile Time Error
    }
}

//Java finally example
class FinallyExample{
    @Test
    public void test(){
        try{
            int x=300;
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is executed");
        }
    }
}

//Java finalize example
class FinalizeExample{
    public void finalize(){System.out.println("finalize called");}

    @Test
    public void test(){
        FinalizeExample f1=new FinalizeExample();
        FinalizeExample f2=new FinalizeExample();
        f1=null;
        f2=null;
        System.gc();
    }
}