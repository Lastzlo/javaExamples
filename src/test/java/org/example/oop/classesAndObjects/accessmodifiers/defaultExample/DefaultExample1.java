package org.example.oop.classesAndObjects.accessmodifiers.defaultExample;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class DefaultExample1 {

    @Test
    public void run_defaultMethodDebugFromDebuggable() {
        Main m = new Main();
        System.out.println(m.debug());
    }

}

class Main implements Debuggable {
    int a = 100;
    String b = "Home";

}

interface Debuggable {
    //default method in interface, this method we can don`t realize
    default String debug() {
        StringBuilder sb = new StringBuilder(this.getClass().getName());
        sb.append(" [ ");
        Field[] fields = this.getClass().getDeclaredFields();
        for(Field f: fields) {
            f.setAccessible(true);
            try {
                sb.append(f.getName() + " = " + f.get(this));
                sb.append(", ");
            } catch (IllegalArgumentException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
