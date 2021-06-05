package org.example.java.lang.Exceptions.Tasks;

import org.junit.jupiter.api.Test;

public class ExceptionQuestion {
    private int number = 0;

    public void start() throws Exception {
        try {
            number++;       //1
            try {
                number++;   //2
                try {
                    number++;       //3
                    throw new Exception();
                } catch (Exception ex) {
                    number++;               //4
                    throw new Exception();
                }
            } catch (Exception ex) {
                number++;                   //5
            }
        } catch (Exception ex) {
            number++;
        }
    }

    public void display() {
        System.out.println("number = " + number);       // number = 5
    }

    public static void main(String[] args) throws Exception {
        ExceptionQuestion question = new ExceptionQuestion();
        question.start();
        question.display();
    }

    @Test
    public void runMain() {

        try {
            main(new String[0]);
        } catch (Exception ex) {}

    }

}
