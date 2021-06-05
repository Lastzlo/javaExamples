package org.example.java.lang.Exceptions;

import org.junit.jupiter.api.Test;

/**ExceptionHandling with MethodOverriding in Java*/
public class ExceptionTest2 {
}


class Parent{
    protected void msg(){System.out.println("Parent msg");}

    void print() throws Exception {System.out.println("Parent print");}

}


class TestExceptionChild extends Parent{

    /**1) Rule: If the superclass method does not declare an exception,
     * subclass overridden method cannot declare the checked exception.*/
    //Compile Time Error, because method throw in Parent does not throws IOException
//    void msg()throws IOException {
//        System.out.println("TestExceptionChild");
//    }



    @Test
    public void run_msg() {
        Parent p = new TestExceptionChild();
        p.msg();    //Parent msg
    }

    /**Subclass overridden method can be without exception*/
    void print() {
        System.out.println("Child print");
    }

    @Test
    public void print_whenNeedDeclareException() {

        //we want to declare try{} catch OR throws Exception in head,
        //because Parent.print() have throws Exception
        try {
            Parent parent = new TestExceptionChild();   //!!!
            parent.print();   //Child print
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void print_whenDontNeedDeclareException_becauseCastToChild() {
        //we dont declare try{} catch OR throws Exception in head,
        //because we cast to Child
        Parent parent = new TestExceptionChild();   //!!!
        ((TestExceptionChild)parent).print();   //Child print
    }

    @Test
    public void print_whenDontNeedDeclareException() {
        //we dont declare try{} catch OR throws Exception in head,
        //because child.print() have not throws Exception
        TestExceptionChild child = new TestExceptionChild();
        child.print();    //Child print
    }




}





