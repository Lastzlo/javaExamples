package org.example.oop.classesAndObjects;

// импорт всех методов из класса org.junit.jupiter.api.Assertions
//org.junit.jupiter.api.Assertions;

// импорт всех классов из пакета org.junit.jupiter.api
//import org.junit.jupiter.api.*;

// импорт статических метода assertEquals класса org.junit.jupiter.api.Assertions,
// теперь можно вызывать его без Assertions.
//import static org.junit.jupiter.api.Assertions.assertEquals;

// импорт статических методов класса org.junit.jupiter.api.Assertions,
// а также можно теперь их вызывать без Assertions.
//import static org.junit.jupiter.api.Assertions.*;


public class packagesImport {
    @org.junit.jupiter.api.Test
    public void staticImportFullName() {
        org.junit.jupiter.api.Assertions.assertEquals(3, 3);
    }


}
