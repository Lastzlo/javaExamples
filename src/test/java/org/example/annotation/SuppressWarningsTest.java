package org.example.annotation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SuppressWarningsTest {

    //нету ошибки
    // а должна была быть
    @Test
    public void addVersion_withoutAnnotation() {
        new Machine().addVersion("word");

    }

    /*Example (of unchecked warning in conjunction with raw types)*/
    //нету ошибки warning: [unchecked] unchecked call to add(E) as a member of the raw type java.util.TreeSet
    //               set.add("abc");
    // а должна была быть
    @Test
    public void exampleUncheckedWarning() {
        TreeSet set = new TreeSet();
        set.add("abc");        // unchecked warning
        set.remove("abc");
    }
}

class Machine {
    private List versions;

    public Machine() {
        versions = new ArrayList();
    }

    public void addVersion(String version) {
        versions.add(version);
    }
}

