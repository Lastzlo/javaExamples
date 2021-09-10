package org.example.java.util.tasks.collections.Map;

public class CollisionKey {

    private int A;
    private int B;

    public CollisionKey(int a, int b) {
        A = a;
        B = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollisionKey collisionKey = (CollisionKey) o;
        return A == collisionKey.A && B == collisionKey.B;
    }

    @Override
    public int hashCode() {
        return (A + B);
    }
}
