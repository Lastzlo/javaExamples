package org.example.oop.classesAndObjects.accessmodifiers.package1;

class ClassWithoutModifiers1 {
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

class ClassWithoutModifiers2 {
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
