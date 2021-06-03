package org.example.oop.classesAndObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassingInformationToAMethod {
    @Test
    public void ArbitraryNumberOfArguments(){

        class TestArbitraryNumberOfArguments{
           public int printLengthOfArray(int ... array){
               return array.length;
           }
        }


        //int array
        int[] array = new int[]{0,1,2,3,4}; //length = 5
        int result = new TestArbitraryNumberOfArguments().printLengthOfArray(array);
        assertEquals(5, result);

    }
}
