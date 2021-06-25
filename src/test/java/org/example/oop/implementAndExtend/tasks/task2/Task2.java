package org.example.oop.implementAndExtend.tasks.task2;

class A { }
class B extends A { }
class C extends B { }

class Client {
    B SomeMethod( ) { return new B( ); }
}
class SpecificClient extends Client {
    //Task: What we can use in OUT param and return
    public B SomeMethod( ) { return new C(); }
}

public class Task2 {
}
