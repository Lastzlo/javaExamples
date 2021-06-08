package org.example.java.lang.tasks;

import org.junit.jupiter.api.Test;

public class PrimitiveTasks1 {
    @Test
    public void whereWillBeCompilerError() {
        double var1 = 356f; //float low than double
        float var2 = 13f;

        char var3 = (char) 13f; //need to cast because, float biggest than char
        int var4 = (int)23f;    //need to cast because, float biggest than int
    }
}
