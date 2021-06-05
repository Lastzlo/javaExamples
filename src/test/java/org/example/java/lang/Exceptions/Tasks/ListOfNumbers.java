package org.example.java.lang.Exceptions.Tasks;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ListOfNumbers {
    /**do it working*/
    //public static void cat(File file) {
    //    RandomAccessFile input = null;
    //    String line = null;
    //
    //    try {
    //        input = new RandomAccessFile(file, "r");
    //        while ((line = input.readLine()) != null) {
    //            System.out.println(line);
    //        }
    //        return;
    //    } finally {
    //        if (input != null) {
    //            input.close();
    //        }
    //    }
    //}

    public static void cat_type1(File file) {
        String line = null;

        try (RandomAccessFile input = new RandomAccessFile(file, "r")){
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        }  catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void cat_type1_thenFileNotFoundException(){
        cat_type1(new File("abraKadabra"));
    }

    @Test
    public void cat_type2_thenFileNotFoundException(){
        cat_type2(new File("abraKadabra"));
    }


    public static void cat_type2(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException fnf) {
            System.err.format("File: %s not found%n", file);
        } catch (IOException io) {
            System.err.println(io.toString());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException io) {

                }
            }
        }
    }

}
