package org.example.java.lang.Exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    //test use assertThrows for contain Exception
    @Test
    public void thenNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            String str = null;
            System.out.println(str.length());
        });
    }

    /**Difference between throw and throws in Java*/
    //Java throw example
    void throw_example_whenExceptionExtendsRuntimeException(){

        throw new ArithmeticException("sorry");
    }

    void throw_example_whenExceptionExtendsException() throws Exception{

        throw new Exception("sorry");
    }

    //Java throws example
    void throws_example()throws ArithmeticException{
        //method code
    }

    //Java throw and throws example
    void throw_and_throws_example()throws ArithmeticException{
        throw new ArithmeticException("sorry");
    }
}


// Java program to demonstrate exception is thrown
// how the runTime system searches th call stack
// to find appropriate exception handler.
class ExceptionThrown
{
    // It throws the Exception(ArithmeticException).
    // Appropriate Exception handler is not found within this method.
    static int divideByZero(int a, int b){

        // this statement will cause ArithmeticException(/ by zero)
        int i = a/b;

        return i;
    }

    // The runTime System searches the appropriate Exception handler
    // in this method also but couldn't have found. So looking forward
    // on the call stack.
    static int computeDivision(int a, int b) {

        int res =0;

        try
        {
            res = divideByZero(a,b);
        }
        // doesn't matches with ArithmeticException
        // не будет совпадает с ArithmeticException, по этому этот catch не поймает
        catch(NumberFormatException ex)
        {
            System.out.println("NumberFormatException is occurred");
        }
        return res;
    }


    // In this method found appropriate Exception handler.
    // i.e. matching catch block.
    @Test
    public void computeDivision() {
        int a = 1;
        int b = 0;

        try
        {
            int i = ExceptionThrown.computeDivision(a,b);

        }

        // matching ArithmeticException
        catch(ArithmeticException ex)
        {
            // getMessage will print description of exception(here / by zero)
            System.out.println(ex.getMessage());    //divide by zero

            Assertions.assertEquals("/ by zero", ex.getMessage());

        }
    }
}

