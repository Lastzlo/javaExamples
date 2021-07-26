package org.example.oop.implementAndExtend.tasks.task4;

public class Base {
    public int getValue() {
        return 100;
    }

    public Base getBase() {
        return new Base();
    }
}

class Derived extends Base {
    //не можна міняти тип повернення на інший тип, тілки на його нащадок
    public Derived getBase() {
        return new Derived();
    }




    //todo attempting to use incompatible return type
//    public byte getValue() {
//        return 5;
//    }

    //todo attempting to use incompatible return type
//    public int getValue() {
//        return 500;
//    }

}