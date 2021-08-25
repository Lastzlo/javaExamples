package org.example.java.lang.CasesWithArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CreateArray {
    @Test
    public void createMultiplyArray() {

        int [][] array = new int[2][];
        int [][] array_1 = new int[2][0];
        int [][] array2 [] = {,};
        int [][] array3 = {{1},{},{,}};
        //int [][] array3_2 = 2;
        int [][] array3_1 = new int[][]{{1},{},{,}};

    }

    //что будет?
    @Test
    public void whenArrayIndexOutOfBoundsException() {
        int intArray[] = new int[2];
        //System.out.println(intArray[-10]);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> System.out.println(intArray[-10]));
        //java.lang.ArrayIndexOutOfBoundsException: Index -10 out of bounds for length 2
    }

    @Test
    public void whichTrueForThisCode() {
        String [][] multiStrArr = new String[][] {
                {"A", "B"},
                null,
                {"Jan", "Feb", null},
        };

        //No value is stored at multiStrArr[2][2] - FALSE it null
        System.out.println("multiStrArr[2][2] = " + multiStrArr[2][2]);
        //Array multiStrArr is asymmetric - TRUE
        //No value is stored at multiStrArr[1][1] - TRUE

        System.out.println("multiStrArr.length = " + multiStrArr.length);
        //multiStrArr.length = 3
        System.out.println("multiStrArr[0].length = " + multiStrArr[0].length);
        //multiStrArr[0].length = 2
        System.out.println("multiStrArr[2].length = " + multiStrArr[2].length);
        //multiStrArr[2].length = 3
    }

    @Test
    void initTwoVariables() {
        int[] ids, types;

        ids = new int[10];
        types = new int[23];    //its int array
    }

    @Test
    void initTwoVariables2() {
        int ids[], types;

        ids = new int[10];
        types = 23; //its int
    }
    
    @Test
    void arrayEquals() {
        int ids[] = new int [10];
        System.out.println("ids.hashCode() = " + ids.hashCode());
        System.out.println("ids.toString() = " + ids.toString());
        //ids.hashCode() = 733672688
        //ids.toString() = [I@2bbaf4f0
        //array it is Object

        String [] bugs = { "cricket", "beetle", "ladybug" };
        System.out.println(
                bugs.toString());
        //[Ljava.lang.String;@76329302

        Integer integers[] = new Integer [10];
        System.out.println("integers.hashCode() = " + integers.hashCode());
        System.out.println("integers.toString() = " + integers.toString());
        //integers.hashCode() = 1579526446
        //integers.toString() = [Ljava.lang.Integer;@5e25a92e

        byte byteArray[] = new byte[]{1,2,127};
        System.out.println("byteArray.hashCode() = " + byteArray.hashCode());
        System.out.println("byteArray.toString() = " + byteArray.toString());
        //byteArray.hashCode() = 1308109015
        //byteArray.toString() = [B@4df828d7
    }


    @Test
    void whenTypeCastingInArray() {
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE

        Assertions.assertThrows(ArrayStoreException.class,
                () -> objects[0] = new StringBuilder());
        //objects[0] = new StringBuilder(); // careful!
        //java.lang.ArrayStoreException
    }

    @Test
    void arrayLength() {
        String strings[] = new String [10];

        System.out.println(strings.length);
        int length = strings.length;
        length = strings.length;
    }

static int[] intsStatic;

    @Test
    void whenToString() {
        int[] ints;
        //System.out.println("ints = " + ints);   //compl error

        System.out.println("intsStatic = " + intsStatic);   //intsStatic = null
    }

    @Test
    void indexAndLengthOfArray() {
        double array[] = new double[10];    //размер массива
        //эллемны в массиве от 0 до 9
        for(int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    @Test
    void arraysSort() {

        int array[] = {1, 3, 0, 4, 3, 0};

        Arrays.sort(array);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        int search = Arrays.binarySearch(array, 0);
        System.out.println("search = " + search);
        search = Arrays.binarySearch(array, 3);
        System.out.println("search = " + search);
        search = Arrays.binarySearch(array, 1);
        System.out.println("search = " + search);
        search = Arrays.binarySearch(array, 0);
        System.out.println("search = " + search);
    }

    @Test
    void equalsVsCompareVsMismatch() {
        int [] arr = {10, 3};
        int [] arr2 = {12, 7};;

        boolean equals = Arrays.equals(arr, arr2);  //false
        System.out.println("equals = " + equals);
        int compare = Arrays.compare(arr, arr2);    //1
        System.out.println("compare = " + compare);
        int mismatch = Arrays.mismatch(arr, arr2);  //0
        System.out.println("mismatch = " + mismatch);

    }

    @Test
    void equalsVsCompareVsMismatch2() {
        int [] arr = {10, 3};
        int [] arr2 = {10, 3};;

        boolean equals = Arrays.equals(arr, arr2);  //true
        System.out.println("equals = " + equals);
        int compare = Arrays.compare(arr, arr2);    //0
        System.out.println("compare = " + compare);
        int mismatch = Arrays.mismatch(arr, arr2);  //-1
        System.out.println("mismatch = " + mismatch);

    }
}
