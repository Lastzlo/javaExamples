package org.example.annotation;

import org.junit.jupiter.api.Test;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Documented //documented to javadoc
@Retention(RetentionPolicy.RUNTIME) //access on Runtime
@Target({ElementType.PACKAGE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface MyAnnotation {
    String value() default "";
}

@MyAnnotation
class ClassThatUseMyAnnotation {
    @MyAnnotation("some text for myField")
    public int myField;

    @MyAnnotation("some text for myPrivateField")
    private int myPrivateField;

    @MyAnnotation
    public void myMethod(){}

    @MyAnnotation("some text for myPrivateMethod")
    private void myPrivateMethod(){}
}


public class CheckForAnnotation {

    @Test
    void accessAnnotationsAtRuntime() {
        //another variant to get class
        //ClassThatUseMyAnnotation anInstance = new ClassThatUseMyAnnotation();
        //Class<? extends ClassThatUseMyAnnotation> aClass = anInstance.getClass();

        Class<ClassThatUseMyAnnotation> clazz = ClassThatUseMyAnnotation.class;

        // Target: Package
        boolean isPackageAnnotationPresent =
                clazz.getPackage().isAnnotationPresent(MyAnnotation.class);
        assertTrue(isPackageAnnotationPresent);

        // Target: Type
        boolean isTypeAnnotationPresent =
                clazz.isAnnotationPresent(MyAnnotation.class);
        assertTrue(isTypeAnnotationPresent);


        //Method method = clazz.getMethod("myMethod");    //compl erroer - если не обработать исключение
        // Target: Method
        try {
            Method method = clazz.getMethod("myMethod");
            boolean isMethodAnnotationPresent =
                    method.isAnnotationPresent(MyAnnotation.class);
            assertTrue(isMethodAnnotationPresent);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // Target: Field
        try {
            Field field = clazz.getField("myField");
            boolean isFieldAnnotationPresent =
                    field.isAnnotationPresent(MyAnnotation.class);
            assertTrue(isFieldAnnotationPresent);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

    @Test
    void accessToPrivateMethodAndField() {
        //another variant to get class
        //ClassThatUseMyAnnotation anInstance = new ClassThatUseMyAnnotation();
        //Class<? extends ClassThatUseMyAnnotation> aClass = anInstance.getClass();

        Class<ClassThatUseMyAnnotation> clazz = ClassThatUseMyAnnotation.class;

        // Target: Method
        try {
            Method method = clazz.getDeclaredMethod("myPrivateMethod");
            method.setAccessible(true);
            boolean isMethodAnnotationPresent =
                    method.isAnnotationPresent(MyAnnotation.class);
            assertTrue(isMethodAnnotationPresent);

            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // Target: Field
        try {
            Field field = clazz.getDeclaredField("myPrivateField");
            field.setAccessible(true);
            boolean isFieldAnnotationPresent =
                    field.isAnnotationPresent(MyAnnotation.class);
            assertTrue(isFieldAnnotationPresent);

            MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
            System.out.println("annotation = " + annotation);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

}
