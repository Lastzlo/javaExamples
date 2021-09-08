package tasks.quizful.type1;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class questions {

    @Test
    void WhatResult() throws Exception {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ObjectOutputStream oOut = new ObjectOutputStream(bOut);
        Whole object = new Whole();
        oOut.writeObject(object);
        System.out.printf("");
    }
}

class Whole implements Serializable {
    public void writeObject(ObjectOutputStream out) {
        System.out.println("Whole.writeObject()");
    }
}
