package org.example.oop.classesAndObjects.accessmodifiers.package2;

class ClassWithoutModifiersFromOtherPackage1 {
    public void runPublicMethod() {
        System.out.println("runPublicMethod");
    }

    protected void runProtectedMethod() {
        System.out.println("runProtectedMethod");
    }

    private void runPrivateMethod() {
        System.out.println("runPrivateMethod");
    }
}

class ClassWithoutModifiersFromOtherPackage2 {
    static public void runStaticPublicMethod() {
        System.out.println("runStaticPublicMethod");
    }

    static protected void runStaticProtectedMethod() {
        System.out.println("runStaticProtectedMethod");
    }

    static private void runStaticPrivateMethod() {
        System.out.println("runStaticPrivateMethod");
    }
}
