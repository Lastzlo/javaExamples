package org.example.oop.classesAndObjects.accessmodifiers.package1;

//is not public
//import org.example.oop.classesAndObjects.accessmodifiers.package2.ClassWithoutModifiersFromOtherPackage1;
//is not public
//import org.example.oop.classesAndObjects.accessmodifiers.package2.ClassWithoutModifiersFromOtherPackage2;
import org.example.oop.classesAndObjects.accessmodifiers.package2.PublicClass2;
import org.junit.jupiter.api.Test;

public class TestAccessToConstructors {
    @Test
    public void TestCreateObjectOfClassFromSamePackage_whenClassPublic() {
        PublicClass1 publicClass1 = new PublicClass1();
    }

    @Test
    public void TestCreateObjectOfClassFromOtherPackage_whenClassPublic() {
        PublicClass2 publicClass2 = new PublicClass2();
    }


    @Test
    public void TestCreateObjectOfClassFromSamePackage_whenClassWithoutModifiers() {
        ClassWithoutModifiers1 classWithoutModifiers1 = new ClassWithoutModifiers1();
        ClassWithoutModifiers2 classWithoutModifiers2 = new ClassWithoutModifiers2();
    }

    @Test
    public void TestCreateObjectOfClassFromOtherPackage_whenClassWithoutModifiers() {
//        is not public in 'org.example.oop.classesAndObjects.accessmodifiers.package2'. Cannot be accessed from outside package
//        ClassWithoutModifiersFromOtherPackage1 class = new ClassWithoutModifiersFromOtherPackage1();
    }

}
