package org.example.java.lang.tasks;

import org.junit.jupiter.api.Test;

public class PrimitiveTasks1 {
    @Test
    public void whereWillBeCompilerError() {
        double var1 = 356f; //float low than double
        float var2 = 13f;

        char var3 = (char) 13f; //need to cast because, float biggest than char
        int var4 = (int)23f;    //need to cast because, float biggest than int

        //int num= _2_3;
        int num= 0b10;
        int num2 = 0xA_21;
        //int num= _2_3;

        long b = 54L;
        float f = 4f;
        float f_2 = 4.0f;
        double d_1 = 4.0f;
        double d_2 = 4d;

    }
}
