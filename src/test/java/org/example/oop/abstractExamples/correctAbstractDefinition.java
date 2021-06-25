package org.example.oop.abstractExamples;

abstract class correctAbstractDefinition {


    //void methodWithBody( );       -- no abstract method should be with body
    void methodWithBody( ) { };

    //abstract void methodWithMissingBody( ) { }    -- abstract should be without body
    abstract void methodWithMissingBody( );
}

class NoAbstractClass {
    //abstract void woof( );   --Abstract method should not be in non-abstract class
}