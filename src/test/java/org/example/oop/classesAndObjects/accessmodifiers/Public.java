package org.example.oop.classesAndObjects.accessmodifiers;

import org.example.oop.classesAndObjects.ConstructorsForClasses;

public class Public {
    public Public() {
        SuperPublic.defaultMethod();

        //cannot access from other package, Person not public
        //Person person = new Person();

        //cannot access from other package, Person not public
        //'org.example.oop.classesAndObjects.Person'
        // is not public in 'org.example.oop.classesAndObjects'.
        // Cannot be accessed from outside package
        // Person.printHello();
        // Person.main();

        //'ConstructorsForClasses()' is not public
        // in 'org.example.oop.classesAndObjects.ConstructorsForClasses'.
        // Cannot be accessed from outside package
        //ConstructorsForClasses constructors = new ConstructorsForClasses();

        //'ConstructorsForClasses(int)' is public
        ConstructorsForClasses constructors2 = new ConstructorsForClasses(12);
    }
}
