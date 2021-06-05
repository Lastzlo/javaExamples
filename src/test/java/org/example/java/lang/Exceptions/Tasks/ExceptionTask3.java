package org.example.java.lang.Exceptions.Tasks;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ExceptionTask3 {
    //обязательно нужно throws IOException потому что это наследник Exception
    //If you are calling a method that declares an exception, you must either caught or declare the exception.
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }
    void n() throws IOException {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }

    @Test
    public void run_p_method(){
        ExceptionTask3 obj=new ExceptionTask3();
        obj.p();
        System.out.println("normal flow");
    }
}
