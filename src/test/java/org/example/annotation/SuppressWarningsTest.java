package org.example.annotation;

import org.junit.jupiter.api.Test;

import java.util.TreeSet;

public class SuppressWarningsTest {
    /*Example (of unchecked warning in conjunction with raw types)*/
    @Test
    public void exampleUncheckedWarning() {
        TreeSet set = new TreeSet();
        //warning:
        // [unchecked] unchecked call to add(E) as a member of the raw type java.util.TreeSet
        set.add("abc");        // unchecked warning
        set.remove("abc");
    }

    @Test
    // If we comment below annotation, program generates
    // warning
    @SuppressWarnings("unchecked")
    public void exampleUncheckedWarning_withAnnotation() {
        TreeSet set = new TreeSet();
        set.add("abc");
        set.remove("abc");
    }
}



