package org.example.oop.classesAndObjects;


import org.junit.jupiter.api.Test;

class DataArtist {

    public void draw(String s) {

    }
    public void draw(int i) {

    }
    public void draw(double f) {

    }
    public void draw(int i, double f) {

    }


// не может быть 2 метода с одинаковыми именами и входными параметрами,
// даже если у них разный return (void, int, String)
//    public int draw(int i, double f) {
//
//    }


    public void print(float ... args) {
        System.out.println("float print");
    }

    public void print(double ... args) {
        System.out.println("double print");
    }

    public void print(byte ... args) {
        System.out.println("byte print");
    }

    public void print(int ... args) {
        System.out.println("int print");
    }


}


class Demo {
    public void show(int x)
    {
        System.out.println("In int" + x);
    }
    public void show(String s)
    {
        System.out.println("In String" + s);
    }
    public void show(byte b)
    {
        System.out.println("In byte" + b);
    }
}


public class OverloadingMethods {

    @Test
    void OverloadingAndAmbiguityInVarargs() {
        DataArtist dataArtist = new DataArtist();

        dataArtist.print();   //at the result
    }

    //Question Arises:
    //What if the exact prototype does not match with arguments.
    //
    //Priority wise, compiler take these steps:
    //Type Conversion but to higher type(in terms of range) in same family.
    //Type conversion to next higher family(suppose if there is no long data type available for an int data type, then it will search for the float data type).
    //
    //which method will be executed if the exact prototype does not match the arguments?
    @Test
    public void whichMethodWillBeExecuted_test1() {
        Demo obj = new Demo();

        obj.show('A'); // Since char is
        // not available, so the datatype
        // higher than char in terms of
        // range is int.


    }

    @Test
    public void whichMethodWillBeExecuted_test2() {
        Demo obj = new Demo();

        //obj.show(7.5); // since float datatype
        // is not available and so it's higher
        // datatype, so at this step their
        // will be an error.


    }
}
