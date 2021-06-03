package org.example.oop.generic.typeInferenceAndGenericConstructors;

public class MyClass<X> {

//not working

//    public static <T> T returnValue (T value) {
//        System.out.println("value.getClass().getName() = " + value.getClass().getName());
//        return value;
//    }
//
//    private X xVar;
//
//    public <T> MyClass(T tVar, X xVar) {
//        System.out.println("tVar.getClass().getName() = " + tVar.getClass().getName());
//    }
//
//    public MyClass() {}
//
//    public static <T> void myMethod(T var) {
//        System.out.println("var.getClass().getName() = " + var.getClass().getName());
//    }
//
//
//    @Test
//    public void create1() {
//        new MyClass<String>(123, "word");
//    }
//    @Test
//    public void create2() {
//        MyClass<String> myObject = new MyClass<>("word", "word");
//    }
//
//    @Test
//    public void runMyMethod_withString() {
//        MyClass.<String>myMethod("word");
//    }
//
//    @Test
//    public void runMyMethod_withInteger() {
//        MyClass.<Integer>myMethod(123);
//    }
//
//    @Test
//    public void runMyMethod_withoutGeneric_butPutString() {
//        MyClass.myMethod("word");
//    }
//
//    @Test
//    public void runMyMethod_withoutGeneric_butPutInteger() {
//        MyClass.myMethod(123);
//    }
//
//    @Test
//    public void returnValue_whenString() {
//        String word = MyClass.returnValue("word");
//
//        MyClass<Integer> integerMyClass = MyClass.returnValue(new MyClass<Integer>());
//    }

}
