package org.example.oop.classesAndObjects.accessmodifiers.package1;

import org.example.oop.classesAndObjects.accessmodifiers.package2.PublicClass2;
import org.junit.jupiter.api.Test;

public class TestAccessToMethods {
    @Test
    public void TestRunMethodsOfClassFromSamePackage_whenClassWithoutModifiers() {
        ClassWithoutModifiers1 class1 = new ClassWithoutModifiers1();
        //only protected and public
        class1.runProtectedMethod();
        class1.runPublicMethod();
        //has private access
        //class1.runPrivateMethod();

    }

    @Test
    public void TestRunStaticMethodsOfClassFromSamePackage_whenClassWithoutModifiers() {
        //only protected and public
        ClassWithoutModifiers2.runStaticProtectedMethod();
        ClassWithoutModifiers2.runStaticPublicMethod();
        //has private access
        //ClassWithoutModifiers2.runStaticPrivateMethod();

    }

    @Test
    public void TestRunStaticMethodsOfClassFromOtherPackage_whenClassWithoutModifiers() {
        //        is not public in 'org.example.oop.classesAndObjects.accessmodifiers.package2'. Cannot be accessed from outside package
        //ClassWithoutModifiersFromOtherPackage2.runStaticProtectedMethod();
        //ClassWithoutModifiersFromOtherPackage2.runStaticPublicMethod();

    }

    @Test
    public void TestRunMethodsOfClassFromOtherPackage_whenClassPublic() {
        PublicClass2 class1 = new PublicClass2();
        //public
        class1.runPublicMethod();
        //withoutModifier is not public
        //class1.runMethodWithoutModifier();
        //has protected access
        //class1.runProtectedMethod();
        //has private access
        //class1.runPrivateMethod();
    }
}
