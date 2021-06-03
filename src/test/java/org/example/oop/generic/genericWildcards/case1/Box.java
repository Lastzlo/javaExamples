package org.example.oop.generic.genericWildcards.case1;

public class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();

        integerBox.set(Integer.valueOf(100));

        /*java: method inspect in class org.example.oop.generic.genericWildcards.case1.Box<T> cannot be applied to given types;
          required: U
          found:    java.lang.String
          reason: inference variable U has incompatible bounds
            lower bounds: java.lang.Number
            lower bounds: java.lang.String*/
        //integerBox.inspect("some text"); // error: this is still String!

        integerBox.inspect(Integer.valueOf(77));
    }
}
