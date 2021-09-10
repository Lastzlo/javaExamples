package org.example.java.util.tasks.collections.Map;

public class CollisionKey2 {

    private int A;
    private int B;

    public CollisionKey2(int a, int b) {
        A = a;
        B = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollisionKey2 collisionKey = (CollisionKey2) o;
        return hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return (A + B);
    }
}
