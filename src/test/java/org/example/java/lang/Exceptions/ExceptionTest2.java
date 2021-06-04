package org.example.java.lang.Exceptions;

/**ExceptionHandling with MethodOverriding in Java*/
public class ExceptionTest2 {
}


class Parent{
    void msg(){System.out.println("parent");}
}

/**1) Rule: If the superclass method does not declare an exception,
 * subclass overridden method cannot declare the checked exception.*/
class TestExceptionChild extends Parent{
    //Compile Time Error, because method throw in Parent does not throws IOException
//    void msg()throws IOException {
//        System.out.println("TestExceptionChild");
//    }

    public static void main(String args[]){
        Parent p=new TestExceptionChild();
        p.msg();
    }
}


