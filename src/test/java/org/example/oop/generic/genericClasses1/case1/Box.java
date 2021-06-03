package org.example.oop.generic.genericClasses1.case1;

/*Type Parameter Naming Conventions*/
/*The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
*/


/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box <T> {
    // T stands for "Type"
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
