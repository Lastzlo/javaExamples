package org.example.java.lang;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharVariableTest {

    //char from '\u0000' (or 0) to '\uffff' (or 65_535 inclusive)

    /**
     * Числа с плавающей точкой
     *
     * При присвоении переменной типа float дробного литерала с плавающей точкой,
     * например, 3.1, 4.5 и т.д., Java автоматически рассматривает этот литерал как значение
     * типа double. И чтобы указать, что данное значение должно рассматриваться как float,
     * нам надо использовать суффикс f
     * */
    @Test
    public void CharVariableDeclaration() {

        char letterF = 102; // символ 'f'
        System.out.println("letterF = " + letterF);

        assertTrue(Character.isLowerCase(letterF));
        System.out.println("(int) letterF = " + (int) letterF);


        //Кроме символов, которые представляют буквы, цифры, знаки препинания,
        // прочие символы, есть специальные наборы символов, которые называют
        // управляющими последовательностями. Например, самая популярная
        // последовательность - "\n". Она выполняет перенос на следующую строку. Например:
        String text = "Hello \nworld";  // '\n' - символ переноса
        System.out.println(text);

        char letter = '\u0000';
        System.out.println("letter = " + letter);


    }



    //A character preceded by a backslash (\) is an escape sequence and has a special meaning to the compiler.
    //
    //The newline character (\n) has been used frequently in this tutorial in System.out.println() statements to advance to the next line after the string is printed.

    /**
     * Escape       Description
     * Sequence
     * \t	        Inserts a tab in the text at this point.
     * \b	        Inserts a backspace in the text at this point.
     * \n	        Inserts a newline in the text at this point.
     * \r	        Inserts a carriage return in the text at this point.
     * \'	        Inserts a single quote character in the text at this point.
     * \"	        Inserts a double quote character in the text at this point.
     * \\	        Inserts a backslash character in the text at this point.
     * */
    @Test
    public void EscapeSequencesTest() {

        // \t  - Inserts a tab
        System.out.println("She said \tHello! to me.");

        // \b  - Inserts a backspace
        String backspace = "She said Hell\b\b\bo! to me.";  //  She said Ho! to me.
        System.out.println(backspace);

        //Разница между \ n и \ r
        //  \ r  и \ n - символы, обозначенные значениями ASCII 13 (CR) и 10 (LF) соответственно.
        //  Оба они представляют собой разрыв между двумя строками , но операционные системы используют их по-разному.

        // \n   - начать с новой строки, лучше использовать System.lineSeparator
        System.out.println("She said \nHello to me.");

        // \r, передвигает каретку в начало, лучше использовать System.lineSeparator
        System.out.println("She said \rHello! to me.");    //   Hello! to me.

        System.out.println("She said \'Hello!\' to me.");      // \'

        System.out.println("She said \"Hello!\" to me.");      // \"

        System.out.println("She said \\Hello! to me.");      // \\

    }



    @Test
    public void LineSeparatorExample_thenCharIntNumber() {
        //System.lineSeparator() возвращает символ разрыва строк подходящий для ОС
        //  либо
        //System.getProperty(“line.separator”) возвращает символ разрыва строк подходящий для ОС
        assertEquals(System.lineSeparator(), System.getProperty("line.separator"));

        String s = System.lineSeparator();  // \r\n

        assertEquals(13, s.toCharArray()[0], "its char 13"); // \r
        assertEquals(10, s.toCharArray()[1], "its char 10"); // \n

    }

    @Test
    public void LineSeparatorExample() {

        //a carriage return
        final char carriageReturn = 13; // \r
        //a newline
        final char newline = 10;    // \n

        String line1 = "First conversation.";
        String line2 = "Second conversation.";

        // "First conversation." + \r + "Second conversation."
        // result:  Second conversation.
        String rhyme = line1 + carriageReturn + line2;
        System.out.println("rhyme = " + rhyme);

        // "First conversation." + \n + "Second conversation."
        // result:  First conversation.
        //          Second conversation.
        rhyme = line1 + newline + line2;
        System.out.println("rhyme = " + rhyme);

    }
    
    @Test
    public void MultiplyCharPlusNumber() {

        System.out.println("(int) 'a' = " + (int) 'a');
        System.out.println("(int) 'b' = " + (int) 'b');
        System.out.println("(int)('a' + 'b') = " + (int)('a' + 'b'));
        
        System.out.println("(('a' + 'b') * 3.2) = " + (('a' + 'b') * 1.5));
        
        
    }

    @Test
    public void charSum() {
        char c1 = '1';      //49
        char c2 = '\u0031'; //49
        char c3 = 49;       //49
        System.out.println(c1 + c2 + c3);   //147
        //Пояснение: Важно знать, что значение для переменной типа char можно задать несколькими способами: непосредственно символом, unicode-кодом этого символа, а также целым числом. Так же важно знать, что значения типа char не "склеиваются", а суммируются.
    }


}
