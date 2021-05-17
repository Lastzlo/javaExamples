package org.example.oop.classesAndObjects;



class Bicycle {




}

class Person{

    String name;    // имя
    int age;        // возраст

    //блок инициализации, начальную инициализацию объекта можно проводить
    // с помощью инициализатора объекта
    {
        name = "Undefined";
        age = 18;
    }


    //конструктор без параметров
    public Person(){

    }
    Person(String name){

        this.name = name;
    }
    Person(String name, int age){

        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

     public static void printHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}

public class ConstructorsForClasses {

    //constructor ConstructorsForClasses() - not public,
    // ConstructorsForClasses() is accessible in another class of the same package
    ConstructorsForClasses() {

    }

    public ConstructorsForClasses(int i) {

    }

}
